package com.practice.controller;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.practice.model.Product;
import com.practice.model.User;
import com.practice.model.Users;

@Controller
public class MyController {

	
	@RequestMapping(method = RequestMethod.GET, value="/users/{id}",produces= {"application/json"})
    public @ResponseBody User getUserById(@PathVariable String id)
    {
        User user = new User();
        user.setFirstName("john");
        user.setLastName("adward");
        return user;
    }
 
    @RequestMapping(method = RequestMethod.GET, value="/users", produces= {"application/json"})
    public @ResponseBody Users getAllUsers()
    {
        User user1 = new User();
        user1.setFirstName("john");
        user1.setLastName("adward");
 
        User user2 = new User();
        user2.setFirstName("tom");
        user2.setLastName("hanks");
 
        Users users = new Users();
        users.setUsers(new ArrayList<User>());
        users.getUsers().add(user1);
        users.getUsers().add(user2);
 
        return users;
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/file-upload",consumes=MediaType.MULTIPART_FORM_DATA_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody User fileUpload(@RequestBody Product product) {
    	
//    	MultipartFile images = product.getImages();
//    	
//    	if(images != null ) {
////    		for(MultipartFile multipartFile : images) {
//    			String fileName = images.getOriginalFilename();
//    			File file = new File("/home/unnamed/images/",fileName);
//    			try {
//    				images.transferTo(file);
//    			}catch(IOException e) {
//    				e.printStackTrace();
//    			}
////    		}
//    	}
    	
    	User user = new User();
    	user.setFirstName(product.getName());
    	user.setLastName(product.getDescription());
    	return user;
    }
}

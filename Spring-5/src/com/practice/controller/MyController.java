package com.practice.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.User;

@Controller
public class MyController {

	
	private MessageSource messageSource;
	
	@Autowired
	public void setMessageSource(MessageSource messageSource) 
	 {
	  this.messageSource = messageSource;
	 }
	
	@ResponseBody
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello!!";
	}
	
	@RequestMapping(value="/save-data", method=RequestMethod.POST)
	public String saveData(HttpServletRequest servletRequest,
            @ModelAttribute User user,
            Model model) {
		
		List<MultipartFile> files = user.getImages();
		List<String> fileNames = new ArrayList<String>();
		
		if(files != null && files.size()>0) {
			for(MultipartFile multipartFile : files) {
				String fileName = multipartFile.getOriginalFilename();
				fileNames.add(fileName);
				
				File file = new File(messageSource.getMessage("storage.local", null, "Default!", null),fileName) ;
				
				try {
					multipartFile.transferTo(file);
				} catch(IOException e) {
					e.getStackTrace();
				}
			}
		}
//		model.addAttribute("realPath","hello : "+messageSource.getMessage("storage.local", null, "Default!", null));
		model.addAttribute("user", user);
		
		return "saveData";
	}
	
    @RequestMapping(value = "/product-input-form", method=RequestMethod.GET)
    public ModelAndView inputProduct() {
        return new ModelAndView("productInputForm","user",new User());
    }
}

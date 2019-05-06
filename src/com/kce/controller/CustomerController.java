package com.kce.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.kce.model.Customer;

@Controller
public class CustomerController {
	@RequestMapping(value="/",method= RequestMethod.GET)
	public ModelAndView doStart(){
		return new ModelAndView("customer");
	}
	
	@RequestMapping(value="/add",method= RequestMethod.POST)
   public ModelAndView doAdd(@ModelAttribute Customer  customer,Map<String,String> map)
   {
		map.put("id",Integer.toString(customer.getCustId()));
		map.put("name", customer.getCustName());
		map.put("address", customer.getAddress());
		
		
		return new ModelAndView("success");
		
   }
   
}
	
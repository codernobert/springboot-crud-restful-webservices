package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
    @RequestMapping("portfolio")
	public String home()
	{
		System.out.println("hi");
		return "portfolio";
	}
    
    @RequestMapping("cv")
    public String cv()
    {
    	return "cv";
    }
    
}


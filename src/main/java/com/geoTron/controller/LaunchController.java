package com.geoTron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaunchController
{
	 @RequestMapping("/launch")
	  public String index() {
	    return "index.html";
	  }
}

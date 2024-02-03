
package com.lti.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/univ-api")
public class TestController {
	
	//http://localhost:8081/Spring_6MVC/univ-api/showMsg
	
	@RequestMapping("/showMsg")	
	@ResponseBody
	public String showMsg()
	{
		return "Welcome to Fisrt Spring MVC demo";
	}
	
	//http://localhost:8282/Spring_6MVC/univ-api/welcome
		
	@RequestMapping("/welcome")
	@ResponseBody
	public String showWelcome()
	{
		return "Hello Welcome";
	}

	
	//http://localhost:8282/Spring_6MVC/univ-api/helloUser/102
	
	@RequestMapping("/helloUser/{pid}")
	@ResponseBody	
	public String helloUser(@PathVariable("pid") int userId)
	{
		return "Hello User " + userId + "" ;
	}
	
	//http://localhost:8281/Spring_6MVC/univ-api/StudentForm
	
	@RequestMapping("/StudentForm")
	public  ModelAndView   getForm()
	{
		ModelAndView mv= new ModelAndView("StudentForm");   // /WEB-INF/jsps/StudentForm.jsp
		return mv;
	}
	
	//http://localhost:8282/Spring_6MVC/univ-api/SubmitForm
	
	
	@RequestMapping("/SubmitForm")
	public ModelAndView showForm(@RequestParam("stuName") String sname,@RequestParam("subject") String subject )
	{
		//System.out.println(sname +" " + subject );
		
		String str =sname+ " "+subject ;
		
		ModelAndView mv= new ModelAndView("SubmitForm");//resolver
		mv.addObject("mydata" ,str);
		
		return mv;
	}
	
	/*  this code is removed from pom.xml file
	 *  <dependency>
     <groupId>jstl</groupId>
     <artifactId>jstl</artifactId>
     <version>1.2</version>
 </dependency>


-- this code is removed from  submitform.jsp
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}

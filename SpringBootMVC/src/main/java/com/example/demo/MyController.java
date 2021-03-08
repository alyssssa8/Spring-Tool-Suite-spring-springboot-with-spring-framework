package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;



@Controller
public class MyController {
	// do not have to go through main, just use URL
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
//	create a ModelAndView
	
//	@RequestMapping("/add") //matched with form action
//	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int num3 = i + j;
//		mv.addObject("num3", num3);//“num3" is for the result
//		return mv;	
//	}
	
//	same as above
//	Model
	
//	@RequestMapping("/add")
//	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
//		
//		int num3 = i + j;
//		m.addAttribute("num3", num3);
//		return "result";	
//	}
	
//	same as above
//	ModelMap
	
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {
		//modelmap like hash map, key and value. 
		int num3 = i + j;
		m.addAttribute("num3", num3);
		return "result";	
	}
	
	
	
// added to the model, with work with /add and /addUser
	@ModelAttribute
	public void addmodel(Model m) {
		m.addAttribute("name", "Gauttam");
	}
	
	@RequestMapping("/addUser")
	// could have int to String, but not string to int. 
	//	if used method post, then can not use @RequestParam
	
	public String addUser(@RequestParam("uid") String i, User u, Model m) {
		m.addAttribute("user", u);
		System.out.println(i);
		return "result";
	}
	
//	@RequestMapping("/addUser2")
//	public String addUser(@ModelAttribute User u, Model m) {
//		m.addAttribute("user", u);
//		return "result";
//	}
	
	
	//same as above

//
//	@RequestMapping("/addUser2")
//	public String addUser3(@ModelAttribute User u, Model m) {
//		m.addAttribute("user", u);
//		return "result";
//	}
	

//	@RequestMapping("/addUser2")
//	public String addUser3(User u, Model m) {
//		m.addAttribute("user", u);
//		return "result";
//	}
//	

//	
//	//same as above
//	@RequestMapping("/addUser2")
//	public String addUser3(User u, Model m) {
////		m.addAttribute("user", u);
//		return "result";
//	}
	
	


//	same as above
	
	@RequestMapping("addUser2")
	public String addUser(User u) {
		return "result";
	}
	
	
	
//	@PostMapping(value="addUser2")
//	public String addUser(User u, Model m) {
//		m.addAttribute(u);
//		return "result";
//	}
//

	
//	@RequestMapping(value ="addUser2",method=RequestMethod.POST)
//	public String addUser(User u) {
//		return "result";
//	}
	
//	@PostMapping(value ="addUser2")
//		return "result";
//	}
	
//	@RequestMapping(value="addUser2")
//	public String addUser(User u) {
//		return "result";
//	}
	
//	@GetMapping(value="addUser2")
//	public String addUser(User u) {
//		return "result";
//	}
	
	@Autowired
	UserRepo repo;
	
	

//***************************************************************	
	
	
//	@GetMapping("getUser"）
//	public String getUser(Model m) {
//		List<User> user = Arrays.asList(new User(101,"Gauttam"),new User( 102,"Robert"));
//		m.addAttribute("result", user);
//		return "showUser";
//	}
	
	


	@GetMapping("getUsers")
	public String getUsers(Model m) {
		
		m.addAttribute("result", repo.findAll());
		
		return "showUser";
	}
	
	@GetMapping("getUser")
	public String getUser(@RequestParam int uid, Model m) {
		
		m.addAttribute("result", repo.getOne(uid));
		
		return "showUser";
	}
	
	@PostMapping("addUsers")
	public String addUsers(@ModelAttribute User u) {
		repo.save(u);
		return "result";
	}
	
	
//	@GetMapping("getUserByUname")
//	public String getUserByUname(@RequestParam String uname,Model m) {
//		m.addAttribute("result", repo.getUserByUname(uname));	
////		m.addAttribute("result", repo.findByUnameOrderByUidAsc(uname));
////		m.addAttribute("result", repo.findByUnameOrderByUidDesc(uname));
//		return "showUser";
//	}
////	hello [User [uid=4, uname=Robot]]
	
	
	@GetMapping("getUserByUname")
	public String getUserByUname(@RequestParam String uname,Model m)
	{
		m.addAttribute("result", repo.find(uname));
		
		return "showUser";
	}
}

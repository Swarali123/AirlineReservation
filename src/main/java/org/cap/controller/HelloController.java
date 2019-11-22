package org.cap.controller;

import org.cap.entities.User;
import org.cap.service.IDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {

	@Autowired
	private IDetailsService service;

	public IDetailsService getService() {
		return service;
	}

	public void setService(IDetailsService service) {
		this.service = service;
	}

	private int i = 0;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("createuser", new HashMap<>());
	}

	/*
	 * @RequestMapping("/hello") public ModelAndView sayHello() { i++; ModelAndView
	 * mv = new ModelAndView("hellopage", "message", "Hello request count=" + i);
	 * return mv; }
	 * 
	 * @RequestMapping(value = "/userdetails",method = RequestMethod.GET) public
	 * ModelAndView userDetails(@RequestParam("id")int id) { User user =
	 * service.findUserById(id); if (user == null) { ModelAndView mv=new
	 * ModelAndView("usernotfound","id",id); return mv; } Map<String, Object>
	 * modelMap = new HashMap<>(); modelMap.put("id", id); modelMap.put("name",
	 * user.getName()); ModelAndView mv = new ModelAndView("userdetails", modelMap);
	 * return mv; }
	 * 
	 * @RequestMapping("/getdetails") public ModelAndView detailsForm() { return new
	 * ModelAndView("detailsform", new HashMap<>()); }
	 */
	@RequestMapping("/createuser")
	public ModelAndView createUserForm() {
		ModelAndView mv = new ModelAndView("createuser");
		return mv;
	}

	/*
	 * @RequestMapping("/deleteuser") public ModelAndView deleteUserForm(){
	 * ModelAndView mv=new ModelAndView("delete"); return mv; }
	 * 
	 * @RequestMapping("/update") public ModelAndView updateUserForm(){ ModelAndView
	 * mv=new ModelAndView("updateuser"); return mv; }
	 */
	@RequestMapping("/createprocess")
	public ModelAndView createProcess(@ModelAttribute("user") User user) {
		service.addUser(user);
		/*
		 * Map<String,Object>map=new HashMap<>(); map.put("id",user.getId());
		 * map.put("name",user.getName());
		 */
		ModelAndView mv = new ModelAndView("usernotfound");
		return mv;
	}
	/*
	 * @RequestMapping("/updateprocess") public ModelAndView
	 * createProcess(@RequestParam Integer id,@RequestParam String name){ User
	 * user=service.updateUser(id,name); Map<String,Object>map=new HashMap<>();
	 * map.put("id",user.getId()); map.put("name",user.getName()); ModelAndView
	 * mv=new ModelAndView("userupdated",map); return mv; }
	 * 
	 * @RequestMapping("/deleteprocess") public ModelAndView
	 * deleteProcess(@RequestParam Integer id){ service.deleteUser(id); ModelAndView
	 * mv=new ModelAndView("deleted"); return mv; }
	 */

	// deleteprocess
	
	
	@RequestMapping("/login")
	public ModelAndView createUserLogin() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
		
	}
		
	@RequestMapping(value="/createLogin", method=RequestMethod.POST)
	public ModelAndView createLogin(ModelMap model,@RequestParam("email") String email,@RequestParam("password") String password) {
		ModelAndView mv=null;
		
		List<User> user=service.getAllUsers();
		if(user.isEmpty())
			System.out.println("is empty");
		for(User u:user)
		{
			System.out.println(u.getEmail());
			
			System.out.println(u.getPassword());
			
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
			System.out.println(u.getEmail());
			System.out.println(u.getPassword());
			mv = new ModelAndView("loginsuccess");
			break;
			
			}
			
		else {
			mv = new ModelAndView("usernotfound");	
		}
		
			
			
			
			
		/*
		 * Map<String,Object>map=new HashMap<>(); map.put("id",user.getId());
		 * map.put("name",user.getName());
		 */
	}
		return mv;}}
		

		
		
		
		
		
		
	


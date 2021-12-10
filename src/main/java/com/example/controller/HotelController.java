package com.example.controller;

import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Client_Information;
import com.example.model.Hotel_Detalils;
import com.example.service.HotelService;

@Controller
public class HotelController {
	@Autowired(required=true)
	HotelService service;
	int id=0;
	@RequestMapping("/")
	public String  display() {
		return "index";
	}

	@RequestMapping(value = "/hotel", method = RequestMethod.GET)

	public String listHotel(Model m) {

		List<Hotel_Detalils> list=service.listHotel();
		m.addAttribute("list",list);  

		return "hotel";
	}@RequestMapping(value= "/search", method = RequestMethod.GET)

	public ModelAndView  searchHotel(){

		return new ModelAndView("searchhotel", "command", new Hotel_Detalils());

	}
	@RequestMapping(value = "/searchhotel", method = RequestMethod.POST)

	public String searchHotel1(Model model,@ModelAttribute("hotel")Hotel_Detalils hotel) {

		List<Hotel_Detalils> list=service.listHotel();
		int length=list.size();

		for(Hotel_Detalils temp:list){
			if(temp.getCity().equals(hotel.getCity())&& temp.getHotel().equals(hotel.getHotel())&& temp.getStatus().equals("Available") ) 
				id=temp.getId();
		}

		if(id!=0) {
			Hotel_Detalils hd=   (Hotel_Detalils)  service.getHotelByName(id);
			hd.setDate(hotel.getDate());
			service.updateHotel(hd);
			model.addAttribute("hotel",hd);  
			return "Result";
		}

		else {
			return "error";
		}

	}




	@RequestMapping(value= "/add", method = RequestMethod.GET)
	@Transactional
	public ModelAndView  addHotel(){

		return new ModelAndView("addhotel", "command", new Hotel_Detalils());

	}
	@RequestMapping(value = "/save1", method = RequestMethod.POST)
	@Transactional
	public ModelAndView addHotel1(@ModelAttribute("hotel") Hotel_Detalils hotel) {

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
		Date date = new Date();  
		hotel.setDate(date);  
		service.addHotel(hotel);

		return new ModelAndView("redirect:/viewadded");

	}
	@RequestMapping(value= "/registration", method = RequestMethod.GET)

	public ModelAndView  registraion(){

		return new ModelAndView("registration", "command", new Client_Information());

	}
	@RequestMapping(value="/bookhotel", method = RequestMethod.POST)    
	public String bookHotel(Model model,@ModelAttribute("ci")Client_Information ci,@ModelAttribute("hotel") Hotel_Detalils hotel){ 
		if(id!=0) {
			Hotel_Detalils hd=   (Hotel_Detalils)  service.getHotelByName(id);
			hd.setStatus("Not Avilable");
			service.updateHotel(hd);
			service.addClient(ci);
			model.addAttribute("hotel",hd); 
			return "status";
		}
		else
		{
			return "ticket"; 
		}
	}   

	@RequestMapping("/viewadded")    
	public String viewhoteladded(Model m){    

		return "viewAdded";    
	}

}
package com.codingdojo.stefano.controladores;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {	
    // definición de clase e importaciones aquí...
    @RequestMapping("/hopper")
    public String index(Model model) {
        
        String name = "Stefano Arias";
        String itemName = "Cadena de oro";
        double price = 1025;
        String description = "Cadena tipo cartier en oro 18k";
        String vendor = "Joyeria Green Facets";
    
    	// ¡Tu código aquí! Agrega valores al modelo de vista que se representará
        
        model.addAttribute("nombre", name);
        model.addAttribute("item", itemName);
        model.addAttribute("precio", price);
        model.addAttribute("descripcion", description);
        model.addAttribute("vendedor", vendor);
    
        return "index.jsp";
    }
    @RequestMapping("/")
    public String inicio(Model model) {
    	return "dashboard.jsp";
    }
    
    @RequestMapping("/date")
    public String date(Model model) {
    	DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM, yyyy");
    	Date date = new Date();
    	String fecha = dateFormat.format(date);
    	model.addAttribute("fecha", fecha);
    	return "date.jsp";
    }
    
    @RequestMapping("/time")
    public String time(Model model) {
    	DateFormat dateFormat = new SimpleDateFormat("h:mm a");
    	Date fecha = new Date();
    	String hora = dateFormat.format(fecha);
    	model.addAttribute("hora", hora);
    	return "time.jsp";
    }
}

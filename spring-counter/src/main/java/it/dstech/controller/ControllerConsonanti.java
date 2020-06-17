package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Service;
@Controller
public class ControllerConsonanti {
	@RequestMapping( value = "/contaConsonanti",method = RequestMethod.POST)
	public ModelAndView parole(@RequestParam("sceltaTesto")String testo,Model model) {
	ModelAndView mod= new ModelAndView();
	mod.setViewName("risultato");
	mod.addObject("sceltaTesto",testo);
	Service service= new Service(testo);
	long risultato= service.contaConsonanti();
	mod.addObject("risultato",risultato);
	
	return mod;
}
}

package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerScelta {
	@RequestMapping( value = "/scelta", method = RequestMethod.POST)
	public ModelAndView scelta (@RequestParam("sceltaTesto")String testo, Model model) {
		ModelAndView modello= new ModelAndView();
		modello.setViewName("sceltaOperazione");
		modello.addObject("sceltaTesto",testo);
		return modello;
		
	}

}

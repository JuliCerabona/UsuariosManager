package net.codejava.usuario;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.*;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		
		List<Usuario> listaUsuarios = service.listAll();
		
		
		mav.addObject("listaUsuarios", listaUsuarios);
		return mav;
	}
	
	@RequestMapping("/new")
	public String nuevoUsuario(Map<String, Object> model)
	{
		Usuario usuario = new Usuario();
	    model.put("usuario", usuario);
	    return "nuevo_usuario";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario)
	{
		service.save(usuario);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editarUsuario(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("editar_usuario");
		Usuario usuario = service.get(id);
		mav.addObject("usuario", usuario);
	 
	    return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteCustomerForm(@RequestParam long id) {
	    service.delete(id);
	    return "redirect:/";       
	}
	
}

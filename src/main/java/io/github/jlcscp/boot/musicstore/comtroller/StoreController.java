package io.github.jlcscp.boot.musicstore.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/store")
public class StoreController {

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String index() {
	     return "Hello from Store.index()";
    }

	@RequestMapping(value="/browse", method=RequestMethod.GET)
	public @ResponseBody String browse(@RequestParam("genre") String genre) {
		return "Hello from Store.browse(), genre = " + genre;
	}
	
	@RequestMapping(value="/details/{id}", method=RequestMethod.GET)
	public @ResponseBody String details(@PathVariable("id") int id) {
		return "Hello from Store.details(), id = " + id;
	}
}

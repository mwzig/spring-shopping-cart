package com.springshoppingcart;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {

	public ItemController() {
		// TODO Auto-generated constructor stub
	}

	@Resource
	ItemRepository repository = new ItemRepository();

	@RequestMapping("/itemList")
	public String getAllItems(Model model) {
		model.addAttribute("itemListKey", repository.findAll()); // val in quotes "courses"
		return "items"; // the html page
	}

	@RequestMapping("/singleItem")
	public String getOneCourse(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("singleItemKey", repository.getItemByName(name));
		return "item"; // the html page
	}

}

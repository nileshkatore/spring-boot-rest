package org.springboot.rest.controller;

import java.util.List;

import org.springboot.rest.model.Item;
import org.springboot.rest.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/banners", method = RequestMethod.GET, produces = "application/json")
	public List<Item> getItems(){
		return this.itemService.getItems();
	}

}

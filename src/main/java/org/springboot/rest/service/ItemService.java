package org.springboot.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springboot.rest.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	public List<Item> getItems(){
		return this.getItemsJson();
	}
	
	private List<Item> getItemsJson(){
		List<Item> items = new ArrayList<>();
		items.add(new Item("title1", "url1", "description1"));
		items.add(new Item("title2", "url2", "description2"));
		items.add(new Item("title3", "url3", "description3"));
		
		return items;
	}
}

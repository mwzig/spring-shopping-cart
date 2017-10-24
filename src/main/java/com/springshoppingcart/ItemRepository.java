package com.springshoppingcart;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ItemRepository {

	protected Map<String, Item> items = new HashMap<String, Item>();

	public ItemRepository() {
		Item item1 = new Item("green beans", "DelMonte", 1.29, 5);
		Item item2 = new Item("corn", "Kroger", 1.29, 5);
		Item item3 = new Item("bread", "Great Value", 3.59, 2);
		Item item4 = new Item("lettuce", "Bolthouse Farms", 0.99, 1);
		Item item5 = new Item("tomatoes", "Jacquemin Farms", 3.99, 6);
		Item item6 = new Item("penne pasta", "Muellers", 3.99, 2);

		items.put(item1.getName(), item1);
		items.put(item2.getName(), item2);
		items.put(item3.getName(), item3);
		items.put(item4.getName(), item4);
		items.put(item5.getName(), item5);
		items.put(item6.getName(), item6);

	}

	Collection<Item> findAll() {
		return items.values();
	}

	Item getItemByName(String name) {
		return items.get(name);
	}

}

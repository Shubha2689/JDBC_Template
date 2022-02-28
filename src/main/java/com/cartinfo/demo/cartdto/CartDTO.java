package com.cartinfo.demo.cartdto;

import lombok.Data;

@Data
public class CartDTO {
	
	int item_id;
	String item_name;
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_deparment() {
		return item_deparment;
	}
	public void setItem_deparment(String item_deparment) {
		this.item_deparment = item_deparment;
	}
	public float getItem_price() {
		return item_price;
	}
	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}
	String item_deparment;
	float item_price;

}

package com.cartinfo.demo.constances;

public class IConstances {
	
	public static final String SELECT_CART_INFO_QUERY="SELECT * from Cart_table";
	public static final String INSERT_QUERY = "insert into Cart_table (item_id, item_name,item_deparment,item_price) values (?,?,?,?)";
	public static final String UPDATE_CART_QUERY = "update Cart_table set item_name=?,item_deparment=?,item_price=? where item_id = ?";
	public static final String DELETE_CART="delete from Cart_table where item_name= ?";

}

package com.cartinfo.demo.cartdao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cartinfo.demo.cartdto.CartDTO;

@Repository
public interface CartDao {
	
	public List<CartDTO> getAlldetails();
	
	public CartDTO updateCart(CartDTO cartDTO);
	
	public CartDTO insertCart(CartDTO cartDTO);
	
	public CartDTO deleteCart(String name);

}

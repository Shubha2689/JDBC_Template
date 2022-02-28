package com.cartinfo.demo.cartservice;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cartinfo.demo.cartdto.CartDTO;

@Component
public interface CartService {
	
	public List<CartDTO> getAlldetails();
	
	public CartDTO updateCart(CartDTO cartDTO);
	
	public CartDTO insertCart(CartDTO cartDTO);
	
	public CartDTO deleteCart(String name);



}

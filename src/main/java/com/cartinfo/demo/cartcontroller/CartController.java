package com.cartinfo.demo.cartcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cartinfo.demo.cartdto.CartDTO;
import com.cartinfo.demo.cartservice.CartService;




@RestController
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@GetMapping("/getAllDetails")
	public List<CartDTO> getCartDetails(@RequestHeader("Authorization") String Authorization) {
		return cartService.getAlldetails();
	}
	
	@PostMapping("/insertCart")	
	public CartDTO insertCart(@RequestBody CartDTO cartDTO) {
		return cartService.insertCart(cartDTO);
	}
	
	@PutMapping("/modifyCart")
	public  CartDTO getModifyCart(@RequestBody CartDTO cartDTO) {
		
		return cartService.updateCart(cartDTO);
		
	}
	
	@DeleteMapping("/deleteCart/{name}")
	public CartDTO deleteCart(@PathVariable ("name") String name) {
		
		return cartService.deleteCart(name);
		
	
	}

}

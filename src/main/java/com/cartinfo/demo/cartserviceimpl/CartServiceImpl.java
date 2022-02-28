package com.cartinfo.demo.cartserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

import com.cartinfo.demo.cartdao.CartDao;
import com.cartinfo.demo.cartdto.CartDTO;
import com.cartinfo.demo.cartservice.CartService;

@Component
public class CartServiceImpl implements CartService{
	@Autowired
	CartDao cartDao;

	@Override
	public List<CartDTO> getAlldetails() {
		
		return cartDao.getAlldetails();
	}

	@Override
	public CartDTO insertCart(CartDTO cartDTO) {
		
		{
		    try {
		    	cartDao.updateCart(cartDTO);
		    	
		    } catch(DuplicateKeyException e) {
		        //Here i want to send "User already exist"
		    } catch(DataAccessException e) {
		        //Here i want to send "Databae unreachable"
		    	
		    	System.out.println("error");
		    }
		}
		
		
		return cartDao.insertCart(cartDTO);
	}

	@Override
	public CartDTO updateCart(CartDTO cartDTO) {
		
		return cartDao.updateCart(cartDTO);
	}

	@Override
	public CartDTO deleteCart(String name) {
		
		return cartDao.deleteCart(name);
	}

}

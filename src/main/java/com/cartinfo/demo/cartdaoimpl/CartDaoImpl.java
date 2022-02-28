package com.cartinfo.demo.cartdaoimpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cartinfo.demo.cartdao.CartDao;
import com.cartinfo.demo.cartdto.CartDTO;
import com.cartinfo.demo.cartmapper.CartMapper;
import com.cartinfo.demo.constances.IConstances;

@Repository
public class CartDaoImpl implements CartDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Logger logger = LoggerFactory.getLogger(CartDaoImpl.class);
	
	@Override
	public List<CartDTO> getAlldetails() {
		
		List<CartDTO> dbRecords = new ArrayList<>();
		
		try {
			 dbRecords = jdbcTemplate.query(IConstances.SELECT_CART_INFO_QUERY ,new CartMapper());
        } catch (BadSqlGrammarException e) {
            System.out.println("DataAccessException->" + e.getMessage() + ",SQL Code->" + ((SQLException)e.getCause()).getErrorCode());
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
        	
        	logger.info("Finishing excetion of getAllDetails...");
          //System.out.println("Goodbye!");
        }
		
		return dbRecords;
		 
	}



	@Override
	public CartDTO updateCart(CartDTO cartDTO) {
		
		//jdbcTemplate.update(IConstances.INSERT_QUERY ,cartDTO.getItem_id(),cartDTO.getItem_name(),cartDTO.getItem_deparment(),cartDTO.getItem_price());
		jdbcTemplate.update(IConstances.UPDATE_CART_QUERY, cartDTO.getItem_name(),cartDTO.getItem_deparment(),cartDTO.getItem_price(),cartDTO.getItem_id());
		
		return cartDTO;
	}
	


	@Override
	public CartDTO insertCart(CartDTO cartDTO) {
		 
		jdbcTemplate.update(IConstances.INSERT_QUERY ,cartDTO.getItem_id(),cartDTO.getItem_name(),cartDTO.getItem_deparment(),cartDTO.getItem_price());
		
		return cartDTO;
	}



	@Override
	public CartDTO deleteCart(String name) {
		int status= jdbcTemplate.update(IConstances.DELETE_CART, name);
		return null;
	
	}

	
}

package com.cartinfo.demo.cartmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cartinfo.demo.cartdto.CartDTO;

public class CartMapper implements RowMapper<CartDTO> {

	@Override
	public CartDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		CartDTO dto = new CartDTO();
		dto.setItem_id(rs.getInt("item_id"));
		dto.setItem_name(rs.getString("item_name"));
		dto.setItem_deparment(rs.getString("item_deparment"));
		dto.setItem_price(rs.getFloat("item_price"));

		return dto;
	}

}
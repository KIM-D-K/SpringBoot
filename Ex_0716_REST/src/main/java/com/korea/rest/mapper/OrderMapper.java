package com.korea.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.vo.OrderVO;

@Mapper
public interface OrderMapper {

	//주문하기
	public void insert(OrderVO orderVO);
	
	//주문내역조회
	public List<OrderDTO> selectAll(String sort);
}

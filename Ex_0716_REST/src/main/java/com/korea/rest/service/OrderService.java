package com.korea.rest.service;

import java.util.List;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.vo.OrderVO;

public interface OrderService {

	public void order(OrderVO orderVO);
	
	public List<OrderDTO> getList(String sort);
}

package com.korea.tier.service;

import java.util.List;

import com.korea.tier.dto.OrderDTO;
import com.korea.tier.vo.OrderVO;

public interface OrderService {

	public void order(OrderVO orderVO);
	
	public List<OrderDTO> getList(String sort);
}

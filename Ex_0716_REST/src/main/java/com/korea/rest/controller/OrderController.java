package com.korea.rest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.rest.dto.OrderDTO;
import com.korea.rest.service.OrderService;
import com.korea.rest.vo.OrderVO;

import lombok.RequiredArgsConstructor;

@RestController
//@RestController
//RestWebAPI를 좀 더 쉽게 만들기 위해 스프링프레임워크 4.0에 도입된 기능
//@Controller와 @ResponseBody를 합쳐놓은 어노테이션
//클래스 이름 위에 @Controller 어노테이션을 선언하면 해당 클래스의 요청하는 컨트롤러로 사용된다.
//@ResponseBody 어노테이션은 자바 객체를 HTTP Response 본문 객체로 변환해 클라이언트에 전송
@RequiredArgsConstructor
@RequestMapping("/order/*")
public class OrderController {

	private final OrderService orderService;
	
	@GetMapping("list/{sort}")
	public List<OrderDTO> list(@PathVariable("sort") String sort){
		System.out.println("sort : " + sort);
		return orderService.getList(sort);
	}
	
	@PostMapping("write")
	public void register(@RequestBody OrderVO orderVO) {
		orderService.order(orderVO);
	}
	
	
}








package com.korea.tier.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.tier.service.ProductService;
import com.korea.tier.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
public class ProductController {

	final ProductService productService;
	
	//@RequestMapping (GET요청과 POST요청 둘 다 받을 수 있다.)
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("productVO", new ProductVO());
		return "product/product-insert";
	}
	
	@PostMapping("register")
	public RedirectView register(ProductVO productVO) {
		//메서드 호출시 선언부 쪽으로 가서 모든 명령을 수행하고 호출한쪽으로 흐름이 돌아온다.
		productService.register(productVO);
		return new RedirectView("list");
	}
	
	@GetMapping("list")
	public String list(Model model) {
		
		//전체조회 메서드
		//상품테이블에 있는 모든 정보를 조회
		List<ProductVO> list = productService.getList();
		
		//model에 바인딩하기
		model.addAttribute("list",list);
		
		return "product/product-list";
	}
	
	
	
}

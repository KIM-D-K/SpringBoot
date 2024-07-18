package com.korea.db.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.korea.db.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;
import vo.ProductVO;

@Controller
@RequiredArgsConstructor
public class ProductController {

	final ProductMapper productMapper;
	
	// @RequestMapping (GET요청과 POST요청 둘 다 받을 수 있다.)
	
	@GetMapping("register")
	public String register(Model model) {
		model.addAttribute("productVO", new ProductVO());
		return "product-insert";
	}
	
	@PostMapping("register")
	public RedirectView register(ProductVO productVO) {
		// 메서드 호출 시 선언부 쪽으로 가서 모든 명령을 수행하고 호출 한 쪽으로 흐름이 돌아온다.
		productMapper.insert(productVO);
		return new RedirectView("list");
	}
	
	@GetMapping("list")
	public String list(Model model) {
		
		// 전체조회 메서드
		// 상품테이블에 있는 모든 정보를 조회
		List<ProductVO> list = productMapper.selectAll();
		
		// model에 바인딩하기
		model.addAttribute("list", list);
		return "product-list";
	}
	
}

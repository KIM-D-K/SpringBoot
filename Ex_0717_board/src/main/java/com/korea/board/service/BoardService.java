package com.korea.board.service;

import java.util.HashMap;
import java.util.List;

import com.korea.board.dao.BoardDAO;
import com.korea.board.vo.BoardVO;

//인터페이스
public interface BoardService {
	
	//추상메서드만 만들수 있음;
	//접근제한자 반환형 함수명(매개변수1,매개변수2...);
	
	//반환형 : 반환하려고 하는 데이터의 타입
	public List<BoardVO> selectList(HashMap<String, Integer> map);
	
	//게시물의 개수를 반환
	public int getRowTotal();
}

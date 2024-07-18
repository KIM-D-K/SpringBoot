package com.korea.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.board.dao.BoardDAO;
import com.korea.board.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor		//구현
public class BoradServiceImpl implements BoardService{
	
	private final BoardDAO boardDAO;

	@Override
	public List<BoardVO> selectList(HashMap<String, Integer> map) {
		return boardDAO.selectList(map);
	}

	@Override
	public int getRowTotal() {
		return boardDAO.getRowTotal();
	}
}
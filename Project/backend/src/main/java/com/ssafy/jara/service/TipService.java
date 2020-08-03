package com.ssafy.jara.service;

import java.util.HashMap;
import java.util.List;

import com.ssafy.jara.dto.Tip;

public interface TipService {

	public int insertTip(Tip tip);
	
	public List<Tip> selectListTip();
	
	public List<Tip> selectListTipTag(int tag_id);
	
	public List<Tip> selectListTipSearch(String searchWord);
	
	public List<Tip> selectListTipTagSearch(HashMap<String, String> hashMap);
	
	public Tip selectTip(int id);
	
	public int updateTip(Tip tip);
	
	public int updateTipHits(int id);
	 
	public int deleteTip(int id);
	
	public int insertTipLike(HashMap<String, Integer> hashMap);
	
	public int selectTipLike(HashMap<String, Integer> hashMap);
	
	public int deleteTipLike(HashMap<String, Integer> hashMap);
	
	public int deleteTipLikes(int tip_id);
}

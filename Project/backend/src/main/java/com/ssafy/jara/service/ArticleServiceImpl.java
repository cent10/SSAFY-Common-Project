package com.ssafy.jara.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.jara.dao.ArticleDao;
import com.ssafy.jara.dto.Article;

@Repository
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleDao articleDao;
	
	@Override
	public int insertArticle(Article article) {
		return articleDao.insertArticle(article);
	}

	@Override
	public List<Article> selectListTotalArticle() {
		return articleDao.selectListTotalArticle();
	}

	@Override
	public List<Article> selectListMyArticle(int writer) {
		return articleDao.selectListMyArticle(writer);
	}
	
	@Override
	public List<Article> selectListArticle(int user_id) {
		return articleDao.selectListArticle(user_id);
	};

	@Override
	public Article selectArticle(int id) {
		return articleDao.selectArticle(id);
	}
	
	@Override
	public int selectArticleLikes(int article_id) {
		return articleDao.selectArticleLikes(article_id);
	};

	@Override
	public int updateArticle(Article article) {
		return articleDao.updateArticle(article);
	}

	@Override
	public int deleteArticle(int id) {
		return articleDao.deleteArticle(id);
	}
	
	@Override
	public int updateArticleShares(int id) {
		return articleDao.updateArticleShares(id);
	}

	@Override
	public int insertArticleLike(HashMap<String, Integer> hashMap) {
		return articleDao.insertArticleLike(hashMap);
	}

	@Override
	public int selectArticleLike(HashMap<String, Integer> hashMap) {
		return articleDao.selectArticleLike(hashMap);
	}

	@Override
	public int deleteArticleLike(HashMap<String, Integer> hashMap) {
		return articleDao.deleteArticleLike(hashMap);
	}

	@Override
	public int deleteArticleLikes(int article_id) {
		return articleDao.deleteArticleLikes(article_id);
	}

	@Override
	public List<Integer> selectArticleLikeAccount(int article_id) {
		return articleDao.selectArticleLikeAccount(article_id);
	}

}

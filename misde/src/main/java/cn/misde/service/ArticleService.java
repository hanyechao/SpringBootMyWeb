package cn.misde.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.misde.mapper.ArticleMapper;
import cn.misde.model.Article;



@Service
public class ArticleService implements ArticleMapper {

	@Autowired
	ArticleMapper articleMapper;

	@Override
	public boolean insertArticle() {
		try {
			articleMapper.insertArticle();
			return true;
		} catch (Exception e) {
			new Exception("数据插入失败！");
		}
		return false;
	}

	@Override
	public List<Article> findArticles() {
		List<Article> list = articleMapper.findArticles();
		return list;
	}

}

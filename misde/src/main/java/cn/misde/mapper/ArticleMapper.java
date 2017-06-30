package cn.misde.mapper;

import java.util.List;

import cn.misde.model.Article;


public interface ArticleMapper {

	public boolean insertArticle();

	public List<Article> findArticles();

}

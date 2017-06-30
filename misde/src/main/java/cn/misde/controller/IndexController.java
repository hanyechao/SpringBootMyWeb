package cn.misde.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.misde.model.Article;
import cn.misde.service.ArticleService;

@Controller
public class IndexController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("findArticles")
	public String findArticles(Model model) {
		List<Article> articles = articleService.findArticles();
		model.addAttribute("articles", articles);
		return "hello";
	}
}

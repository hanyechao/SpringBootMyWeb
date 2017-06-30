package cn.misde.model;

import java.sql.Timestamp;

public class Article {

	private Integer articleId;

	private Timestamp creatDatetime;

	private Timestamp modifyDatetime;

	private String articleTitle;

	private String articleContent;

	private String imageSrc;

	/**
	 * @return the articleId
	 */
	public int getArticleId() {
		return articleId;
	}

	/**
	 * @param articleId
	 *            the articleId to set
	 */
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	/**
	 * @return the creatDatetime
	 */
	public Timestamp getCreatDatetime() {
		return creatDatetime;
	}

	/**
	 * @param creatDatetime
	 *            the creatDatetime to set
	 */
	public void setCreatDatetime(Timestamp creatDatetime) {
		this.creatDatetime = creatDatetime;
	}

	/**
	 * @return the modifyDatetime
	 */
	public Timestamp getModifyDatetime() {
		return modifyDatetime;
	}

	/**
	 * @param modifyDatetime
	 *            the modifyDatetime to set
	 */
	public void setModifyDatetime(Timestamp modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}

	/**
	 * @return the articleTitle
	 */
	public String getArticleTitle() {
		return articleTitle;
	}

	/**
	 * @param articleTitle
	 *            the articleTitle to set
	 */
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	/**
	 * @return the articleContent
	 */
	public String getArticleContent() {
		return articleContent;
	}

	/**
	 * @param articleContent
	 *            the articleContent to set
	 */
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

}

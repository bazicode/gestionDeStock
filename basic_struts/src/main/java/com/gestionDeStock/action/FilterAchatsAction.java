package com.gestionDeStock.action;

import java.util.List;

import org.hibernate.property.access.spi.SetterFieldImpl;

import com.gestionDeStock.beans.Achat;
import com.gestionDeStock.beans.Article;
import com.gestionDeStock.beans.Inventaire;
import com.gestionDeStock.dao.AchatsDao;
import com.gestionDeStock.dao.ArticleDao;
import com.gestionDeStock.dao.InventaireDao;
import com.gestionDeStock.dao.LoginDao;
import com.opensymphony.xwork2.ActionSupport;


//action pour filtrer et afficher les achats
public class FilterAchatsAction extends ActionSupport{

    private static final long serialVersionUID = 1L;
    private int article;
    private String date = "";
    private List<Achat> achats ;
    private List<Achat> achatsAll;
    private List<Article> articleAll;
    
	public List<Achat> getAchats() {
		return achats;
	}

	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}

	public List<Achat> getAchatsAll() {
		return achatsAll;
	}

	public void setAchatsAll(List<Achat> achatsAll) {
		this.achatsAll = achatsAll;
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String execute() throws Exception {
	        System.out.println(article + "  "+date);
	        	setAchats((List<Achat>) AchatsDao.inventaireByDateAndArticle(article, date));
	    		setAchatsAll((List<Achat>) AchatsDao.allAchats());
	    		setArticleAll(ArticleDao.getAllArticle());
	            return SUCCESS;
	    	
	   }

	public List<Article> getArticleAll() {
		return articleAll;
	}

	public void setArticleAll(List<Article> articleAll) {
		this.articleAll = articleAll;
	}



}

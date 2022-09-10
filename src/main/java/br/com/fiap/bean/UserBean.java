package br.com.fiap.bean;

import java.io.IOException;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.UserDao;
import br.com.fiap.model.User;

@Named
@RequestScoped
public class UserBean {

	private User user = new User();
	private List<User> list;

	private UserDao userDao = new UserDao();

	public UserBean() {
		list = this.list();
	}

	public String save() throws IOException {
		System.out.println(this.user);
		
		userDao.create(user);
		
		FacesContext
			.getCurrentInstance()
			.addMessage(null, new FacesMessage("Cliente cadastrado com sucesso!"));
		
		return "clientes.xhtml";
	}

	public List<User> list() {
		return userDao.listAll();
	}

	public List<User> getList() {
		return list;
	}	

	public void setList(List<User> list) {
		this.list = list;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
package pl.models;

import java.util.ArrayList;
import java.util.List;

public class Uzytkownik {

	public Uzytkownik() {
		super();
	}
	
	public Uzytkownik(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	private String login;
	private String password;
	private List<Uzytkownik> users;
	
	public List<Uzytkownik> getUsers() {
		List<Uzytkownik> usersList = new ArrayList<>();
		usersList.add(new Uzytkownik("admin", "admin"));
		usersList.add(new Uzytkownik("ola", "fasola"));
		return usersList;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

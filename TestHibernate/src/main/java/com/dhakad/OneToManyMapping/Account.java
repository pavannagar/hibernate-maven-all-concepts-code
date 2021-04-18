package com.dhakad.OneToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Account {
	@Id
	private String ano;
	private String aname;
	private int balance;
	@OneToMany(mappedBy = "account" ,cascade = CascadeType.ALL)
	List<Cards> cards;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String ano, String aname, int balance, List<Cards> cards) {
		super();
		this.ano = ano;
		this.aname = aname;
		this.balance = balance;
		this.cards = cards;
	}

	public Account(String ano, String aname, int balance) {
		super();
		this.ano = ano;
		this.aname = aname;
		this.balance = balance;
	}

	public Account(String ano) {
		super();
		this.ano = ano;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Cards> getCards() {
		return cards;
	}

	public void setCards(List<Cards> cards) {
		this.cards = cards;
	}
	
	
	
}

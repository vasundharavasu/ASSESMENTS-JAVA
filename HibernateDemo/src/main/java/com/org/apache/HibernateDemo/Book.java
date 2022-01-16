package com.org.apache.HibernateDemo;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int Bno;
	
	@Column(name="Bname")
private String Bname;
	@Column(name="price")
private int price;
	public int getBno() {
		return Bno;
	}
	public void setBno(int Bno) {
		this.Bno = Bno;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String Bname) {
		this.Bname = Bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}

package dto;

import java.io.Serializable;

public class Product {
	
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String pname;
	
	private String pename;
	
	private String pcode;
	
	private String man;
	
	private Integer unitcoupon;
	
	private Integer unitprice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, String pename) {
		super();
		this.pname = pname;
		this.pename = pename;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPename() {
		return pename;
	}

	public void setPename(String pename) {
		this.pename = pename;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	public Integer getUnitcoupon() {
		return unitcoupon;
	}

	public void setUnitcoupon(Integer unitcoupon) {
		this.unitcoupon = unitcoupon;
	}

	public Integer getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(Integer unitprice) {
		this.unitprice = unitprice;
	}
	
	

}

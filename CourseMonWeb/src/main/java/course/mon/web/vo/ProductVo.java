package course.mon.web.vo;

import java.io.Serializable;

public class ProductVo implements Serializable {
	private static final long serialVersionUID = 1L;

	Integer id;
	String name;
	String price;
	boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}

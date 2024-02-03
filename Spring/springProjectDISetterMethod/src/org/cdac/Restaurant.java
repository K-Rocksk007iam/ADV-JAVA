package org.cdac;

public class Restaurant {

	IHotDrink hotDrink;
	private int restno;
	
	
	
	public int getRestno() {
		return restno;
	}

	public void setRestno(int restno) {
		this.restno = restno;
	}

	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareTea() {
		hotDrink.prepareTea();
	}

}

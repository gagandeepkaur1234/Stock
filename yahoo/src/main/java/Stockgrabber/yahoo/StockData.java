package Stockgrabber.yahoo;

import java.math.BigDecimal;


public class StockData {
	
	private String name;
	private BigDecimal price;
	private BigDecimal change;
	private String currency;
	private BigDecimal bid;
	public StockData(String name, BigDecimal price, BigDecimal change, String currency, BigDecimal bid) {
		super();
		this.name = name;
		this.price = price;
		this.change = change;
		this.currency = currency;
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "StockData [name=" + name + ", price=" + price + ", change=" + change + ", currency=" + currency
				+ ", bid=" + bid + "]";
	}
	
	
}




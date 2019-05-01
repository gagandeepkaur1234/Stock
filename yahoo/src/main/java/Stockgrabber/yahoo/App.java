package Stockgrabber.yahoo;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public Stock getStock(String s) throws IOException {
		
		return YahooFinance.get(s);
		
	}
public void getStock1(String[] s) throws IOException {
	StockData s1= null;
	Map<String, Stock> stock = YahooFinance.get(s);
	
	System.out.println(stock);		
		//return s1;
		
	}
	
	
	
    public static void main( String[] args ) throws IOException
    {
    	List<BigDecimal>a1= new ArrayList<BigDecimal>();
    	
		
		  GetHistory obj= new GetHistory();
		  String[] i= { "GOOG","INTC" };
		 for(String k:i) {
		 obj.getStockHistory(k);}
		 
		 gagan frame = new gagan();
		frame.setVisible(true);
		
		 
		  
		 
    	
        
    }
}

package Stockgrabber.yahoo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;

public class GetHistory  {
	
	List<BigDecimal>a= new ArrayList<BigDecimal>();
	
	public List<BigDecimal> getArr() {
		
		return  a;
		
	}
	

	public void getStockHistory(String stock) throws IOException {
		FileWriter fileWriter = new FileWriter("fileName1.txt", true);
		PrintWriter pw = new PrintWriter(fileWriter);
		Stock st= YahooFinance.get(stock);
		List<HistoricalQuote> history = st.getHistory();
		
		
		for (HistoricalQuote quote : history) {
			System.out.println("====================================");
			System.out.println("symobol : " + quote.getSymbol());
			pw.println(quote.getSymbol());
			System.out.println("date : " + (quote.getDate()));
			System.out.println("High Price  : " + quote.getHigh());
			pw.println(quote.getHigh());
			System.out.println("adding");
			a.add(quote.getHigh());
			System.out.println("Low Price : " + quote.getLow());
			pw.println(quote.getLow());
			System.out.println("Closed price : " + quote.getClose());
			System.out.println("=========================================");
			pw.println(quote.getClose());
			System.out.println("Done");     
					  
				
		}
		pw.close();
		
		
	}
	
	

}

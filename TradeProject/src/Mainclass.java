import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Mainclass {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Trade t1 =new Trade();
	String tradedetails="C:\\Workspace\\TradeProject\\src\\trades.txt";
	List<TradeVO> trade =t1.readFile(tradedetails);	
	System.out.println(trade);
	
	Instrument t2 =new Instrument();
	String instrument="C:\\Workspace\\TradeProject\\src\\inst.txt";
	List<InstrumentVO> ins=t2.readFile(instrument);
	System.out.println(ins);
	
	SimpleDateFormat sdfo = new SimpleDateFormat("dd/MM/yyyy"); 
	 // Get the two dates to be compared 
    Date fromDate = sdfo.parse("25/11/2017"); 
    Date toDate = sdfo.parse("29/11/2017");
    List <TradeVO> result;
    result = trade.stream().filter(x ->(x.getTradeDtTime().after(fromDate) && x.getTradeDtTime().before(toDate))).collect(Collectors.toList());
    result.forEach(System.out::println);


	
    
    
	}
}
		

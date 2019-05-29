import java.util.Date;


public class TradeVO {
	String TradeId;
	Date TradeDtTime;
	String InID;
	int qty;
	int price;
	int amount;
	String trader;
	public String getTradeId() {
		return TradeId;
	}
	public void setTradeId(String tradeId) {
		TradeId = tradeId;
	}
	public Date getTradeDtTime() {
		return TradeDtTime;
	}
	public void setTradeDtTime(Date tradeDtTime) {
		TradeDtTime = tradeDtTime;
	}
	public String getInID() {
		return InID;
	}
	public void setInID(String InID) {
		InID = InID;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTrader() {
		return trader;
	}
	public void setTrader(String trader) {
		this.trader = trader;
	}
	
	public String toString() { 
        return String.format("TradeId:"+TradeId  + "," + "TradeDtTime:"+TradeDtTime); 
    } 
} 


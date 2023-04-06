

import java.util.Calendar;

/*
Transaction은 Account에 포함된다.
거래내역은 반드시 Account가 하나 있어야 하고, 
Account는 거래내역이 있어도 되고, 없어도 된다.

 */
public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount ; 	 //거래금액
	private long balance ;//잔고
	
	Transaction(String kind, long amount, long balance){
		this.amount = 0;
		this.balance = 0;
		
		if(kind.equals("deposit")) {
			this.amount = amount;
			this.balance += amount;
			this.kind = kind;
		}
		if(kind.equals("withdraw")) {
			this.amount = amount;
			this.balance -= amount;
			this.kind = kind;
		}
	}
	
	

	public String getTransactionDate() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		this.transactionDate = year+"년"+month+"월"+day+"일";
		return transactionDate;
	}
//	public void setTransactionDate(String transactionDate) {
//		this.transactionDate = transactionDate;
//	}
	public String getTransactionTime() {
		Calendar now = Calendar.getInstance();
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		
		return hour+"시"+minute+"분";
	}
//	public void setTransactionTime(String transactionTime) {
//		this.transactionTime = transactionTime;
//	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "거래금액:" + amount + ", 잔액:" + balance + " /" + getTransactionDate() + getTransactionTime();
	}
	
	
}

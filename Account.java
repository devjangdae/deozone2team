import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	
	public Account(String accountNo, String name) {
		this.accountNo=accountNo;
		this.name=name;
		this.transactions = new ArrayList<>();
		System.out.println("[계좌번호: " + accountNo + ", 소유자 명: " + name + "]");
	}
	
	public void deposit(long amount) {
		
		this.balance+=amount;
		transactions.add(new Transaction("deposit", amount, balance));

	}
	
	public void withdraw(long amount) {
		
		if(balance<amount) {
			System.out.println("잔액이 부족합니다.^^");
			System.out.println("현재 잔액: "+balance);
		} else {
			this.balance-=amount;
			transactions.add(new Transaction("withdraw", amount, balance));
		}
		
	}

	
	public long getBalance() {
		return balance;
	}

	public ArrayList<Transaction> getTransactions() {
		
		ArrayList<Transaction> tlist = new ArrayList<>(); 
			
		
		tlist = transactions;
	
		
		
		return tlist;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public String getName() {
		return name;
	}

	public int getNum() {
		return transactions.size();
	}

	@Override
	public String toString() {
		return "[계좌번호: " + accountNo +"잔액:"+balance+ ", 소유자 명: " + name + "]";
	}
	
}
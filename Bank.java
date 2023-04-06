import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts = new ArrayList<>();
	private int totalAccount;
	
	// 계좌를 생성한다.
	public void addAccount(String accountNo, String name) {
		this.accounts.add(new Account(accountNo, name));
	}

	// 계좌를 찾는다 (계좌번호로)
	public Account getAccount(String accountNo) {
		Account findacc = null;
		for(Account value : accounts) {
			if(value.getAccountNo().equals(accountNo)) {
				findacc = value;
				return findacc;
			}
		}
		return null;		
	}

	// 계좌를 찾는다 (소유자명으로)
	public ArrayList<Account> findAccount(String name) {
		
		ArrayList<Account> foundAccounts = new ArrayList<>();
		
		for(int i = 0 ; i < accounts.size() ; i++) {
			if(name.equals(accounts.get(i).getName())) {
				foundAccounts.add(accounts.get(i));
				
			}
		}
		
		return foundAccounts;
	}

	// 계좌목록을 본다
	public Account[] getAccounts() {
		for(int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(i)); // 0번째 index 출력
        }
		return null;
	}

	// 총계좌수를 반환한다.
	public int getTotalAccount() {
		return totalAccount;
	}
}
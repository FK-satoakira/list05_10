package list05_10;

import list05_02.AccountType;

//口座クラスです（列挙型活用ver）
public class Account {
	private String accountNo;
	private int balance;
	private AccountType accountType; /* 口座種別を列挙型で受け取り格納 */

	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "aNo=" + accountNo + ", bal=" + balance + ", aType=" + accountType + "]";
	}

}
//【利用例】new Account("1732050", AccountType.FUTSU);

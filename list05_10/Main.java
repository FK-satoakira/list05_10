package list05_10;

import static list05_02.AccountType.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Account a = new Account("1234567", TOUZA);
		System.out.println(a);
		a.setAccountType(FUTSU);
		System.out.println(a);
		Account b = new Account("4235142", TEIKI);
		Account c = new Account("5435534", TOUZA);
		List<Account> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		for (int i = 0; i < list.size(); i++) {

			switch (list.get(i).getAccountType()) {
			case FUTSU:
				System.out.println("普通");
				break;
			case TOUZA:
				System.out.println("当座");
				break;
			case TEIKI:
				System.out.println("定期");
				break;
			}
		}
	}
}
// 勘違いでした。同じパッケージでも普通にできた。AccountType.javaを同パケに戻しAccount.javaのimportを消すだけ


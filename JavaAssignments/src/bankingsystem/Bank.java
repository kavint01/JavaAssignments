package bankingsystem;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Customer> list=new ArrayList<>();
		Map<Integer, Account> map=new HashMap<>();
		int userChoice=0;
		while(userChoice!=8) {
			System.out.println("1. Create New Customer Data\r\n" + "2. Assign a Bank Account to a Customer\r\n" + "3. Display balance or interest earned of a Customer\r\n" + "4. Sort Customer Data\r\n" + "5. Persist Customer Data\r\n"
	+ "6. Show All Customers\r\n" + "7. Search Customers by Name\r\n" + "8. Exit");
			userChoice=sc.nextInt();
			switch(userChoice) {
			case 1:
			
				String cName=sc.next();
				int cAge=sc.nextInt();
				long cMobNo=sc.nextLong();
				String cPassNo=sc.next();
				list.add(new Customer(cName,cAge,cMobNo,cPassNo));
				break;
			case 2:
				int cId=sc.nextInt();
				
				//Account acc=new Account();
//				list.add();
				break;
			case 3:
				break;
			case 4:
				
				break;
			case 5:
				break;
			case 6:
				for(int i=0;i<list.size();i++) {
					Customer c=list.get(i);
					System.out.println(c);
				}
				break;
			case 7:
				break;
			}
		}
		
	}

}

import java.util.ArrayList;
import java.util.Scanner;

public class Activity {
	public static int  userAmt=0;

	public static void main(String[] args) {
		Bank bank=new Bank();

		bank.setBankName("HIFI BANK LTD");

		Scanner sc=new Scanner(System.in);

		System.out.println("Welcome To "+ bank.getBankName());		

		System.out.println("You are our valuable customer please provide your account number to procced further");

		System.out.println("accountNumber: ");

		bank.setAccountNo(sc.nextLine());

		System.out.println("Please mention your Name: ");

		bank.setUserName(sc.nextLine());

		System.out.println("\n Welcome "+ bank.getUserName()+"\n");

		int menu =0;

		ArrayList<Object> bnk=new ArrayList<>();

		do{

		System.out.println("choose from menu given: ");

		System.out.println("1 : Check Balance ");

		System.out.println("2 : Credit ");

		System.out.println("3 : Debit ");

		System.out.println("4 : Details of Customer ");

		System.out.println("5 : Exit ");

		menu = sc.nextInt();

		int amount = 0;

		

		switch (menu) {

		case 1:

			System.out.println(bank.getUserName() + " your account balance is: ₹"+ userAmt);

			break;

		case 2:

			System.out.println("Enter amount to credit: ");

			amount=sc.nextInt();

			userAmt = userAmt + amount;

			bank.setAmount(userAmt);

			System.out.println(amount+" credited and current balance is ₹"+userAmt );

			break;

		case 3:

			System.out.println("Enter amount to debit: ");

			amount=sc.nextInt();

			if(userAmt < 1000) 

				System.out.println("minimum bal maintained is ₹1000");

			if(amount < userAmt && userAmt > 1000)

			{

				userAmt = userAmt - amount;

				if(userAmt >=1000){

				bank.setAmount(userAmt);

				System.out.println(amount+" debited and current balance is ₹"+userAmt );

				}else{

				System.out.println("minimum bal maintained is ₹1000");

				userAmt = userAmt + amount;

				}

			}else{ System.out.println("minimum bal maintained is ₹1000");}

			break;

		case 4:

			bnk.add(0,bank.getBankName());

			bnk.add(1,bank.getAccountNo());

			bnk.add(2, bank.getUserName());

			bnk.add(3, bank.getAmount());

			

			System.out.println("details of "+bank.getUserName()+": "+" bank Name:" +bnk.get(0)+" account no: "+bnk.get(1)+" User Name: "+ bnk.get(2)+" Balance: "+bnk.get(3));

			

			break;

		case 5:

			System.out.println("Thanks visit again..");

			break;



		default:

			break;

		}

		

		}while(menu !=5);


	}

}

import java.util.*;

class CheckingAccount implements HasMenu{
  double balance;

  CheckingAccount(){
    this.balance = 0.0;
  } // end constructor

  CheckingAccount(double balance){
    this.balance = balance;
  } // end overloaded constructor

  void main(){
    start();
  } // end main

  static String menu(){
    return "Account Menu\n\n0) Quit\n1) Check Balance\n2) Make a Deposit\n3) Make a Withdrawal\n\nAction (0-3): ";
  } // end menu

  void start() {
	  Scanner userInterface = new Scanner(System.in);
    boolean keepGoing = true;
	  while(keepGoing){
      System.out.print(menu());
      int input = userInterface.nextInt();
      if(input == 0){
        System.out.println("Zero");
        keepGoing = false;
      } // end if
      else if(input == 1){
        System.out.println("%.2f", getBalance());
      } // end else if
      else if(input == 2){
        System.out.println("Two");
      } // end else if
      else if(input == 3){
        System.out.println("Three");
      } // end else if
    } // end while
  } // end start

  double getBalance(){
    return balance;
  } // end getBalance

  String getBalanceString(){
    return (String)balance;
  } // end getBalanceString

  void setBalance(double balance){
    this.balance = balance;
  } // end setBalance

  void checkBalance(){
    System.out.println(getBalance());
  } // end checkBalance

  private double getDouble(){
    
  } // end getDouble

  void makeDeposit(){
    
  } // end makeDeposit

  void makeWithdrawal(){
    
  } // end makeWithdrawal
}

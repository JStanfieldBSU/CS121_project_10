class CheckingAccount implements HasMenu{
  double balance;

  CheckingAccount();
  CheckingAccount(double balance);
  void main();
  String menu();
  void start();
  double getBalance();
  String getBalanceString();
  void setBalance(double balance);
  void checkBalance();
  private double getDouble();
  void makeDeposit();
  void makeWithdrawal();
}

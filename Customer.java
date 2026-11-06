class Customer extends User{
  CheckingAccount checking;
  SavingsAccount savings;

  Customer();
  Customer(userName, PIN);
  void main();
  void start();
  String menu();
  void changePIN();
  String getReport()
}

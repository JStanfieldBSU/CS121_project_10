abstract class User implements HasMenu, Serializable{
  String userName;
  String PIN;

  boolean login();
  boolean login(userName, PIN);
  void setUserName(userName);
  String getUserName();
  void setPIN(PIN);
  String getPIN():
  abstract String getReport();
}

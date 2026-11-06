abstract class User implements HasMenu, Serializable{
  String userName = "Alice";
  String PIN = "0000";

  boolean login(){
    return false;
  } // end login

  boolean login(userName, PIN){
    if(this.userName.equals(userName) && this.PIN.equals(PIN)){
      return true;
    } // end if
    else{
      return false;
    } // end else
  } // end login(userName, PIN)

  void setUserName(userName){
    this.userName = userName;
  }

  String getUserName(){
    return this.userName;
  }

  void setPIN(PIN){
    this.PIN = PIN;
  }

  String getPIN(){
    return this.PIN;
  }

  abstract String getReport();
}

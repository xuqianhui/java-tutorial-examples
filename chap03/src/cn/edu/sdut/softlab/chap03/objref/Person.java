package cn.edu.sdut.softlab.chap03.objref;

public class Person {

  String username;
  String password;
  int seniority; // 工龄
  float salary; // 薪水

  public Person(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String toString() {
    return "Person[username=" + username + ",password=" + password
            + ",seniority = " + seniority + ",salary = " + salary + "]";
  }

}

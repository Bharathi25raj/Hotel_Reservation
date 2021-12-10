package com.example.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Client_Information {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String gest;
private String gender;
private int age;
private String email;
private String mobno;
public String getGest() {
   return gest;
}
public void setGest(String gest) {
   this.gest = gest;
}
public String getGender() {
   return gender;
}
public void setGender(String gender) {
   this.gender = gender;
}
public int getAge() {
   return age;
}
public void setAge(int age) {
   this.age = age;
}
public String getEmail() {
   return email;
}
public void setEmail(String email) {
   this.email = email;
}
public String getMobno() {
   return mobno;
}
public void setMobno(String mobno) {
   this.mobno = mobno;
}
}
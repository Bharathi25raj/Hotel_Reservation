package com.example.model;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table
public class Hotel_Detalils {
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   private String city;
   private String hotel;
   private String status;
   @DateTimeFormat(pattern = "MM/dd/yyyy")
   private  Date date;
public Date getDate() {
      return date;
   }
   public void setDate(Date date) {
      this.date = date;
   }
   private String roomtype;
   private int  price;
    private int  gst;
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getCity() {
      return city;
   }
   public void setCity(String city) {
      this.city = city;
   }
   public String getHotel() {
      return hotel;
   }
   public void setHotel(String hotel) {
      this.hotel = hotel;
   }
   public String getStatus() {
      return status;
   }
   public void setStatus(String status) {
      this.status = status;
   }
   public String getRoomtype() {
      return roomtype;
   }
   public void setRoomtype(String roomtype) {
      this.roomtype = roomtype;
   }
   public int getPrice() {
      return price;
   }
   public void setPrice(int price) {
      this.price = price;
   }
   public int getGst() {
      return gst;
   }
   public void setGst(int gst) {
      this.gst = gst;
   }

   
}
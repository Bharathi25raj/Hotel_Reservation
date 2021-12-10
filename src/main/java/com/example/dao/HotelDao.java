package com.example.dao;
import java.util.List;
import com.example.model.Client_Information;
import com.example.model.Hotel_Detalils;
public interface HotelDao {
   
   public void addHotel(Hotel_Detalils hd);
   public  void updateHotel(Hotel_Detalils hd);
   public void addClient(Client_Information ci);
   public Hotel_Detalils getHotelByName(int hotel);
   public List<Hotel_Detalils> listHotel();
}
package com.example.dao;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.example.model.Client_Information;
import com.example.model.Hotel_Detalils;


@Repository
public class HotelDaoImpl implements HotelDao {
   
   @Autowired(required=true)
   private HibernateTemplate hibernateTemplate;
   
   @Override
   @Transactional
   public void addHotel(Hotel_Detalils hd) {
      // TODO Auto-generated method stub
      
   
      int i=(Integer) hibernateTemplate.save(hd);
         
   
      
   }
   @Override
   @Transactional
   public void updateHotel(Hotel_Detalils hd) {
      // TODO Auto-generated method stub
      
      hibernateTemplate.saveOrUpdate(hd);
   }
   @Override
   @Transactional
   public List<Hotel_Detalils> listHotel() {
      // TODO Auto-generated method stub
      
   
         List<Hotel_Detalils> loadAll = this.hibernateTemplate.loadAll(Hotel_Detalils.class);
         return  loadAll;
   
   }

   @Override
   @Transactional
   public Hotel_Detalils getHotelByName(int hotel) {
      // TODO Auto-generated method stub
       Hotel_Detalils hd=    (Hotel_Detalils) this.hibernateTemplate.get(Hotel_Detalils.class, hotel);
      return hd;
   
      
   }
   @Override
   @Transactional
   public void addClient(Client_Information ci) {
      // TODO Auto-generated method stub
      this.hibernateTemplate.save(ci);
   }


}
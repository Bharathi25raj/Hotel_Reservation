package com.example.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HotelDao;
import com.example.dao.HotelDaoImpl;
import com.example.model.Client_Information;
import com.example.model.Hotel_Detalils;

@Service
public class HotelServiceImpl implements  HotelService {
	@Autowired
	private HotelDao hoteldao;
	@Override
	public void addHotel(Hotel_Detalils hd) {
		// TODO Auto-generated method stub
		hoteldao.addHotel(hd);
	}
	@Override
	public void updateHotel(Hotel_Detalils hd) {
		// TODO Auto-generated method stu
		hoteldao.updateHotel(hd);
	}
	@Override
	public Hotel_Detalils getHotelByName(int hotel) {
		// TODO Auto-generated method stub

		return  hoteldao.getHotelByName(hotel);
	}
	@Override
	public List<Hotel_Detalils> listHotel() {
		return hoteldao.listHotel();
	}
	@Override
	public void addClient(Client_Information ci) {
		// TODO Auto-generated method stub
		hoteldao.addClient(ci);
	}
}



package com.example.junit;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.dao.HotelDao;
import com.example.dao.HotelDaoImpl;
import com.example.model.Hotel_Detalils;
import com.example.service.HotelService;
import com.example.service.HotelServiceImpl;

public class HotelServiceTest  {
    @InjectMocks
    HotelServiceImpl service;
    @Mock
    HotelDaoImpl dao;
    @SuppressWarnings("deprecation")
	@Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getHotelByNameTest()
    {
        List<Hotel_Detalils > list = new ArrayList<Hotel_Detalils >();
        Hotel_Detalils  One = new Hotel_Detalils (1, "kolkata", "fivestar", "avilable","AC",320,30);
        Hotel_Detalils  Two = new Hotel_Detalils (2, "kolkata", "threestar", "avilable","NAC",380,300);
        Hotel_Detalils  Three = new Hotel_Detalils (3, "kolkata", "onestar", "avilable","NAC",320,200);
        list.add(One);
        list.add(Two);
        list.add(Three);
        when(dao.getHotelByName(1)).thenReturn(One);
        //test
        Hotel_Detalils hd = service.getHotelByName(1);
        assertEquals("fivestar", hd.getHotel());
        assertEquals("kolkata", hd.getCity());
        assertEquals(1, hd.getId());
    }
    @Test
    public void listHotelTest()

    {
        List<Hotel_Detalils > list = new ArrayList<Hotel_Detalils >();
        Hotel_Detalils  One = new Hotel_Detalils (1, "kolkata", "fivestar", "avilable","AC",320,30);
        Hotel_Detalils  Two = new Hotel_Detalils (2, "kolkata", "threestar", "avilable","NAC",380,300);
        Hotel_Detalils  Three = new Hotel_Detalils (3, "kolkata", "onestar", "avilable","NAC",320,200);
        list.add(One);
        list.add(Two);
        list.add(Three);
        when(dao.listHotel()).thenReturn(list);
        //test
        List<Hotel_Detalils > hdList =service.listHotel();
        assertEquals(3, hdList.size());
        verify(dao, times(1)).listHotel();

    }
    @Test
    public void addHotelTest()
    {
        Hotel_Detalils hd = new Hotel_Detalils (3, "kolkata", "onestar", "avilable","NAC",320,200);
        service.addHotel(hd);
        verify(dao, times(1)).addHotel(hd);
    }
}
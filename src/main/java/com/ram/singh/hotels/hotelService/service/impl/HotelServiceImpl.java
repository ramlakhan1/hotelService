package com.ram.singh.hotels.hotelService.service.impl;

import com.ram.singh.hotels.hotelService.entities.Hotel;
import com.ram.singh.hotels.hotelService.exceptions.ResourceNotFoundException;
import com.ram.singh.hotels.hotelService.repository.HotelRepository;
import com.ram.singh.hotels.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

   @Autowired
    private HotelRepository hotelRepository;
    /**
     * @param hotel
     * @return
     */
    @Override
    public Hotel saveHotel(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
        return hotelRepository.save(hotel);
    }

    /**
     * @param hotelId
     * @return
     */
    @Override
    public Hotel findHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel not found for id " + hotelId));
    }

    /**
     * @param hotel
     * @return
     */
    @Override
    public Hotel updateHotel(Hotel hotel) {
        Hotel oldHotel = findHotelById(hotel.getHotelId());
        oldHotel.setHotelName(hotel.getHotelName());
        oldHotel.setHotelLocation(hotel.getHotelLocation());
        oldHotel.setAbout(hotel.getAbout());
        return hotelRepository.save(oldHotel);
    }

    /**
     * @param hotelId
     */
    @Override
    public void deleteHotelById(String hotelId) {
       hotelRepository.deleteById(hotelId);
    }

    /**
     * @return
     */
    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}

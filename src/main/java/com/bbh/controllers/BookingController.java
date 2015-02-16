package com.bbh.controllers;

import com.bbh.entity.Booking;
import com.bbh.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookingController {

    BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository){
        this.bookingRepository = bookingRepository;
    }

    @RequestMapping(value = "/bookings", method = RequestMethod.GET)
    @ResponseBody
    public List<Booking> getBookings(){

        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/bookings/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Booking getBooking(@PathVariable String name){
        return bookingRepository.findByName(name);
    }
}

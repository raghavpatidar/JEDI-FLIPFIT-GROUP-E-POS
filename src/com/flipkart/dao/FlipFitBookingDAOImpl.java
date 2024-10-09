package com.flipkart.dao;
import com.flipkart.dao.interfaces.IFlipFitBookingDAO;
import java.sql.*;
import com.flipkart.bean.FlipFitBooking;
import java.sql.PreparedStatement;

import java.util.ArrayList;
import java.util.List;

public class FlipFitBookingDAOImpl implements IFlipFitBookingDAO {

    @Override
    public FlipFitBooking makeBooking(FlipFitBooking booking) {
      System.out.println("make Booking");
      return null;
    }

    @Override
    public boolean deleteBooking(int bookingId) {
      System.out.println("deleteBooking");
      return false;
    }

    @Override
    public List<FlipFitBooking> getAllBookings(int userId) {
      System.out.println("Getting all bookings");
      return null;
    }

    @Override
    public List getBookingDetails(int bookingId) {
      System.out.println("Getting booking details");
      return null;
    }

    public FlipFitBooking getBookingDetailsByBookingId(int bookingId) {
      System.out.println("Getting booking details by ID");
        return null;
    }
}
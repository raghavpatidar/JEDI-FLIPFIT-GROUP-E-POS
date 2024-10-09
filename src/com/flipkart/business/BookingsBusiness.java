package com.flipkart.business;

import com.flipkart.client.GymFlipFitPaymentMenu;
import com.flipkart.dao.FlipFitGymCustomerDAOImpl;
import com.flipkart.dao.interfaces.IFlipFitBookingDAO;
import com.flipkart.bean.FlipFitBooking;
import com.flipkart.bean.FlipFitSlots;
import com.flipkart.dao.FlipFitBookingDAOImpl;
import com.flipkart.dao.FlipFitSlotDAOImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookingsBusiness {


    public BookingsBusiness() {
    }

    public FlipFitBooking makeBooking(int userID, int centreID, int startTime) {
      System.out.println("Make Booking");
               return null;
    }

    public boolean deleteBooking(int bookingId) {
      System.out.println("Deleting a booking for " + bookingId);

        return true;
    }
}

package com.flipkart.business;
import com.flipkart.bean.FlipFitBooking;

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

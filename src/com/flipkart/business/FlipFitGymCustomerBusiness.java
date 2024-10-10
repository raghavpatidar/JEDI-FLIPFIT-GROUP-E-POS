package com.flipkart.business;
import com.flipkart.bean.*;
import com.flipkart.business.interfaces.IFlipFitGymCustomer;
import com.flipkart.exceptions.InvalidChoiceException;
import java.util.Collections;
import java.util.List;

public class FlipFitGymCustomerBusiness implements IFlipFitGymCustomer {


    public FlipFitGymCustomerBusiness(){

    }

    @Override
    public List<FlipFitBooking> viewBookedSlots(int userId) {

      System.out.println("view Booking Slots" + userId);
      return Collections.emptyList();
    }

    @Override
    public FlipFitBooking checkBookingConflicts(int userId, int slotTime) {
      System.out.println("check booking conflicts" + userId+ " " + slotTime);
      return null;
    }
    @Override
    public List<FlipFitGymCentre> viewCentres() {
      System.out.println("view centres");
      return Collections.emptyList();
    }

    public boolean makePayment(int userId) {
        System.out.println("Make payment called:> ");
        return true;
    }
    public FlipFitGymCustomer editDetails(FlipFitGymCustomer flipFitGymCustomer) throws InvalidChoiceException{
      System.out.println("editDetails called:> ");
      return flipFitGymCustomer;
    }

    @Override
    public FlipFitGymCustomer registerCustomer(FlipFitGymCustomer flipFitGymCustomer) {
      System.out.println("registerCustomer called:> ");
      return flipFitGymCustomer;
    }

    @Override
    public FlipFitUser login(FlipFitUser flipFitUser) {
      System.out.println("login called:> ");
      return flipFitUser;
    }

}

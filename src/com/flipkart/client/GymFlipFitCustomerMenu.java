package com.flipkart.client;

import com.flipkart.bean.FlipFitGymCentre;
import com.flipkart.bean.FlipFitSlots;
import com.flipkart.bean.FlipFitUser;
import com.flipkart.business.BookingsBusiness;
import com.flipkart.business.FlipFitGymCentreBusiness;
import com.flipkart.business.FlipFitGymCustomerBusiness;
import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;

import java.util.Scanner;

import java.util.List;

public class GymFlipFitCustomerMenu {

    public static void getFlipFitCustomerMenu(FlipFitUser gymCustomer) throws InvalidChoiceException {
        try {
            int userId = gymCustomer.getUserID();
            Scanner sc = new Scanner(System.in);
            FlipFitGymCustomerBusiness FCBservice = new FlipFitGymCustomerBusiness();

            FlipFitGymCentreBusiness FCService = new FlipFitGymCentreBusiness();

            BookingsBusiness BService = new BookingsBusiness();

            int choice = 0;

            do {

                System.out.println("    FlipFit Customer Menu   " );
                System.out.println( """
                        Choose an option:
                         1. View Booked Slots
                         2. View Centres
                         3. Logout \n
                        """ );

                choice = sc.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println("View Booked Slots" );
                        FCBservice.viewBookedSlots(userId);

                        System.out.println( "Type 1. If you wish to cancel" );
                        System.out.println("Type 2. To return to main menu");

                        choice = sc.nextInt();

                        if (choice == 1) {
                            System.out.print( "Choose the booking ID you wish to cancel:> " );
                            int bookingId = sc.nextInt();
                            BService.deleteBooking(bookingId);
                        }

                        break;
                    }
                    case 2: {
                        System.out.println("View Centres" );
                        break;
                    }
                    case 3: {
                        System.out.println("Successfully logged out" );
                        return;
                    }
                    default: {
                        throw new InvalidChoiceException("Invalid choice entered: " + choice);
                    }
                }
            } while (choice != 4);
        } catch (InvalidChoiceException e) {
            ExceptionHandler.InvalidChoiceMainMenu(e);
        }
    }
}

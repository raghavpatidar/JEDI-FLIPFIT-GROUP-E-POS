package com.flipkart.client;

import com.flipkart.bean.*;
import com.flipkart.business.FlipFitAdminBusiness;
import com.flipkart.dao.FlipFitAdminDAOImpl;
import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;

import java.util.List;
import java.util.Scanner;

public class GymFlipFitAdminMenu {

    /**
     * getAdminView
     *
     * @throws InvalidChoiceException
     */
    public static void getAdminView() throws InvalidChoiceException {
        try {
            Scanner sc = new Scanner(System.in);
            FlipFitAdminDAOImpl adminUser = new FlipFitAdminDAOImpl();
            FlipFitAdminBusiness adminService = new FlipFitAdminBusiness();

            int choice = 0;

            do {
                System.out.println("        Admin Menu          " );
                System.out.println( """
                        Choose an option:
                         1. View Pending Requests
                         2. View Approved Owners
                         3. View all FlipFit Customers
                         4. View all Centres Using OwnerId
                         5. Logout
                        """);

                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println( "=========== View Pending Requests =========== " );

                        List<FlipFitGymOwner> flipFitGymOwnerList = adminService.getPendingOwnerList();

                        if (flipFitGymOwnerList.isEmpty()) {
                            System.out.println("No pending requests moving to main menu");
                            break;
                        }

                        for (FlipFitGymOwner flipFitGymOwner : flipFitGymOwnerList) {
                            System.out.println("Owner ID: " + flipFitGymOwner.getUserId() + " Aadhar: " + flipFitGymOwner.getAadharNumber());
                        }

                        System.out.print( "Type the ownerId of the owner you wish to approve:> " );
                        int ownerId = sc.nextInt();

                        adminUser.validateOwner(ownerId);
                        System.out.println(  "GymOwner with ID " + ownerId + " approved" );

                        break;
                    }

                    case 2: {
                        System.out.println(  "=========== View Approved Owners =========== " );

                        List<FlipFitGymOwner> flipFitGymOwnerList = adminService.getApprovedOwnerList();
                        for (FlipFitGymOwner flipFitGymOwner : flipFitGymOwnerList) {
                            System.out.println(  "Owner ID: " + flipFitGymOwner.getUserId() + " Aadhar: " + flipFitGymOwner.getAadharNumber()  );
                        }

                        break;
                    }

                    case 3: {
                        System.out.println( "=========== View all FlipFit Customers =========== "  );

                        List<FlipFitGymCustomer> customersList = adminService.getUserList();
                        for (FlipFitGymCustomer customers : customersList) {
                            System.out.println(  "CustomerID: " + customers.getUserId() + " CustomerName: " + customers.getUserName() );
                        }

                        break;
                    }

                    case 4: {
                        System.out.println(  "=========== View Centres Using OwnerId =========== "  );

                        System.out.print( "Type the ownerId of the owner for which you wish to view Centres:> "  );
                        Scanner in = new Scanner(System.in);
                        int ownerId = in.nextInt();

                        List<FlipFitGymCentre> flipFitGymCentres = adminService.getGymCentreUsingOwnerId(ownerId);
                        if (flipFitGymCentres.isEmpty()) {
                            System.out.println(  "No centres found for owner ID " + ownerId );
                        } else {
                            System.out.println( "Printing All Centres of Owner " );
                            for (FlipFitGymCentre gymCentre : flipFitGymCentres) {
                                System.out.println( "CentreID: " +gymCentre.getCentreID() + " City: " + gymCentre.getCity() + " Capacity: " + gymCentre.getCapacity()  );
                            }
                        }

                        break;
                    }

                    case 5: {
                        System.out.println("Successfully logged out");
                        return;
                    }

                    default: {
                        throw new InvalidChoiceException(  "Invalid choice entered: " + choice  );
                    }
                }
            } while (choice != 6);

        } catch (InvalidChoiceException e) {
            ExceptionHandler.InvalidChoiceMainMenu(e);
        }
    }
}

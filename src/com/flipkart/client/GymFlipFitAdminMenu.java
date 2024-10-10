package com.flipkart.client;

import com.flipkart.business.FlipFitAdminBusiness;

import com.flipkart.exceptions.ExceptionHandler;
import com.flipkart.exceptions.InvalidChoiceException;
import java.util.Scanner;

public class GymFlipFitAdminMenu {

    public static void getAdminView() throws InvalidChoiceException {
        try {
            Scanner sc = new Scanner(System.in);
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
                         5. Logout \n
                        """);

                choice = sc.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println( "View Pending Requests " );
                        System.out.println(  "GymOwner with ID approved" );
                        break;
                    }

                    case 2: {
                        System.out.println(  "View Approved Owners " );
                        break;
                    }

                    case 3: {
                        System.out.println( "=========== View all FlipFit Customers =========== "  );
                        break;
                    }

                    case 4: {
                        System.out.println(  "=========== View Centres Using OwnerId =========== "  );
                        break;
                    }

                    case 5: {
                        System.out.println("Successfully logged out");
                        return;
                    }

                    default: {
                        throw new InvalidChoiceException(  "Please Enter Valid choice : " + choice  );
                    }
                }
            } while (choice != 6);

        } catch (InvalidChoiceException e) {
            ExceptionHandler.InvalidChoiceMainMenu(e);
        }
    }
}

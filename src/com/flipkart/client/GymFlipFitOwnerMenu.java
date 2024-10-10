package com.flipkart.client;
import com.flipkart.bean.FlipFitGymCentre;
import com.flipkart.bean.FlipFitSlots;
import com.flipkart.bean.FlipFitUser;
import com.flipkart.business.*;
import com.flipkart.exceptions.InvalidChoiceException;
import java.util.Scanner;

public class GymFlipFitOwnerMenu {

    public static void getFlipFitOwnerView(FlipFitUser gymOwner) throws InvalidChoiceException {
        try {

            FlipFitGymOwnerBusiness GOBservice = new FlipFitGymOwnerBusiness();

            Scanner sc = new Scanner(System.in);
            int choice = 0;

            do {

                System.out.println("    Gym Owner Menu    ");


                System.out.println( """
                        Choose an option:
                         1. Add Centre
                         2. View Centres
                         3. Add Slot
                         4. Delete Slot
                         5. Logout
                        """ );

                choice = sc.nextInt();

                switch (choice) {
                    case 1: {
                        System.out.println( "=========== Add Centre =========== " );

                        Scanner scanner = new Scanner(System.in);
                        int ownerID = gymOwner.getUserID();

                        System.out.print("Enter Capacity:> ");
                        int capacity = scanner.nextInt();

                        System.out.print( "Enter City:> ");
                        String city = scanner.next();

                        System.out.print("Enter State:> " );
                        String state = scanner.next();

                        System.out.print("Enter Pincode:> " );
                        String pincode = scanner.next();

                        FlipFitGymCentre flipFitGymCentre = new FlipFitGymCentre();
                        flipFitGymCentre.setOwnerID(ownerID);
                        flipFitGymCentre.setCapacity(capacity);
                        flipFitGymCentre.setCity(city);
                        flipFitGymCentre.setState(state);
                        flipFitGymCentre.setPincode(pincode);
                        flipFitGymCentre.setApproved(true);

                        GOBservice.addCentre(flipFitGymCentre);

                        System.out.println("Gym Centre created successfully at "+ flipFitGymCentre.getCity() + " with pincode: "+ flipFitGymCentre.getPincode() );
                        break;
                    }

                    case 2: {
                        System.out.println( "View Centres for the owner" );
                        break;
                    }

                    case 3: {
                        System.out.println("Add Slot in a Gym");

                        System.out.print( "Enter gym centre ID:> " );
                        int centreId = sc.nextInt();

                        System.out.print("Enter slot time:> " );
                        int slotTime = sc.nextInt();

                        System.out.print( "Enter the max capacity of the slot:> " );
                        int maxCapacity = sc.nextInt();

                        FlipFitSlots slot = new FlipFitSlots();
                        slot.setCentreId(centreId);
                        slot.setSlotTime(slotTime);
                        slot.setSeatsAvailable(maxCapacity);
                        slot.setMaxCapacity(maxCapacity);


                        System.out.println("Slot created successfully with Slot Time: "+ slot.getSlotTime() + " and maximum Capacity: " + slot.getMaxCapacity() );
                        break;
                    }

                    case 4: {
                        System.out.println("=========== Delete Slot =========== ");

                        System.out.print("Enter centre ID:> " );
                        int centreId = sc.nextInt();

                        System.out.print("Enter slot ID:> ");
                        int slotId = sc.nextInt();


                        System.out.println("Slot deleted successfully.");
                        break;
                    }

                    case 5: {
                        System.out.println("Successfully logged out.");
                        return;
                    }

                    default: {
                        throw new InvalidChoiceException("Invalid choice entered: " + choice );
                    }
                }
            } while (choice != 5);
        } catch (InvalidChoiceException e) {
            System.out.println(e.getMessage());
        }
    }
}

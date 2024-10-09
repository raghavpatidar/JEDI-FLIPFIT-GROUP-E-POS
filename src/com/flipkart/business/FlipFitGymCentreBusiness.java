package com.flipkart.business;
import com.flipkart.bean.FlipFitGymCentre;
import com.flipkart.bean.FlipFitSlots;
import com.flipkart.business.interfaces.IFlipFitGymCentre;
import com.flipkart.dao.FlipFitGymCentreDAOImpl;
import java.util.Collections;
import java.util.List;

public class FlipFitGymCentreBusiness implements IFlipFitGymCentre {

    public FlipFitGymCentreBusiness(){

    }

    public FlipFitGymCentre updateGymCentre(FlipFitGymCentre flipFitGymCentre){
        System.out.println("Updating Gym Centre:> ");
        return flipFitGymCentre;
    }

    public boolean deleteGymCentre(int centreId){
        System.out.println("Deleting Gym Centre:> ");
        return false;
    }

    public List<FlipFitSlots> viewAvailableSlots(int centreId) {
        System.out.println("Viewing Available Slots:> ");

       return Collections.emptyList();
    }
}

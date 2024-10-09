package com.flipkart.business;

import com.flipkart.bean.*;
import com.flipkart.business.interfaces.IFlipFitGymOwner;
import com.flipkart.dao.*;
import com.flipkart.dao.interfaces.IFlipFitGymOwnerDAO;
import com.flipkart.exceptions.InvalidChoiceException;
import java.util.List;

public class FlipFitGymOwnerBusiness implements IFlipFitGymOwner {


    public FlipFitGymOwnerBusiness(){

    }

    public FlipFitGymCentre addCentre(FlipFitGymCentre flipFitGymCentre){
      System.out.println("add Centre");
        return flipFitGymCentre;
    }

    public FlipFitSlots addSlot(FlipFitSlots flipFitSlot){
      System.out.println("add Slot");
      return flipFitSlot;
    }

    public List<FlipFitGymCentre> viewCentres(FlipFitGymOwner flipFitGymOwner) {
      System.out.println("view centres");
      return null;
    }

    public List<FlipFitPayments> viewPayments() {
        System.out.println("Payments listed:> ");
        return null;
    }
    public FlipFitGymOwner editDetails(FlipFitGymOwner owner) throws InvalidChoiceException {
      System.out.println("edit details");
      return null;
    }
    public FlipFitGymOwner registerOwner(FlipFitGymOwner gymOwner) {
      System.out.println("register owner");
      return  gymOwner;
    }
    @Override
    public FlipFitUser login(FlipFitUser flipFitUser) {
      System.out.println("login");
      return flipFitUser;
    }
}

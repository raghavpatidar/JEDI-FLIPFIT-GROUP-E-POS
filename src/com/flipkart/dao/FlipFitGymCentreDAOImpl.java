package com.flipkart.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import com.flipkart.bean.FlipFitGymCentre;
import com.flipkart.bean.FlipFitSlots;

public class FlipFitGymCentreDAOImpl {
    Random rand = new Random();

//    public static void main(String[] args) {
//        FlipFitGymCentre FFGC = new FlipFitGymCentre();
//
//        //test part
//        FFGC.setOwnerID(344);
//        FFGC.setApproved(true);
//        FFGC.setCapacity(45);
//        FFGC.setCity("Pune");
//        FFGC.setState("MH");
//        FFGC.setPincode("411027");
//
//        FlipFitGymCentreDAOImpl FFGCDAO = new FlipFitGymCentreDAOImpl();
//
//
//        FFGCDAO.createGymCentre(FFGC);
//        FFGC.setPincode("560066");
//        FFGCDAO.updateGymCentre(FFGC);
//        FFGC.setCentreID(61);
//        FFGCDAO.deleteGymCentre(FFGC);
//        ArrayList<FlipFitGymCentre> arr = FFGCDAO.viewCentres("Pune");
//        for(FlipFitGymCentre ffgc : arr){
//            System.out.println(ffgc.getCentreID());
//        }
//        FFGC.setCentreID(187);
//        ArrayList<FlipFitSlots> ffsarr = FFGCDAO.viewAvailableSlots(FFGC);
//        for(FlipFitSlots fs : ffsarr){
//            System.out.println(fs.getSlotId());
//        }
//    }

    /**
     * createGymCentre
     * @param FFGC
     * @return
     */
    public FlipFitGymCentre createGymCentre(FlipFitGymCentre FFGC){
      System.out.println("createGymCentre");
      return null;
    };

    public FlipFitGymCentre updateGymCentre(FlipFitGymCentre FFGC){
      System.out.println("updateGymCentre");
      return null;
    };

    public void deleteGymCentre(FlipFitGymCentre FFGC){
      System.out.println("deleteGymCentre");
      return;
    };

    public ArrayList<FlipFitGymCentre> viewCentres(String city){
      System.out.println("viewCentres");
      return null;
    }

    public ArrayList<FlipFitSlots> viewAvailableSlots(FlipFitGymCentre FFGC){
      System.out.println("viewAvailableSlots");
      return null;

    };


}

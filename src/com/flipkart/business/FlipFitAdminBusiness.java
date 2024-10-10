package com.flipkart.business;
import com.flipkart.bean.*;
import com.flipkart.business.interfaces.IFlipFitAdmin;

import java.util.List;

public class FlipFitAdminBusiness implements IFlipFitAdmin {


    public FlipFitAdminBusiness(){

    }

    public boolean adminLogin(FlipFitAdmin flipFitAdmin){
      System.out.println("adminLogin");
      return true;
    }
    public List<FlipFitGymOwner> getPendingOwnerList(){
      System.out.println("getPendingOwnerList" );
      return null;
    }
    public List<FlipFitGymOwner> getApprovedOwnerList(){
      System.out.println("getApprovedOwnerList" );
      return null;
    }
    public List<FlipFitGymCustomer> getUserList(){

      System.out.println("getUserList" );
      return null;
    }
    public boolean validateOwner(int ownerId){
      System.out.println("validateOwner");
      return true;
    }
    public boolean deleteOwner(int ownerId){
      System.out.println("deleteOwner");
        return true;
    }
    public List<FlipFitGymCentre> getGymCentreUsingOwnerId(int ownerId){
      System.out.println("getGymCentreUsingOwnerId");
      return null;
    }

}

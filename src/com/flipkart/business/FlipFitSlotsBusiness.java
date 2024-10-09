package com.flipkart.business;

import com.flipkart.bean.FlipFitSlots;
import com.flipkart.business.interfaces.IFlipFitSlots;
import com.flipkart.dao.*;
import com.flipkart.dao.interfaces.IFlipFitGymOwnerDAO;
import com.flipkart.dao.interfaces.IFlipFitSlotDAO;

public class FlipFitSlotsBusiness implements IFlipFitSlots {


  public boolean updateAvailability(FlipFitSlots flipFitSlots) {
    System.out.println("Updating Slot Availability");
    return true;
  }

  public void getSlotDetails() {
    System.out.println("Getting Slot Details");
  }
}



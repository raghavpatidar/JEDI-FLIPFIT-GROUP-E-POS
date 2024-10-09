package com.flipkart.dao;

import com.flipkart.bean.FlipFitPayments;
import com.flipkart.dao.interfaces.IFlipFitPaymentsDAO;

import java.sql.SQLException;
import java.util.Random;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FlipFitPaymentsDAOImpl implements IFlipFitPaymentsDAO {
    Random rand = new Random();

    @Override
    public void setPaymentInfo(FlipFitPayments FFP) {
      System.out.println("setPaymentInfo");

    }

    @Override
    public void deletePaymentInfo(FlipFitPayments FFP) {
      System.out.println(
          "deletePaymentInfo"
      );
    }

}

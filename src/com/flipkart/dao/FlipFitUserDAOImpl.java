package com.flipkart.dao;

import com.flipkart.bean.FlipFitUser;
import com.flipkart.dao.interfaces.*;

import java.sql.*;
import java.util.Random;

public class FlipFitUserDAOImpl implements IFlipFitUserDAO {
    Random rand = new Random();

    @Override
    public FlipFitUser loginAsCustomer(String emailID, String password) {
      System.out.println("loginAsCustomer");
        return null;
    }

    @Override
    public FlipFitUser loginAsOwner(String emailID, String password) {
      System.out.println("loginAsOwner");
        return null;
    }

    @Override
    public void addUser(FlipFitUser FFU) {
      System.out.println("addUser");

    }

    @Override
    public void deleteUser(FlipFitUser FFU) {
      System.out.println("deleteUser");

    }

    @Override
    public void changeUser(FlipFitUser FFU) {
      System.out.println("changeUser");

    }

    @Override
    public FlipFitUser getUser(int userID) {
      System.out.println("getUser");
      return null;
    }
}

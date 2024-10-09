package com.flipkart.dao;
import com.flipkart.dao.interfaces.*;
import java.sql.*;
import com.flipkart.bean.FlipFitSlots;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlipFitSlotDAOImpl implements IFlipFitSlotDAO {

    @Override
    public FlipFitSlots addSlot(FlipFitSlots slot) {
        String sql = "INSERT INTO Slots (centreID, slotTime, seatsAvailable) VALUES (?, ?, ?)";
        try (Connection conn = GetConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, slot.getCentreId());
            stmt.setInt(2, slot.getSlotTime());
            stmt.setInt(3, slot.getSeatsAvailable());

            int affectedRows = stmt.executeUpdate(); // Use executeUpdate() for INSERT
            if (affectedRows == 0) {
                throw new SQLException("Creating slot failed, no rows affected.");
            }

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int slotID = generatedKeys.getInt(1);
                    slot.setSlotId(slotID);
                } else {
                    throw new SQLException("Creating slot failed, no ID obtained.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error adding slot: " + e);
        }
        return slot;
    }

    /**
     * deleteSlot
     * @param centreID
     * @param slotID
     * @return
     */
    @Override
    public boolean deleteSlot(int centreID, int slotID) {
      System.out.println("deleteSlots ");
        return false;
    }

    @Override
    public boolean changeSlot(FlipFitSlots slot) {
      System.out.println("ChangeSlot ");
        return true;
    }

    @Override
    public List<FlipFitSlots> getAllSlots(int centreID) {
      System.out.println("getAllSlots ");
        return null;
    }

    @Override
    public FlipFitSlots getSlotDetailsById(int slotId) {
      System.out.println("getSlotDetailsById ");
      return  null;
    }

    @Override
    public FlipFitSlots getSlotDetails(int startTime, int centreID) {
        System.out.println("getSlotDetails ");
        return null;
    }
}

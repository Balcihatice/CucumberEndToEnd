package stepdefinitions.dbstepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static stepdefinitions.MedunnaRoomStepDefs.roomNumber;

public class RoomDBStepDefs {

    @Given("Olusan odayi room_number ile dogrula")
    public void olusan_odayi_room_number_ile_dogrula() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db_v2", "select_user", "Medunna_pass_@6");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM \"public\".room ORDER BY created_date DESC");

        List<Integer> roomNumberList = new ArrayList<>();
        while (resultSet.next()) {

            roomNumberList.add(resultSet.getInt("room_number"));

        }

        System.out.println("roomNumberList = " + roomNumberList);

        assertTrue(roomNumberList.contains(roomNumber));
        System.out.println("roomNumberList = " + roomNumberList);

//        List<Integer> roomNumberList2 = new ArrayList<>();
//        while (resultSet.next()) {
//
//            roomNumberList2.add(resultSet.getInt(1));
//     Burada 1.sutundaki idleri liste atip ,bizim istedigimiz id var mi diye bakabiliriz
//        }
//        assertTrue(roomNumberList.contains(37290));
    }
}

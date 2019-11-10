package event;

import sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;

public class CreateEventDao {

	public static boolean checkBook(String eventId){
		boolean status=false;
		try{
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("idk what this does");
			ps.setString(1,eventId);
		    ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int save(String eventName, String eventId, String date, String time, 
							String venue, int maxCap, double price){
		int status=0;
	
			Connection con = DB.getConnection();
		try {	
			PreparedStatement ps=con.prepareStatement("insert into issuebooks(bookcallno,studentid,studentname,studentcontact) values(?,?,?,?)");
			ps.setString(1, eventName);
			ps.setString(2, eventId);
			ps.setString(3, date);
			ps.setString(4, time);
			ps.setString(5, venue);
			ps.setInt(6, maxCap);
			ps.setDouble(7, price);
			status = ps.executeUpdate();
			con.close();
			
		}catch (Exception e) {System.out.println(e);}
		return status;
	}
	public static int updatebook(String bookcallno){
		int status=0;
		int quantity=0,issued=0;
		try{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select quantity,issued from books where callno=?");
			ps.setString(1,bookcallno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				quantity=rs.getInt("quantity");
				issued=rs.getInt("issued");
			}
			
			if(quantity>0){
			PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where callno=?");
			ps2.setInt(1,quantity-1);
			ps2.setInt(2,issued+1);
			ps2.setString(3,bookcallno);
			
			status=ps2.executeUpdate();
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	}
}

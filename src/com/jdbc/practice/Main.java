package com.jdbc.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		try {
			
		//	System.out.println(" This is Tsting");
			
			Connection c=ConnectionProvider.getConnection();
			
			String q="insert into images(pic) values(?)";
			
			PreparedStatement pstmt = c.prepareStatement(q);
			
			JFileChooser jfc=new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file=getSelectedFile();
			
			FileImageInputStream fis=new FileInputStream(file);
			
			pstmt.setBinaryStream(1, fis, fis.availabele());
			
			pstmt.executeUpdate();
			
		// System.out.println("done...........");
			
			JOptionPane.showMessageDialog(null,"sucess");
			
			
		} catch (Exception e) {
	   	e.printStackTrace();
		
		}
		
		
		
	}

	private static File getSelectedFile() {
		// TODO Auto-generated method stub
		return null;
	}

}

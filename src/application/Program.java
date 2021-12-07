package application;

import java.text.ParseException;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Department dp = new Department(1, "Books");
		
		Seller obj = new Seller(1, "maria", "maria@email", new Date(), 1500.0, dp);
		
		System.out.println(obj);

	}

}

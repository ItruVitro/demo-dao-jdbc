package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1,"Sequissu");
		System.out.println(obj);
		
		Seller sl = new Seller(1,"Maria","maria@gmail.com", new Date(),2000.0,obj);
		System.out.println(sl);
	}

}

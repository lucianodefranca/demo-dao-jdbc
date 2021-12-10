package application;

import java.text.ParseException;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: findById department ======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
	
		
		sc.close();
	}
}

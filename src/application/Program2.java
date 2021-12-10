package application;

import java.text.ParseException;
import java.util.List;
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
		
		System.out.println("===== TEST 2: findAll department ======");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
		
//		System.out.println("===== TEST 3: Insert department ======");
//		Department newDep = new Department(null, "Tools");
//		departmentDao.insert(newDep);
//		System.out.println("Insert completed!");
		
		System.out.println();
		
//		System.out.println("===== TEST 4: DeleteById department ======");
//		System.out.println("Enter Id for delete test: ");
//		int id = sc.nextInt();
//		departmentDao.deleteById(id);
//		System.out.println("Delete completed!");
		
		System.out.println("===== TEST 5: Update department ======");
		dep = departmentDao.findById(4);
		dep.setName("Tools");
		departmentDao.update(dep);
		
		System.out.println("Update completed!");

		sc.close();
	}
}

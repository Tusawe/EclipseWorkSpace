package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestCars {

	private static CarDAO carDAO;
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			carDAO = new CarDAO(Helper.getDataFromFile(new File("data/car.json")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int iOption = 0;
		do {
			
			showMenu();
			String sOption = sc.next();
			if (sOption.matches("[0-5]")) {
				
				iOption = Integer.parseInt(sOption);
				executeCrud(iOption);
				
			}
			
		} while(iOption != 0);
		System.out.println("END APP.");
		
	}
	
	private static void executeCrud(int iOption) {
		
		switch (iOption) {
			case 0:
				exit();
				break;
				
			case 1:
				deleteByPlate();
				break;
				
			case 2:
				listAllCars();
				break;
				
			case 3:
				getCarByPlate();
				break;
				
			case 4:
				addCar();
				break;
				
			case 5:
				updateCar();
				break;

			default:
				break;
		}
		
	}

	private static void updateCar() {
		
		String model,brand,plate;
		do {
			
			System.out.println("Enter the model of car:");
			model = sc.nextLine();
			
		} while(!Helper.checkModel(model));
		
		do {
			
			System.out.println("Enter the brand of car:");
			brand = sc.nextLine();
			
		} while(!Helper.checkBrand(brand));

		do {
	
			System.out.println("Enter the plate of car:");
			plate = sc.next();
	
		} while(!Helper.checkPlate(plate));
		
		Car car = new Car(model,brand,plate);
		if (carDAO.updateCar(car)) System.out.println("Car updated.");
		else System.out.println("Car not updated.");
		
	}

	private static void addCar() {
		
		String model,brand,plate;
		do {
			
			System.out.println("Enter the model of car:");
			model = sc.nextLine();
			
		} while(!Helper.checkModel(model));
		
		do {
			
			System.out.println("Enter the brand of car:");
			brand = sc.nextLine();
			
		} while(!Helper.checkBrand(brand));

		do {
	
			System.out.println("Enter the plate of car:");
			plate = sc.next();
	
		} while(!Helper.checkPlate(plate));
		
		Car car = new Car(model,brand,plate);
		if (carDAO.addCar(car)) System.out.println("Car added.");
		else System.out.println("Car not added.");
		
	}

	private static void getCarByPlate() {
		
		String plate;
		do {
			
			System.out.println("Enter the plate of car:");
			plate = sc.next();
			
		} while(!Helper.checkPlate(plate));
		Car car = carDAO.getCar(plate);
		if (car == null) System.out.println("This plate don't exist.");
		else System.out.println(car);
		
	}

	private static void listAllCars() {
		
		Map<String, String[]> listCars = carDAO.getListCars();
		Set<String> plates = listCars.keySet();
		for (String plate : plates) {
			System.out.println(plate + ": " + Arrays.toString(listCars.get(plate)));
		}
		
	}

	private static void deleteByPlate() {
		
		String plate;
		do {
			
			System.out.println("Enter the plate of car:");
			plate = sc.next();
			
		} while(!Helper.checkPlate(plate));
		if (carDAO.deleteCarByPlate(plate)) System.out.println("Car deleted.");
		else System.out.println("Car not deleted.");
		
	}

	private static void exit() {
		// TODO Auto-generated method stub
		
	}

	public static void showMenu() {
		
		System.out.println("------------ MENU ------------");
		System.out.println("(0) Exit.");
		System.out.println("(1) Delete a car by plate.");
		System.out.println("(2) List of cars.");
		System.out.println("(3) Get car by plate.");
		System.out.println("(4) Add a car");
		System.out.println("(5) Update a car");
		System.out.print("Choose option: ");
		
	}
	
	

}

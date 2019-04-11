package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class CarDAO {

	Map<String, String[]> listCars;

	public CarDAO(Map<String, String[]> listCars) {
		this.listCars = listCars;
	}

	public void setListCars(Map<String, String[]> listCars) {
		this.listCars = listCars;
	}
	
	// Matodos CRUD (crear, leer, actualizar y borrar)
	
	// Add entry to map
	public boolean addCar(Car car) {
		
		if (car.getBrand() == null || 
				car.getModel() == null ||
				car.getPlate() == null ||
				listCars.containsKey(car.getPlate())) {
			
			return false;
			
		} else {
			
			String[] values = new String[2];
			values[0] =  car.getModel();
			values[1] =  car.getBrand();
			listCars.put(car.getPlate(), values);
			return true;
			
		}
		
	}
	
	// Read all cars
	public Map<String, String[]> getListCars() {
		
		return listCars;
		
	}
	
	// Read one car
	public Car getCar(String plate) {
	
		String[] values = listCars.get(plate);
		
		return new Car(values[0],values[1],plate);
		
	}
	
	// Update car
	public boolean updateCar(Car car) {
		
		if (car.getBrand() == null || 
				car.getModel() == null ||
				car.getPlate() == null ||
				!listCars.containsKey(car.getPlate())) {
			
			return false;
			
		} else {
			
			String[] values = new String[2];
			values[0] =  car.getModel();
			values[1] =  car.getBrand();
			listCars.put(car.getPlate(), values);
			return true;
			
		}
		
	}
	
	
	// Delete a car
	public boolean deleteCarByPlate(String plate) {
	
		return listCars.remove(plate) != null;
		
	}
	
	public static void main(String[] args) {
		
		try {
			CarDAO carDAO = new CarDAO(Helper.getDataFromFile(new File("data/car.json")));
			System.out.println(carDAO.addCar(new Car("modelo","marca","matricula")));
			System.out.println(carDAO.addCar(new Car("modelo","marca","matricula")));
			System.out.println(carDAO.deleteCarByPlate("matricula"));
			System.out.println(carDAO.deleteCarByPlate("matricula"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

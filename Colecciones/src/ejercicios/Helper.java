package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class Helper {

	public static Map<String,String[]> getDataFromFile(File file) throws FileNotFoundException {
		// Map<K,V> Key: plate Value: [model, brand]
		Map<String,String[]> listCars = new HashMap<>(); // map empty
		Gson gson = new Gson();
		BufferedReader in = new BufferedReader(new FileReader(file));
		Car[] cars = gson.fromJson(in, Car[].class);
		
		for (Car car : cars) {
			String[] values = new String[2];
//			System.out.println(car.getBrand() + ", " + 
//					car.getModel() + ", " + car.getPlate() + ".");
			values[0] =  car.getModel();
			values[1] =  car.getBrand();
			listCars.put(car.getPlate(), values);
		}
		
		return listCars;
		                                             
	}
	
	public static boolean checkPlate(String plate) {
		
		if (plate == null) return false; 
		
		return plate.toUpperCase().matches("[\\d]{4}-[A-Z]{3}");
		
	}
	
	public static boolean checkModel(String model) {
		
		if (model == null) return false; 
		
		return model.toUpperCase().matches("[A-Z\\d]+[-\\sA-Z\\d]*");
		
	}

	public static boolean checkBrand(String brand) {
	
	if (brand == null) return false; 
	
	return brand.toUpperCase().matches("[A-Z]+[-\\sA-Z]*[A-Z]");
	
}
	
	public static void main(String[] args) {
		
//		try {
//			
//			Map<String,String[]> listCars = getDataFromFile(new File("data/car.json"));
//			
//			for (String plate : listCars.keySet()) {
//				System.out.println(plate + " -> " + Arrays.toString(listCars.get(plate)));
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.println(checkPlate("1111-AAA"));
		
	}
	
}

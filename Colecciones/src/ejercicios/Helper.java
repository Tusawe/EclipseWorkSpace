package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

import com.google.gson.Gson;

public class Helper {

	public static Map<String,String[]> getDataFromFile(File file) throws FileNotFoundException {
		
		Gson gson = new Gson();
		BufferedReader in = new BufferedReader(new FileReader(file));
		Car[] cars = gson.fromJson(in, Car[].class);
		
		for (Car car : cars) {
			System.out.println(car.getBrand() + ", " + 
					car.getModel() + ", " + car.getPlate() + ".");
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		
		try {
			getDataFromFile(new File("data/car.json"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lafla
 */

public class BookingSystem implements BookingSystemInterface{
    
        
        @Override
        public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
        
        RentACarInterface rInterface = new RentACar();
        
        try{
            String title =in.readLine();
            rInterface.setName(title);
            while (in.ready()) {
            String carData[] =in.readLine().split(":"); 
            for (String cars : carData) {
                System.out.println(cars); }
            }
          
        } catch(FileNotFoundException e){}
        
        return null;
        

    
//
//    @Override
//    public RentACarInterface setupRentACar(BufferedReader in) throws IOException {
//    //setting up the buffered reader and the different attributes to be read
//    String title =in.readLine();
//    String make ="";
//    int dailyRate =0;
//    int availability =0;
//    String carDetails ="";
//    ArrayList<Car> CarList = new ArrayList();
//    
//    //we call the car interface and make a new one called fleet
//    CarInterface car = new Car();
//    //we need a loop to read through the document
//    while(title !=null){
//        //we read the first line as the car details
//        carDetails = in.readLine();
//        CarList.add(carDetails);
//        
//        //fleet car1= new fleet(make,dailyRate,availability);
//        //car.addItem(car);
//        make = in.readLine();
//        
//    }
//    return car;
//    }
} 
}

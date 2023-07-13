package com.Cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- Create the Properties object (create object)
    //make it "private" so we are limiting access to the object
    //"static" is to make sure its created and loaded before everything else.


    //1. Create a properties Object (create Object)
    static private Properties properties = new Properties();

    static {
        //2. Create a file using FileInputStream (open file)



        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            //3. Load the "properties" object with "file" (load properties)
            properties.load(file);

            //CLOSE THE FILE IN THE MEMORY to save memory
            file.close();

        } catch (IOException e) {

            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!");
            e.printStackTrace();
        }

    }
    // create a utility method to use the object to read
    //4. Use "properties" object to read from the file (read properties)

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
        //this getproperty method coming from propertiies pbject that we create in 1. step
    }


}

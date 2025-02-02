package org.hibernate.createobject;

import org.hibernate.Address;
import org.hibernate.Student;

import java.util.Date;

import static org.hibernate.utils.Utils.readImage;


public class CreateObject {

    // Create a new Student object
    public static Student createStudent() {
        Student student = new Student();
        student.setName("demo user");
        student.setSAge(18);
        student.setCreatedAt(new Date());

        // Read and set image data
        byte[] imageData = readImage("src/signature.jpg");
        if (imageData != null) {
            student.setImage(imageData);
        }
        return student;
    }

    // Create a new Address object
    public static Address createAddress() {
        Address address = new Address();
        address.setCity("a");
        address.setCountry("india");
        address.setPostalCode("111111");
        address.setStreet("456");
        address.setState("Uttar Meerut");
        return address;
    }


}

package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Patient {
    String name, gender, patient_id, location, hosp_name, doc_name;
    int age, pres;
    long mob_num, hosp_num;

    Scanner sc = new Scanner(System.in);

    Patient() throws IOException {
        System.out.println("Do you have a prescription?");
        System.out.println("Enter 1 if you have a prescription");
        System.out.println("Enter 0 if you don't have a prescription");
        pres = sc.nextInt();
        sc.nextLine();
        if (pres == 1) {
            System.out.println("Enter the Name of hospital: ");
            hosp_name = sc.nextLine();
            System.out.println("Enter the Name of doctor: ");
            doc_name = sc.nextLine();
            System.out.println("Enter your patient id: ");
            patient_id = sc.nextLine();
            System.out.println("Enter Contact number of hospital: ");
            hosp_num = sc.nextInt();
            System.out.print("-----------------------------------\n");
            System.out.println("Enter the details of patient");
            sc.nextLine();
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Enter gender: ");
            gender = sc.nextLine();
            System.out.println("Enter location: ");
            location = sc.nextLine();
            System.out.println("Enter age: ");
            age = sc.nextInt();
            System.out.println("Enter mobile number: ");
            mob_num = sc.nextLong();
        }
        else if(pres == 0)
            System.out.println("Sorry we cannot provide you with any medicine");
        else
            System.out.println("Invalid input!!");

        if(pres == 1) {
            FileWriter output2 = new FileWriter("Patient.txt", true);
            output2.write(name + "\t" + age + "\t" + gender + "\t" + location + "\t" + mob_num + "\t" + hosp_name + "\t" + patient_id + "\t" + doc_name + "\t" + hosp_num + "\t");
            output2.close();
        }

    }
}

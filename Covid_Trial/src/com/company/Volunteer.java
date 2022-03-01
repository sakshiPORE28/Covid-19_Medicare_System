package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Volunteer {
    String name, gender, location, qualification, vaccine_name, vaccine1_date, vaccine2_date;
    int age, no_of_doses, ch;
    long mob_num;

    Scanner sc = new Scanner (System.in);

    Volunteer() throws IOException {
        System.out.println("Enter number of doses: ");
        no_of_doses = sc.nextInt();
        sc.nextLine();
        if(no_of_doses==2)
        {
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Enter qualification: ");
            qualification = sc.nextLine();
            System.out.println("Enter gender: ");
            gender = sc.nextLine();
            System.out.println("Enter location: ");
            location = sc.nextLine();
            System.out.println("Enter age: ");
            age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter mobile number: ");
            mob_num = sc.nextLong();
            sc.nextLine();
            System.out.println("Vaccine details: ");
            System.out.println("1. Covishield   2. Covaxine     3. Sputnik V");
            ch = sc.nextInt();
            sc.nextLine();
            if(ch == 1) {
                vaccine_name = "Covishield";
                System.out.println("Enter the date of dosage 1: ");
                vaccine1_date = sc.nextLine();
                System.out.println("Enter the date of dosage 2: ");
                vaccine2_date = sc.nextLine();
            }
            else if(ch == 2) {
                vaccine_name = "Covaxine";
                System.out.println("Enter the date of dosage 1: ");
                vaccine1_date = sc.nextLine();
                System.out.println("Enter the date of dosage 2: ");
                vaccine2_date = sc.nextLine();

            }
            else {
                vaccine_name = "Sputnik V";
                System.out.println("Enter the date of dosage 1: ");
                vaccine1_date = sc.nextLine();
                System.out.println("Enter the date of dosage 2: ");
                vaccine2_date = sc.nextLine();


            }
        }
        else
            System.out.println("Sorry, cannot be a volunteer as you are not completely vaccinated!!");

        if(no_of_doses == 2) {
            FileWriter output3 = new FileWriter("Volunteer.txt", true);
            output3.write(name + "\t" + age + "\t" + gender + "\t" + qualification + "\t" + location + "\t" + mob_num + "\t" + vaccine_name + "\t" + vaccine1_date + "\t" + vaccine2_date + "\n");
            output3.close();
        }



    }
}

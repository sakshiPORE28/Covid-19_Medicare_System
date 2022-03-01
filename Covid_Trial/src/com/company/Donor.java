package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Donor {
    String name, gender, location;
    int age;
    long mob_num;

    Scanner sc = new Scanner(System.in);

    Donor() throws IOException {
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

        FileWriter output1 = new FileWriter("Donor.txt", true);
        output1.write(name + "\t" + age + "\t" + gender + "\t" + location + "\t" + mob_num + "\t");
        output1.close();


    }
}

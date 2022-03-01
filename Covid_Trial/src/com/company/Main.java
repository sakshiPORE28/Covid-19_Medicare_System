package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
	// write your code here

        Scanner sc = new Scanner(System.in);

        String med_name = null, med_company = null, loc, vol = null;
        int med_count = 10, quantity_donor, quantity_patient;



        File myFile1 = new File("Donor.txt");
        if(myFile1.createNewFile())
            System.out.println();
        else
            System.out.println();

        File myFile2 = new File("Patient.txt");
        if(myFile2.createNewFile())
            System.out.println();
        else
            System.out.println();

        File myFile3 = new File("Volunteer.txt");
        if(myFile3.createNewFile())
            System.out.println();
        else
            System.out.println();

        File myFile4 = new File("Medicine.txt");
        if(myFile4.createNewFile())
            System.out.println();
        else
            System.out.println();

        String months[] = {
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul",
                "Aug",
                "Sep",
                "Oct",
                "Nov",
                "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));


//        FileWriter output4 = new FileWriter("Medicine.txt", true);
//        output4.write(" 1] ABC1 \t XYZ1 \n ");
//        output4.write("2] ABC2 \t XYZ2 \n ");
//        output4.write("3] ABC3 \t XYZ3 \n ");
//        output4.write("4] ABC4 \t XYZ4 \n ");
//        output4.write("5] ABC5 \t XYZ5 \n ");
//        output4.write("6] ABC6 \t XYZ6 \n ");
//        output4.write("7] ABC7 \t XYZ7 \n ");
//        output4.write("8] ABC8 \t XYZ8 \n ");
//        output4.write("9] ABC9 \t XYZ9 \n ");
//        output4.write("10] ABC10 \t XYZ10 \n ");
//        output4.close();

        System.out.println("\n                                    MAIN MENU");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("1. Donor    2. Volunteer    3. Patient");
        System.out.println("-----------------------------------------------------------------------------------");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch)
        {
            case 1:
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                      **DONOR SECTION**");
                System.out.println("--------------------------------------------------------------------------------");
                Donor donor = new Donor();
                Scanner sc4 = new Scanner(myFile4);
                while (sc4.hasNextLine()) {
                    String line = sc4.nextLine();
                    System.out.println(line);
                }
                sc4.close();
                System.out.println("Enter the medicine number: ");
                int ch1 = sc.nextInt();
                sc.nextLine();
                switch(ch1)
                {
                    case 1:
                        med_name = "ABC1";
                        med_company = "XYZ1";
                        break;
                    case 2:
                        med_name = "ABC2";
                        med_company = "XYZ2";
                        break;
                    case 3:
                        med_name = "ABC3";
                        med_company = "XYZ3";
                        break;
                    case 4:
                        med_name = "ABC4";
                        med_company = "XYZ4";
                        break;
                    case 5:
                        med_name = "ABC5";
                        med_company = "XYZ5";
                        break;
                    case 6:
                        med_name = "ABC6";
                        med_company = "XYZ6";
                        break;
                    case 7:
                        med_name = "ABC7";
                        med_company = "XYZ7";
                        break;
                    case 8:
                        med_name = "ABC8";
                        med_company = "XYZ8";
                        break;
                    case 9:
                        med_name = "ABC9";
                        med_company = "XYZ9";
                        break;
                    case 10:
                        med_name = "ABC10";
                        med_company = "XYZ10";
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                System.out.println("Enter quantity: ");
                quantity_donor = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter location once again for confirmation: ");
                loc = sc.nextLine();
                if(Objects.equals(loc, "Mumbai"))
                {
                    vol = "Raj (845697123)";
                    System.out.println("The volunteer you received is " + vol);
                }
                else if(Objects.equals(loc, "Pune"))
                {
                    vol = "Sarika (456987123)";
                    System.out.println("The volunteer you received is " + vol);
                }
                else if(Objects.equals(loc, "Nasik"))
                {
                    vol = "Wahim (456321789)";
                    System.out.println("The volunteer you received is " + vol);
                }
                FileWriter output1 = new FileWriter("Donor.txt", true);
                output1.write(med_name + "\t" + med_company + "\t" + quantity_donor + "\t" + vol + "\t");
                output1.close();
                Medicine medicine = new Medicine();


                break;
            case 2:
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                      **VOLUNTEER SECTION**");;
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("1. New Volunteer entry  2. Existing volunteer list  3. Existing donor list   4. Existing patient list   5. Existing medicine list   6. New medicine entry");
                int ch2 = sc.nextInt();
                switch (ch2)
                {
                    case 1:
                        Volunteer volunteer = new Volunteer();
                        break;
                    case 2:
                        Scanner sc3 = new Scanner(myFile3);
                        while (sc3.hasNextLine()) {
                            String line = sc3.nextLine();
                            System.out.println(line);
                        }
                        sc3.close();
                        break;
                    case 3:
                        Scanner sc1 = new Scanner(myFile1);
                        while (sc1.hasNextLine()) {
                            String line = sc1.nextLine();
                            System.out.println(line);
                        }
                        sc1.close();
                        break;
                    case 4:
                        Scanner sc2 = new Scanner(myFile2);
                        while (sc2.hasNextLine()) {
                            String line = sc2.nextLine();
                            System.out.println(line);
                        }
                        sc2.close();
                        break;
                    case 5:
                        sc4 = new Scanner(myFile4);
                        while (sc4.hasNextLine()) {
                            String line = sc4.nextLine();
                            System.out.println(line);
                        }
                        sc4.close();
                        break;
                    case 6:
                        sc.nextLine();
                        System.out.println("Enter medicine name: ");
                        med_name = sc.nextLine();
                        System.out.println("Enter medicine company: ");
                        med_company = sc.nextLine();
                        med_count++;
                        FileWriter output4 = new FileWriter("Medicine.txt", true);
                        output4.write(med_count + "] " + med_name + "\t" + med_company + "\n");
                        output4.close();
                        break;

                    default:
                        System.out.println("Invalid input");

                }
                break;
            case 3:
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                      **PATIENT SECTION**");
                System.out.println("--------------------------------------------------------------------------------");
                Patient patient = new Patient();
                sc4 = new Scanner(myFile4);
                while (sc4.hasNextLine()) {
                    String line = sc4.nextLine();
                    System.out.println(line);
                }
                sc4.close();
                System.out.println("Enter the medicine number: ");
                int ch3 = sc.nextInt();
                sc.nextLine();
                switch(ch3)
                {
                    case 1:
                        med_name = "ABC1";
                        med_company = "XYZ1";
                        break;
                    case 2:
                        med_name = "ABC2";
                        med_company = "XYZ2";
                        break;
                    case 3:
                        med_name = "ABC3";
                        med_company = "XYZ3";
                        break;
                    case 4:
                        med_name = "ABC4";
                        med_company = "XYZ4";
                        break;
                    case 5:
                        med_name = "ABC5";
                        med_company = "XYZ5";
                        break;
                    case 6:
                        med_name = "ABC6";
                        med_company = "XYZ6";
                        break;
                    case 7:
                        med_name = "ABC7";
                        med_company = "XYZ7";
                        break;
                    case 8:
                        med_name = "ABC8";
                        med_company = "XYZ8";
                        break;
                    case 9:
                        med_name = "ABC9";
                        med_company = "XYZ9";
                        break;
                    case 10:
                        med_name = "ABC10";
                        med_company = "XYZ10";
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                System.out.println("Enter quantity: ");
                quantity_patient = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter location once again for confirmation: ");
                loc = sc.nextLine();
                if(Objects.equals(loc, "Mumbai"))
                {
                    vol = "Raj (845697123)";
                    System.out.println("The volunteer you received is " + vol);
                }
                else if(Objects.equals(loc, "Pune"))
                {
                    vol = "Sarika (456987123)";
                    System.out.println("The volunteer you received is " + vol);
                }
                else if(Objects.equals(loc, "Nasik"))
                {
                    vol = "Wahim (456321789)";
                    System.out.println("The volunteer you received is " + vol);
                }
                FileWriter output2 = new FileWriter("Patient.txt", true);
                output2.write(med_name + "\t" + med_company + "\t" + quantity_patient + "\n");
                output2.close();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}



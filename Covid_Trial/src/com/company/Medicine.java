package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Medicine {
    String mfg_date, exp_date;

    Scanner sc = new Scanner(System.in);

    Medicine() throws ParseException, IOException {
        System.out.println("Enter manufacturing date: ");
        mfg_date = sc.nextLine();
        System.out.println("Enter expiry date: ");
        exp_date = sc.nextLine();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        String current_date = dtf.format(now);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        Date firstDate = sdf.parse(current_date);
        Date secondDate = sdf.parse(exp_date);

        long diff = secondDate.getTime() - firstDate.getTime();

        TimeUnit time = TimeUnit.DAYS;
        long difference = time.convert(diff, TimeUnit.MILLISECONDS);
//       System.out.println("The difference in days is : "+difference);

        String status = "Medicine declined";
        if (difference >= 30) {
            status = "Medicine accepted";
            System.out.println(status);

        }
        else
            System.out.println(status);

        FileWriter output4 = new FileWriter("Donor.txt", true);
        output4.write(mfg_date + "\t" + exp_date + "\t" + status + "\n");
        output4.close();


    }
    void new_med() throws IOException {
        String med_name, med_company;
        System.out.println("Enter medicine name: ");
        med_name = sc.nextLine();
        System.out.println("Enter medicine company: ");
        med_company = sc.nextLine();

        FileWriter output4 = new FileWriter("Medicine.txt", true);
        output4.write(med_name + "\t" + med_company + "\n");
        output4.close();
    }
}

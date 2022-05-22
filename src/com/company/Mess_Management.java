package com.company;

import java.util.*;

public class Mess_Management extends Thread
{
    static int var1 = 0; // var1 uses for Student detail purpose

    public static void main(String[] args) {

        Add_Student[] add_student = new Add_Student[100];
        boolean flag_ = true;

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("********* \t\t MESS MANAGEMENT SYSTEM \t\t********");
        System.out.println(" ");






        while (flag_) {
            System.out.println("\n1.Student Section \n2.Attendance \n3.Meal Management\n4.EXIT");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n1-Add New Student \n2-Update Student Details\n3-Display Student's detail");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            add_student[var1] = new Add_Student();
                            String name_, father_name, roll_;
                            long reg_;
                            int fee_;
                            long phone_no;
                            System.out.println("Enter The Following Details\n");

                            System.out.print("Name of Student\t");
                            name_ = sc.next();
                            add_student[var1].setName(name_);

                            System.out.print("Father's name\t");
                            father_name = sc.next();
                            add_student[var1].setFather_name(father_name);
                            System.out.print("Student's roll no\t");
                            roll_ = sc.next();
                            add_student[var1].setRoll_number(roll_);
                            System.out.print("Student's Reg no\t");
                            reg_ = sc.nextInt();
                            add_student[var1].setReg_number(reg_);
                            System.out.print("Student's Phone no\t");
                            phone_no = sc.nextLong();
                            add_student[var1].setPhone_number(phone_no);
                            System.out.print("Enter Amount to Paid\t");
                            fee_ = sc.nextInt();
                            add_student[var1].setFee(fee_);
                            add_student[var1].setAtt();
                            System.out.println("Successfully Added");
                            var1++;
                            break;

                        case 2:
                            System.out.println("Enter Reg no of student to update\t");
                            long reg_temp = sc.nextLong();
                            int temp = 0;
                            boolean flag = false;
                            for (int i = 0; i < var1; i++) {
                                if (reg_temp == add_student[i].getReg_number()) {
                                    temp = i;
                                    flag = true;
                                    break;
                                }
                            }

                            if (!flag) {
                                System.out.println("Student Reg no didn't match. Please Enter valid reg no\t");
                                break;
                            }

                            String name__, father_name_, roll__;
                            long reg__;
                            int fee__;
                            long phone_no_;
                            System.out.println("Enter The Following Details");
                            System.out.println("Name of Student\t");
                            name__ = sc.next();
                            add_student[temp].setName(name__);
                            System.out.println("Father's name\t");
                            father_name_ = sc.next();
                            add_student[temp].setFather_name(father_name_);
                            System.out.println("Student's roll no\t");
                            roll__ = sc.next();
                            add_student[temp].setRoll_number(roll__);
                            System.out.println("Student's Reg no\t");
                            reg__ = sc.nextInt();
                            add_student[temp].setReg_number(reg__);
                            System.out.println("Student's Phone no\t");
                            phone_no_ = sc.nextLong();
                            add_student[temp].setPhone_number(phone_no_);
                            System.out.print("Enter Amount to Paid\t");
                            fee__ = sc.nextInt();
                            add_student[temp].setFee(fee__);
                            System.out.println("Updated Successfully");
                            break;

                        case 3:
                            System.out.print("\nEnter Reg no of student You want to see detail\t");
                            reg_temp = sc.nextLong();
                            temp = 0;
                            flag = false;
                            for (int i = 0; i < var1; i++) {
                                if (reg_temp == add_student[i].getReg_number()) {
                                    temp = i;
                                    flag = true;
                                }
                            }

                            if (!flag) {
                                System.out.println("Student Reg no didn't match. Please Enter valid reg no");
                                break;
                            }
                            System.out.println("\nName of Student : \t" + add_student[temp].getName());

                            System.out.println("Father's name : \t" + add_student[temp].getFather_name());

                            System.out.println("Student's roll no : \t" + add_student[temp].getRoll_number());

                            System.out.println("Student's Reg no : \t" + add_student[temp].getReg_number());

                            System.out.println("Student's Phone no : \t" + add_student[temp].getPhone_number());


                            break;

                        default:
                            System.out.println("Enter valid input");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("\nEnter Reg no of student You want mark attendance\t");
                    long reg_temp = sc.nextLong();
                    boolean flag = false;
                    int temp = 0;
                    for (int i = 0; i < var1; i++) {
                        if (reg_temp == add_student[i].getReg_number()) {
                            flag = true;
                            temp = i;
                        }
                    }

                    if (!flag) {
                        System.out.println("Student Reg no didn't match. Please Enter valid reg no");
                        break;
                    }
                    System.out.println("Student's with reg_no " + add_student[temp].getName() + "present " + add_student[temp].getAttCount() + " day");
                    System.out.print("Type YES to mark attendance \t");
                    String mark = sc.next();
                    if (mark == "YES" || mark == "yes" || mark == "Yes") {
                        add_student[temp].setAtt();
                    }
                    System.out.println("Successfully attendance marked");
                    break;

                case 3:
                    Meal meal = new Meal();

                    System.out.println("\n1-Display Menu Chart\n2-Edit Menu Chart\n3-Meal Inventory\n");
                    int temp1= sc.nextInt();
                    switch (temp1){
                        case 1:
                            meal.printMealChart();
                            break;
                        case 2:
                            meal.editMeal();
                            break;
                        case 3:
                            Inventry inventry = new Inventry();
                            inventry.invent_();
                            break;
                        default:
                            break;
                    }
                    break;

                case 4:
                    flag_ = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}


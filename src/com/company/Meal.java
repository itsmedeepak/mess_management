package com.company;


import java.util.Scanner;

public class Meal {
        String[] days = {"SCHEDULE","SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        String[] mrngMeal = {"BREAKFAST ","Dosa  ", "Vada Sambhar", "Pav Bhaji", "Idli Chutney", "Sandwich", "Upma", "Puri Sabzi"};
        String[] noonMeal = {"LUNCH     ","Biryani ", "Seasonal Veg", "Besan Sabji", "Paneer Curry", "Fried Rice", "Khichdi", "Seasonal Veg"};
        String[] nitMeal = {"DINNER    ","Chole Batore", "Soya Chilli", "Tadka Curry", "Dum Aloo", "Chana Choksy", "Mix Veg", "Potato Chilli"};

        public void printMealChart(){
            for (int i = 0; i < 57; i++) {
                System.out.print("-");
            }
            System.out.print("WEEKLY-ROUTINE");
            for (int i = 0; i < 58; i++) {
                System.out.print("-");
            }
            System.out.print("\n");
            for (int i = 0; i < 129; i++) {
                System.out.print("-");
            }
            System.out.println();
            for (int i = 0; i < 8; i++) {
                System.out.printf("|%14s\t", days[i]);
            }
            System.out.print("|\n");
            for (int i = 0; i < 129; i++) {
                System.out.print("-");
            }
            System.out.println();
            for (int i = 0; i < 8; i++) {
                System.out.printf("|%14s\t", mrngMeal[i]);
            }
            System.out.print("|\n");
            for (int i = 0; i < 8; i++) {
                System.out.printf("|%14s\t", noonMeal[i]);
            }
            System.out.print("|\n");
            for (int i = 0; i < 8; i++) {
                System.out.printf("|%14s\t", nitMeal[i]);
            }
            System.out.print("|\n");
            for (int i = 0; i < 129; i++) {
                System.out.print("-");
            }
        }

        public void editMeal() {
            int dayNum;    // from 1(Sunday) to 7(Saturday)
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nEnter Day at which to change meal (1(SUN) to 7(SAT)): ");
            dayNum = sc.nextInt();
            if (dayNum < 1 || dayNum > 7) {
                System.out.println("\n\nInvalid day entered, must be in range of 1 to 7.");
                return;
            }
            System.out.println("\n\nEnter Duration at which to change meal:");
            System.out.println("1.MORNING \n2.AFTER-NOON \n3.NIGHT \n4.Cancel \n\n\t>> ");
            op = sc.nextInt();
            System.out.println("\n\nEnter the new meal:\n");
            String meal = sc.nextLine();
            meal = sc.nextLine();
            switch (op) {
                case 1:
                    mrngMeal[dayNum] = meal;
                    System.out.println("\n" + mrngMeal[0] + " of " + days[dayNum] + " is updated to " + meal);
                    break;

                case 2:
                    noonMeal[dayNum] = meal;
                    System.out.println("\n" + noonMeal[0] + " of " + days[dayNum] + " is updated to " + meal);
                    break;

                case 3:
                    nitMeal[dayNum] = meal;
                    System.out.println("\n" + nitMeal[0] + " of " + days[dayNum] + " is updated to " + meal);
                    break;

                case 4:
                    System.out.println("\nMeal alteration cancelled.");
                    break;

                default:
                    System.out.println("Invalid input fed, must be in range of 1 to 3.");
            }
            System.out.println("\n");
        }
    }


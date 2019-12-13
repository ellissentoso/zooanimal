package com.company;
import jdk.nashorn.internal.runtime.regexp.joni.ast.EncloseNode;

import java.util.Scanner;  // Import the Scanner class

/* Name: Ellis Sentoso
 *  Professor: LaDawn Meade
 *  Class: CS1B - Java
 *  Assignment: Object Arrays of Zoo Animals
 *  Email: ellissentoso@gmail.com
 *  Date: 11/12/2019
 */

public class Main {

    public static void main(String[] args) {


        String animal_type;
        int anim_min_temp;
        int anim_max_temp;
        int animal_num;
        int ID;
        int used = 0;
        boolean quit = false;

        //  animal animal1 = new animal(); // create or instantiate an object
        // create an array of objects for my zoo animals
        // User tells me everything
        iAnimal[] list = new iAnimal[10];


        // Ask how many animals
        // Get the animals like Pig etc

        Scanner input= new Scanner(System.in);  // Create a Scanner object

//        Scanner input = new Scanner(System.in);  // Create a Scanner object

        int choice = 0;


        do {
            System.out.println("Choose a class ");

            System.out.println("1. animal ");

            System.out.println("2. Whale ");

            System.out.println("3. quit ");

            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    do {
                        System.out.println("How many animals do you have to input?");
                        animal_num = input.nextInt();
                    } while (animal_num < 0);


                    for (int i = 0; i < animal_num; i++) {
                        Scanner inputStream = new Scanner(System.in);  // Create a Scanner object

                        System.out.println("Which animal to input");
                        animal_type = inputStream.nextLine();
                        System.out.println("What is the minimum temperature?");
                        anim_min_temp = inputStream.nextInt();
                        System.out.println("What is the maximum temperature?");
                        anim_max_temp = inputStream.nextInt();
                        System.out.println("What is the ID?");
                        ID = inputStream.nextInt();
                        System.out.println(animal_type);
                        animal animal_object = new animal(animal_type, ID, anim_min_temp, anim_max_temp);

                        int j = 0;
                        boolean exist = true; // set bool to true

                        // while loop
                        while (exist) { // enter the loop
                            exist = false; // Turn the loop off
                            while (j < used && !exist) { // if this is false for the exist loop, enter this loop
                                if (animal_object.getAnimalType().compareTo(list[j].getAnimalType()) == 0) {
                                    exist = true; // there is a duplicate
                                    System.out.println("Duplicate ERROR. Animal is already in the list"); // Send a message to the user
                                    //ist[used] = animal_object;
                                    // list[used++];, stop when capacity and used
                                }

                                ++j;
                            }
//                list[used] = animal_object; // If there is not duplicate, add to the list
//                exist = false; // Do we need to turn this of??????
                        }
                        if (exist) {
                            System.out.println("Which animal to input");
                            animal_type = inputStream.nextLine();
                            System.out.println("What is the minimum temperature?");
                            anim_min_temp = inputStream.nextInt();
                            System.out.println("What is the maximum temperature?");
                            anim_max_temp = inputStream.nextInt();
                            System.out.println("What is the ID?");
                            ID = inputStream.nextInt();
                            System.out.println(animal_type);
                            animal_object = new animal(animal_type, ID, anim_min_temp, anim_max_temp); // ?????????
                        } else {
                            list[used] = animal_object;
                            used++; // increase the number of used space
                            System.out.println("Animal added in loop");
                        }

                    }

                    // list[0] = animal1;
                    for (int i = 0; i < 10; i++) {
                        System.out.print(list[i]);

                    }
                }

                break;
                case 2:
                    Whale fish = new Whale();
                    fish.setIdTag(used);
                    list[used] = fish;
                    used++;
                    break;

                case 3:
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid cmd");
                    break;

            }

        } while (!quit);




    }
}


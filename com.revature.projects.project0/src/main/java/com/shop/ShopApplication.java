package com.shop;

import com.shop.exceptions.InvalidCredentialException;
import com.shop.exceptions.UserNotFoundException;
import com.shop.model.User;
import com.shop.repository.*;
import com.shop.service.*;

import java.util.Scanner;

public class ShopApplication {
    static Scanner scanner = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static boolean isCustomer = false;
    static boolean isEmployee = false;
    static boolean isManager = false;

    static ItemRepository itemRepository= new JdbcItemRepository();
    static ItemService itemService = new ItemServiceImplem(itemRepository);
    static EmployeeService employeeService = new EmployeeServiceImplem(itemRepository);

    static UserRepository userRepository = new JdbcUserRepository();
    static UserService userService = new UserServiceImple(userRepository);

    static CustomerService customerService = new CustomerServiceImplem(itemRepository);

    static EmployeeRepository employeeRepository = new JdbcEmployeeRepository();
    static ManagerService managerService = new ManagerServiceImplem(employeeRepository);


    public static void main(String[] args) {
        while(true){
            System.out.println("\n Welcome to the Auction shop Please select a choice: ");
            System.out.println(" \n \n");
            if(!isCustomer) {
                System.out.println("" +
                        "1- register to be a customer \n"+
                        " ");
            }
            if(isCustomer && !isLoggedIn) {
                System.out.println("" +
                        "2- login \n"+
                        " ");
            }
            if(isCustomer && isLoggedIn) {
                System.out.println("" +
                        "3- view available items \n"+
                        "4- make offer for an item"+
                        "5- View owned items"+
                        "6- View remaining payments for an item");
            }
            if(isManager){
                System.out.println(" "+
                        "7- Hire employee"+
                        "8- Fire employee");
            }
            if(isEmployee){
                System.out.println( " "+
                        "9- Add Item to the shop "+
                        "10- View Offers" +
                        "11- Accept Offer "+
                        "12- reject offer"+
                        "13- Remove an item from shop "+
                        "14- View All payments "+
                        "15- Edit Item "+
                        "16- Edit Item Name"+
                        "17- Edit Item Price");
            }
            int choice = scanner.nextInt();

            switch (choice){
                case 1: {
                    handleChoice1();
                    break;
                }
                case 2: {
                    handleChoice2();
                    break;
                }
                case 3:{
                    handleChoice3();
                    break;
                }
                case 4: {
                    handleChoice4();
                    break;
                }
                case 5: {
                    handleChoice5();
                    break;
                }
                case 6:{
                    handleChoice6();
                    break;
                }
                case 7: {
                    handleChoice7();
                    break;
                }
                case 8: {
                    handleChoice8();
                    break;
                }
                case 9:{
                    handleChoice9();
                    break;
                }
                case 10: {
                    handleChoice10();
                    break;
                }
                case 11: {
                    handleChoice11();
                    break;
                }
                case 12:{
                    handleChoice12();
                    break;
                }
                case 13: {
                    handleChoice13();
                    break;
                }
                case 14:{
                    handleChoice14();
                    break;
                }
                case 15: {
                    handleChoice15();
                    break;
                }
                case 16: {
                    handleChoice16();
                    break;
                }
                case 17:{
                    handleChoice17();
                    break;
                }


            }
        }
    }
    // Handle the choices
    private static void handleChoice1() {
        scanner.nextLine();

        System.out.println("Email !");
        String email = scanner.nextLine();

        System.out.println("Password !");
        String password = scanner.nextLine();

        System.out.println("Name !");
        String name = scanner.nextLine();

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);
        userService.register(user);
        isCustomer = true;
    }
    private static void handleChoice2(){
        scanner.nextLine();
        System.out.println("Enter Email");
        String email = scanner.nextLine();
        System.out.println("Enter Password");
        String password = scanner.nextLine();
        try {
            currentUser = userService.login(email, password);
            todoService.setUser(currentUser);
            System.out.println("login successful");
        } catch (UserNotFoundException | InvalidCredentialException e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    private static void handleChoice3(){}
    private static void handleChoice4(){}
    private static void handleChoice5(){}
    private static void handleChoice6(){}
    private static void handleChoice7(){}
    private static void handleChoice8(){}
    private static void handleChoice9(){}
    private static void handleChoice10(){}
    private static void handleChoice11(){}
    private static void handleChoice12(){}
    private static void handleChoice13(){}
    private static void handleChoice14(){}
    private static void handleChoice15(){}
    private static void handleChoice16(){}
    private static void handleChoice17(){}

}
package com.andrmatt.challenge_literatura.principle;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.andrmatt.challenge_literatura.service.ConsumerAPI;
import com.andrmatt.challenge_literatura.service.ConverterData;
import com.andrmatt.challenge_literatura.service.ImplConverterData;

public class App {

    private final Scanner KEYBOARD = new Scanner(System.in);
    private final ConsumerAPI CONSUMER_API = new ConsumerAPI();
    private final ConverterData CONVERTER_DATA = new ImplConverterData();
    private Integer option = -1;

    public App() {
        this.runAppplication();
    }

    private void runAppplication() {

        do {
            showMenu();

            try {

                System.out.print("Ente Number Operation : ");
                option = KEYBOARD.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Searching Books For Title ...");
                        getBookResults();
                        break;

                    case 2:
                        System.out.println("showing Registered Books ...");
                        break;

                    case 3:
                        System.out.println("Showing Registered Authors ...");
                        break;

                    case 4:
                        System.out.println("Showing Alive Authors From ...");
                        break;

                    case 5:
                        System.out.println("showing Books By Languages ...");
                        showAllowedLanguages();
                        break;

                    case 6:
                        System.out.println("Testing App");

                        break;

                    case 0:
                        System.out.println("""
                                ************************************
                                *      Exiting the Application ... *
                                ************************************""");
                        break;

                    default:
                        System.out.println("Invalid Number Operation, Try Again");
                        break;
                }

            } catch (InputMismatchException error) {
                System.out.println("""
                        \n**********************************************
                        ¡¡          INVALID DATA ,TRY AGAIN :v      !!
                        **********************************************""");
                KEYBOARD.next();

            }

        } while (option != 0);

    }

    private void getBookResults() {
        
        CONSUMER_API.getJsonData("/books/")
    }

    private void showMenu() {
        System.out.print("""
                \n*************** Menu Principle ***************
                *                                            *
                *    [1]  Search Books By Title              *
                *    [2]  Show Registered Books              *
                *    [3]  Show Registered Authors            *
                *    [4]  show Authors Alive In Given Year   *
                *    [5]  Show Books By Languages            *
                *    [O]  Exit Application                   *
                *                                            *
                **********************************************
                """);
    }

    private void showAllowedLanguages() {
        System.out.print("""
                \n******* Languages ******
                *                        *
                *    [1]    English      *
                *    [2]    Spanish      *
                *    [3]    French       *
                *                        *
                **************************
                """);
    }

}

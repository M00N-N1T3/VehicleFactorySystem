package ui;

import models.Vehicle;
import services.VehicleManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class MainMenu {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private static final List<String> menuChoices = List.of("1","2","3","4","5");
    private static final VehicleManager vehicleManager = new VehicleManager();

    public static void main(String[] args) {
        play();
    }


    public static void play(){
        menu();
        String choice = prompt(
                "Enter your choice: ",
                "\nIncorrect Selection, select 1-5", menuChoices);

    }

    public static void menu(){
        String menuChoice = """
                Welcome to the Vehicle Management System!
                
                1. Create a new vehicle
                2. View a vehicle's details
                3. List all vehicles
                4. Help
                5. Exit
                """;

        System.out.println(menuChoice);
    }

    public static String prompt(String promptMsg, String incorrectSelectionMessage,  List<String> choices) {
        while (true){
            try {
                System.out.print(promptMsg);
                String choice = input.readLine();
                if (choices.contains(choice)) return choice;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(incorrectSelectionMessage);
        }
    };
}

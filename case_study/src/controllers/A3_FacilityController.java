package controllers;

import static controllers.A0_FuramaController.displayMainMenu;

public class A3_FacilityController {
    public static void displayFacilityManagementMenu() {
        int i = 0;
        int choice;
        while (i < 10) {
            i++;
            System.out.println(
                    "-------------------------------------------" +
                    "\n1. Display list facility." +
                    "\n2. Add new facility" +
                    "\n3. Display list facility maintenace" +
                    "\n4. Return main menu." +
                    "\nMời bạn nhập lựa chọn: ");
            choice = Integer.parseInt(A0_FuramaController.inputValidChoice("[1-4]"));
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}

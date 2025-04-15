package Anonymousinterface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1. click");
        System.out.println("2. Exit");
        String a = s.nextLine();

        switch (a) {
            case "click":
                Clickable c = new Clickable() {

                    @Override
                    public void Click() {
                        System.out.println("user clicked the button.");
                    }
                };
                c.Click();
                break;

            case "Exit":

                Clickable c1 = new Clickable() {

                    @Override
                    public void Click() {
                        System.out.println("user exited.");
                    }
                };
                c1.Click();

                break;

            default:
                System.out.println("invalid choice!!!");
        }

        s.close();
    }
}
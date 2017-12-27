package controller;

import db.SQLQueries;

import java.util.Scanner;

import static view.MenuConstants.*;

public class Menu {
    public static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println('\n'+startingMenu);
            int input = sc.nextInt();
            switch (input) {
                case (mGET_ALL_EMPLOYEES):
                    System.out.println(SQLQueries.getAllEmployees());
                    break;
                case (mGET_ALL_TASKS):
                    System.out.println(SQLQueries.getAllTasks());
                    break;
                case (mGET_EMPLOYEES_BY_DEPARTMENT):
                    System.out.println(INPUT_DEPARTMENT);
                    int department = sc.nextInt();
                    System.out.println(SQLQueries.getEmployeesByDepartment(department));
                    break;
                case (mADD_TASK_TO_EMPLOYEE):
                    System.out.println(INPUT_EMPLOYEE);
                    int employee_id = sc.nextInt();
                    System.out.println(INPUT_TASK_DESCRIPTION);
                    String avoidskip = sc.nextLine();
                    String description = sc.nextLine();
                    SQLQueries.addTaskToEmployee(description, employee_id);
                    break;
                case (mGET_TASKS_FOR_EMPLOYEE):
                    System.out.println(INPUT_EMPLOYEE);
                    int employee = sc.nextInt();
                    System.out.println(SQLQueries.getTasksForEmployee(employee));
                    break;
                case (mDELETE_EMPLOYEE):
                    System.out.println(INPUT_EMPLOYEE);
                    int employees_id = sc.nextInt();
                    SQLQueries.deleteEmployee(employees_id);
                    break;
                default:
                    System.out.println("Incorrect input");
                    break;
            }

        }
    }
}

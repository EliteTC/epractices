package view;

public interface MenuConstants {
    int mGET_ALL_EMPLOYEES = 1;
    int mGET_ALL_TASKS = 2;
    int mGET_EMPLOYEES_BY_DEPARTMENT = 3;
    int mADD_TASK_TO_EMPLOYEE = 4;
    int mGET_TASKS_FOR_EMPLOYEE = 5;
    int mDELETE_EMPLOYEE = 6;

    String GET_ALL_EMPLOYEES = "1 - Get all employees";
    String GET_ALL_TASKS = "2 - Get all tasks";
    String GET_EMPLOYEES_BY_DEPARTMENT = "3 - Get employees by department";
    String ADD_TASK_TO_EMPLOYEE = "4 - Add task to employee";
    String GET_TASKS_FOR_EMPLOYEE = "5 - Get tasks for employee";
    String DELETE_EMPLOYEE = "6 - Delete employee";

    String INPUT_DEPARTMENT = "Input departments' number";
    String INPUT_EMPLOYEE = "Input employees' id";
    String INPUT_TASK_DESCRIPTION = "Input tasks' description";

    String startingMenu = GET_ALL_EMPLOYEES+'\n'+GET_ALL_TASKS+'\n'+GET_EMPLOYEES_BY_DEPARTMENT+
            '\n'+ADD_TASK_TO_EMPLOYEE+'\n'+GET_TASKS_FOR_EMPLOYEE+'\n'+DELETE_EMPLOYEE;

}

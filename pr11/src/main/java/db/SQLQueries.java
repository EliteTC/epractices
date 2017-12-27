package db;

import org.apache.log4j.Logger;

import java.sql.*;

public class SQLQueries {
    private final static String GET_ALL_EMPLOYEES = "SELECT * FROM employees";
    private final static String GET_ALL_TASKS = "SELECT * FROM employees_task";
    private final static String GET_EMPLOYEES_BY_DEPARTMENT = "SELECT surname,employees.name,position,employees.department_id FROM employees JOIN department ON employees.department_id = department.department_id WHERE employees.department_id = ?";
    private final static String ADD_TASK_TO_EMPLOYEE = "INSERT INTO employees_task (description,employee_id) values (?,?)";
    private final static String GET_TASKS_FOR_EMPLOYEE = "SELECT task_id, description FROM employees_task WHERE employee_id = ?";
    private final static String DELETE_EMPLOYEE = "DELETE FROM employees WHERE employee_id = ?";

    static final Logger logger = Logger.getLogger(SQLQueries.class);

    public static void deleteEmployee(int employee_id) {
        Connection conn = DBConnector.getConnection();
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(DELETE_EMPLOYEE);
            st.setInt(1, employee_id);
            logger.info("deleting employee with id "+employee_id);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getTasksForEmployee(int employee_id) {
        Connection conn = DBConnector.getConnection();
        PreparedStatement st = null;
        StringBuilder sb = new StringBuilder();
        try {
            st = conn.prepareStatement(GET_TASKS_FOR_EMPLOYEE);
            st.setInt(1, employee_id);
            logger.info("Getting tasks for employee with id "+employee_id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                int task_id = rs.getInt("task_id");
                String description = rs.getString("description");
                //Display values
                sb.append(" task id: " + task_id);
                sb.append(", description: " + description);
                /*
                System.out.print(" task id: " + task_id);
                System.out.print(", description: " + description);
                */
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void addTaskToEmployee(String description, int employee_id) {
        Connection conn = DBConnector.getConnection();
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(ADD_TASK_TO_EMPLOYEE);
            st.setString(1, description);
            st.setInt(2, employee_id);
            logger.info("Adding task to employee with id "+ employee_id);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getEmployeesByDepartment(int departmentid) {
        Connection conn = DBConnector.getConnection();
        PreparedStatement st = null;
        StringBuilder sb = new StringBuilder();
        try {
            st = conn.prepareStatement(GET_EMPLOYEES_BY_DEPARTMENT);
            st.setInt(1, departmentid);
            logger.info("Getting employees for department with id "+ departmentid);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                String surname = rs.getString("surname");
                String name = rs.getString("name");
                String position = rs.getString("position");
                int department_id = rs.getInt("department_id");
                sb.append(" surname: " + surname);
                sb.append(", name: " + name);
                sb.append(", position: " + position);
                sb.append(", department: " + department_id);
                //Display values
                /*
                System.out.print(" surname: " + surname);
                System.out.print(", name: " + name);
                System.out.print(", position: " + position);
                System.out.println(", department: " + department_id);
                */
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static String getAllEmployees() {
        Connection conn = DBConnector.getConnection();
        Statement st = null;
        StringBuilder sb = new StringBuilder();
        try {
            st = conn.createStatement();
            logger.info("Getting all employees");
            ResultSet rs = st.executeQuery(GET_ALL_EMPLOYEES);

            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String surname = rs.getString("surname");
                String name = rs.getString("name");
                String position = rs.getString("position");
                int department_id = rs.getInt("department_id");
                sb.append("ID: " + id);
                sb.append(", surname: " + surname);
                sb.append(", name: " + name);
                sb.append(", position: " + position);
                sb.append(", department: " + department_id);

                //Display values
                /*
                System.out.print("ID: " + id);
                System.out.print(", surname: " + surname);
                System.out.print(", name: " + name);
                System.out.print(", position: " + position);
                System.out.println(", department: " + department_id);
                */
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static String getAllTasks() {
        Connection conn = DBConnector.getConnection();
        Statement st = null;
        StringBuilder sb = new StringBuilder();
        try {
            st = conn.createStatement();
            logger.info("Getting all tasks");
            ResultSet rs = st.executeQuery(GET_ALL_TASKS);

            while (rs.next()) {
                int id = rs.getInt("task_id");
                String description = rs.getString("description");
                int employee_id = rs.getInt("employee_id");
                sb.append("ID: " + id);
                sb.append(", description: " + description);
                sb.append(", employee_id: " + employee_id);
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", description: " + description);
                System.out.print(", employee_id: " + employee_id);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}

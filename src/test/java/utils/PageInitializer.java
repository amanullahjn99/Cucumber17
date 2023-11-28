package utils;

import pages.*;

// we created to create the object and centralized the all the pages in one place
public class PageInitializer {

    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;
    public static EmployeeSearchPage employeeSearchPage;
    public static AddEmployeePage addEmployeePage;

    public static AdminDashBoardPage adminDashBoardPage;
    public  static JobTitlePage jobTitlePage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        employeeSearchPage = new EmployeeSearchPage();
        addEmployeePage = new AddEmployeePage();
        adminDashBoardPage=new AdminDashBoardPage();
        jobTitlePage=new JobTitlePage();
    }


}
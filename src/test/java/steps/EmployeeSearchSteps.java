package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeSearchSteps {
    public WebDriver driver;
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() throws InterruptedException {
        WebElement pimOption=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimOption.click();
        Thread.sleep(2000);
    }
    @When("user clicks on Employee List option")
    public void user_clicks_on_employee_list_option() throws InterruptedException {
      WebElement employeeList=driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
      employeeList.click();
      Thread.sleep(2000);
    }
    @When("user enters employee id")
    public void user_enters_employee_id() throws InterruptedException {
        WebElement id=driver.findElement(By.xpath("//input[@id='empsearch_id']"));
        id.sendKeys("37122939");
        Thread.sleep(2000);

    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() throws InterruptedException {
      WebElement searchButton=driver.findElement(By.xpath("//input[@id='searchBtn']"));
      searchButton.click();
        Thread.sleep(2000);
    }
    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        System.out.println("User is able to see the Employee details");
    }

}
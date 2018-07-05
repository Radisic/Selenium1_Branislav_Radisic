
import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {

  
    public static void main(String[] args) {
        
        
        WebDriver driver = new ChromeDriver();
        driver.get("http://bvtest.school.cubes.rs/login");
        driver.manage().window().maximize();
        
        WebElement emailField = driver.findElement(By.name("email") );
        emailField.sendKeys("qa@cubes.rs");
        
         WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("cubesqa");
        
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        
        WebElement categoriesLink = driver.findElement(By.linkText("Categories"));
        categoriesLink.click();
        
        System.out.println("Page title is:" + driver.getTitle() +"!");
        
        WebElement addCategoryButton = driver.findElement(By.className("pull-right"));
        addCategoryButton.click();
        
         WebElement titleField = driver.findElement(By.id("title"));
        titleField.sendKeys(Helper.getRandomText());

        WebElement saveButton = driver.findElement(By.id("save-category-button"));
        saveButton.click();
        
        WebElement portalsLink = driver.findElement(By.partialLinkText("Portals"));
        portalsLink.click();
        
        System.out.println("Page title is:" + driver.getTitle() +"!");
        
        WebElement addPortalButton = driver.findElement(By.className("pull-right"));
        addPortalButton.click();
        
        WebElement title = driver.findElement(By.className("input-md"));
        title.sendKeys(Helper.getRandomText());
        
        WebElement url = driver.findElement(By.id("url"));
        url.sendKeys("http://test.rs");
        
        WebElement savePortalButton = driver.findElement(By.id("save-portal-button"));
        savePortalButton.click();
        
        driver.quit();
        
        
        
        
        
        
        
        
        
        
        
      
    }
    
}

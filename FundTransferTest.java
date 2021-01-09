// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class FundTransferTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checkIFSCCode() {
    // Test name: Check IFSC Code
    // Step # | name | target | value
    // 1 | open | FundTransfer.jsp | 
    driver.get("http://localhost:8097/OnlineBankingApplication/FundTransfer.jsp");
    // 2 | type | id=remitterAccountNo | 2700001
    driver.findElement(By.id("remitterAccountNo")).sendKeys("2700001");
    // 3 | type | id=beneficiaryAccountNo | 2700002
    driver.findElement(By.id("beneficiaryAccountNo")).sendKeys("2700002");
    // 4 | type | id=beneficiaryName | Vini
    driver.findElement(By.id("beneficiaryName")).sendKeys("Vini");
    // 5 | type | id=IFSCCode | dvdf
    driver.findElement(By.id("IFSCCode")).sendKeys("dvdf");
    // 6 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
  @Test
  public void checkamountmorethanbalance() {
    // Test name: Check amount more than balance
    // Step # | name | target | value
    // 1 | open | FundTransfer.jsp | 
    driver.get("http://localhost:8097/OnlineBankingApplication/FundTransfer.jsp");
    // 2 | type | id=remitterAccountNo | 2700001
    driver.findElement(By.id("remitterAccountNo")).sendKeys("2700001");
    // 3 | type | id=beneficiaryAccountNo | 2700002
    driver.findElement(By.id("beneficiaryAccountNo")).sendKeys("2700002");
    // 4 | type | id=beneficiaryName | Vini
    driver.findElement(By.id("beneficiaryName")).sendKeys("Vini");
    // 5 | type | id=IFSCCode | SDDS0SDDSSD
    driver.findElement(By.id("IFSCCode")).sendKeys("SDDS0SDDSSD");
    // 6 | type | id=amount | 4000
    driver.findElement(By.id("amount")).sendKeys("4000");
    // 7 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
  @Test
  public void checknegativeamount() {
    // Test name: Check negative amount
    // Step # | name | target | value
    // 1 | open | FundTransfer.jsp | 
    driver.get("http://localhost:8097/OnlineBankingApplication/FundTransfer.jsp");
    // 2 | type | id=remitterAccountNo | 2700001
    driver.findElement(By.id("remitterAccountNo")).sendKeys("2700001");
    // 3 | type | id=beneficiaryAccountNo | 2700002
    driver.findElement(By.id("beneficiaryAccountNo")).sendKeys("2700002");
    // 4 | type | id=beneficiaryName | Vini
    driver.findElement(By.id("beneficiaryName")).sendKeys("Vini");
    // 5 | type | id=IFSCCode | SDDS0SDDSSD
    driver.findElement(By.id("IFSCCode")).sendKeys("SDDS0SDDSSD");
    // 6 | type | id=amount | -10
    driver.findElement(By.id("amount")).sendKeys("-10");
    // 7 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
  @Test
  public void checkifRemitterandBeneficiaryaresame() {
    // Test name: Check if Remitter and Beneficiary are same
    // Step # | name | target | value
    // 1 | open | FundTransfer.jsp | 
    driver.get("http://localhost:8097/OnlineBankingApplication/FundTransfer.jsp");
    // 2 | type | id=remitterAccountNo | 2700001
    driver.findElement(By.id("remitterAccountNo")).sendKeys("2700001");
    // 3 | type | id=beneficiaryAccountNo | 2700001
    driver.findElement(By.id("beneficiaryAccountNo")).sendKeys("2700001");
    // 4 | type | id=beneficiaryName | Vini
    driver.findElement(By.id("beneficiaryName")).sendKeys("Vini");
    // 5 | type | id=IFSCCode | SDDS0SDDSSD
    driver.findElement(By.id("IFSCCode")).sendKeys("SDDS0SDDSSD");
    // 6 | type | id=amount | 1
    driver.findElement(By.id("amount")).sendKeys("1");
    // 7 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
  @Test
  public void correctfieldssuccess() {
    // Test name: Correct fields-success
    // Step # | name | target | value
    // 1 | open | FundTransfer.jsp | 
    driver.get("http://localhost:8097/OnlineBankingApplication/FundTransfer.jsp");
    // 2 | type | id=remitterAccountNo | 2700008
    driver.findElement(By.id("remitterAccountNo")).sendKeys("2700008");
    // 3 | type | id=beneficiaryAccountNo | 2700001
    driver.findElement(By.id("beneficiaryAccountNo")).sendKeys("2700001");
    // 4 | type | id=beneficiaryName | Vini
    driver.findElement(By.id("beneficiaryName")).sendKeys("Vini");
    // 5 | type | id=IFSCCode | SDDS0SDDSSD
    driver.findElement(By.id("IFSCCode")).sendKeys("SDDS0SDDSSD");
    // 6 | type | id=amount | 500
    driver.findElement(By.id("amount")).sendKeys("500");
    // 7 | click | css=.btn-primary | 
    driver.findElement(By.cssSelector(".btn-primary")).click();
  }
}
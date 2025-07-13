package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;


public class MyAptitudoPage {
    WebDriver driver;

 // Constructor
   public MyAptitudoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
   
   // For Page Down
   public void scrollIntoView(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
// Name Aptitudo-Step-1
   
   @FindBy(xpath  = "//input[@placeholder='Enter your APTITUDO name']")
   WebElement nameYourAptitudoField;

   @FindBy(xpath = "//div[@class='space-y-4.5 pb-20 border-b-2 border-solid border-gray-500']//select[@class='custom-select-1 shadow-1 text-gray-500']")
   WebElement departmentField;

   @FindBy(xpath = "//div[@class='space-y-4.5 pt-20']//select[@class='custom-select-1 shadow-1 text-gray-500']")
   WebElement jobTitleField;
   
   @FindBy(xpath = "//input[@placeholder='Enter Job Title ID']")
   WebElement jobTitleIdField;
   
   @FindBy(xpath= "//button[normalize-space()='Next Step']")
   WebElement nextStepButton;
   
   public void nameAptitudo(String nameYourAptitud0, String department,String jobTitle, String jobTitleId ) throws InterruptedException {
	   nameYourAptitudoField.sendKeys(nameYourAptitud0);
	   departmentField.click();
	   departmentField.sendKeys(department);
	   departmentField.sendKeys(Keys.ENTER);
	   Thread.sleep(1000);
	   jobTitleField.click();
	   jobTitleField.sendKeys(jobTitle);
	   jobTitleField.sendKeys(Keys.ENTER);
	   jobTitleIdField.sendKeys(jobTitleId);
	   nextStepButton.click();
   }
   
   //Job description-Step-2
   
   @FindBy(xpath  = "//textarea[@placeholder='Enter your job description']")
   WebElement jobDescriptionField;
   
   public void jobDescription(String description) {
	   jobDescriptionField.sendKeys(description);
	   nextStepButton.click();
   }
   
   // Select Test-Step-3
   
   @FindBy(xpath  = "//body/div/div/div/div/div/div/div/div/div/div/div[1]/div[1]/select[1]")
   WebElement testTypeField;

   @FindBy(xpath = "//input[@placeholder='No. of questions']")
   WebElement questionNoField;

   @FindBy(xpath = "//input[@id='min']")
   WebElement durationField;
   
   @FindBy(xpath = "(//select)[2]")
   WebElement industryField;
   
   @FindBy(xpath = "(//select)[3]")
   WebElement subIndustryField;
   
   @FindBy(xpath = "//div[@class='multiselect__tags']")
   WebElement aptitudoTestTypeField;
   
  @FindBy(xpath= "//button[normalize-space()='Submit']")
  WebElement submitButtonclick;
  
  // Select All Question
  @FindBy(xpath= "//label[normalize-space()='Select All']")
  WebElement selectAllButtonclick;
  
  @FindBy(xpath= "//button[@class='btn-capsule bg-primary']")
  WebElement submitQuestionButtonclick;
  
  // Enter the name of the test!

	@FindBy(xpath= "//input[@placeholder='Test Name']")
	WebElement testNameField;
// save button from Enter Test name
	@FindBy(xpath = "//button[normalize-space()='Save']") 
	WebElement saveTestNameButton;
	
	//For Code
	@FindBy(xpath = "//select[@class='w-full text-gray-900 bg-gray-50 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500 p-2.5 text-sm border border-gray-300 rounded-lg']")
    WebElement selectProgrammingLang;
	
	@FindBy(xpath= "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[8]/div[2]/div[1]/div[1]/input[1]")
	WebElement enterPassedtestcase;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[8]/div[3]/div[1]/div[1]/input[1]")
    WebElement enterexecutionTine;
	
   public void selecttest(String testType, String noOfQuestion, String setDuration, String industry, String subIndustry, String aptitudoTestType, String testName ) throws InterruptedException {
	   testTypeField.click();
	   testTypeField.sendKeys(testType);
	   questionNoField.sendKeys(noOfQuestion);
	   Thread.sleep(3000);
	   durationField.click();
	   durationField.clear();
	   durationField.sendKeys(setDuration);
	   Thread.sleep(3000);
	   industryField.click();
	   industryField.sendKeys(industry);
	   industryField.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	   subIndustryField.click();
	   subIndustryField.sendKeys(subIndustry);
	   subIndustryField.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(aptitudoTestTypeField)).click();
	   
	   WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//span[contains(text(),'" + aptitudoTestType + "')]")
		    ));
		    optionToSelect.click();
	   
	    submitButtonclick.click();
	    Thread.sleep(3000);
	    
	    
	    // Select All Questions
	    selectAllButtonclick.click();
	    Thread.sleep(1200);
	    scrollIntoView(submitQuestionButtonclick);
	    submitQuestionButtonclick.click();
	    
	    testNameField.sendKeys(testName);
	    saveTestNameButton.click();
	    //nextStepButton.click();
	    Thread.sleep(1200);
	    
	    
   }
   
   
   
   
   public void selecttestCode(String testType, String noOfQuestion, String setDuration, String industry, String subIndustry, String aptitudoTestType, String testName, String programminglang, String passedTestCase, String executionTime ) throws InterruptedException {
	   testTypeField.click();
	   testTypeField.sendKeys(testType);
	   questionNoField.sendKeys(noOfQuestion);
	   Thread.sleep(3000);
	   durationField.click();
	   durationField.clear();
	   durationField.sendKeys(setDuration);
	   Thread.sleep(3000);
	   industryField.click();
	   industryField.sendKeys(industry);
	   industryField.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	   subIndustryField.click();
	   subIndustryField.sendKeys(subIndustry);
	   subIndustryField.sendKeys(Keys.ENTER);
	   Thread.sleep(3000);
	
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(aptitudoTestTypeField)).click();
	   
	   WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("//span[contains(text(),'" + aptitudoTestType + "')]")
		    ));
		    optionToSelect.click();
	    selectProgrammingLang.click();
	    selectProgrammingLang.sendKeys(programminglang);
	    selectProgrammingLang.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		enterPassedtestcase.click();
		enterPassedtestcase.sendKeys(passedTestCase);     
		enterexecutionTine.click();
		enterexecutionTine.sendKeys(executionTime);  
		    
	   
	    submitButtonclick.click();
	    Thread.sleep(3000);
	    
	    
	    // Select All Questions
	    selectAllButtonclick.click();
	    Thread.sleep(1200);
	    scrollIntoView(submitQuestionButtonclick);
	    submitQuestionButtonclick.click();
	    
	    testNameField.sendKeys(testName);
	    saveTestNameButton.click();
	    nextStepButton.click();
	    Thread.sleep(1200);
	    
	    
   }


   
}
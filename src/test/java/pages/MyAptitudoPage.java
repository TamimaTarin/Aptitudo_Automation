package pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MyAptitudoPage {
    WebDriver driver;

 // Constructor
   public MyAptitudoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
   
   // Actions
   public void enteraptitudoName(String nameYourAptitud0) {
	   nameYourAptitudoField.sendKeys(nameYourAptitud0);
   }
   
   public void enterdepartment(String department) {
	   departmentField.sendKeys(department);
   }

   public void enterjobTitle(String jobTitle) {
	   jobTitleField.sendKeys(jobTitle);
   }

   public void enterjobTitleId(String jobTitleId) {
	   jobTitleIdField.sendKeys(jobTitleId);
   }
   public void buttonClick() {
	   nextStepButton.click();
   }
   

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
   
   //Job description
   
   @FindBy(xpath  = "//textarea[@placeholder='Enter your job description']")
   WebElement jobDescriptionField;
   
   public void enterjobdescription(String descrription) {
	   jobDescriptionField.sendKeys(descrription);
   }
   
 
   public void jobDescription(String description) {
	   jobDescriptionField.sendKeys(description);
	   nextStepButton.click();
   }
   
   // Select Test
   
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
   
   @FindBy(xpath = "//span[@class='multiselect__placeholder']")
   WebElement aptitudoTestTypeField;
   
  @FindBy(xpath= "//button[normalize-space()='Submit']")
  WebElement submitButtonclick;
 
// Actions
   public void enterTestType(String testType) {
	   testTypeField.sendKeys(testType);
   }
   
   public void enternoOfQuestion(String noOfQuestion) {
	   questionNoField.sendKeys(noOfQuestion);
   }

   public void enterduration(String setDuration) {
	   durationField.sendKeys(setDuration);
   }

   public void enterIndustry(String industry) {
	   industryField.sendKeys(industry);
   }
   
   public void enterSubIndustry(String subIndustry) {
	   subIndustryField.sendKeys(subIndustry);
   }

   public void enterAptitudoTest(String aptitudoTestType) {
	   aptitudoTestTypeField.sendKeys(aptitudoTestType);
   }
   
   public void submitButton() {
	   submitButtonclick.click();
   }
   
   public void selecttest(String testType, String noOfQuestion, String setDuration, String industry, String subIndustry, String aptitudoTestType ) throws InterruptedException {
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
		  /* aptitudoTestTypeField.click();
		   Thread.sleep(3000);
		   aptitudoTestTypeField.sendKeys(aptitudoTestType);
		   Thread.sleep(3000);
		   aptitudoTestTypeField.sendKeys(Keys.ENTER);
		   Thread.sleep(3000);
		   */
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(aptitudoTestTypeField)).click();
	    aptitudoTestTypeField.sendKeys(aptitudoTestType);
	    aptitudoTestTypeField.sendKeys(Keys.ENTER);
	    submitButtonclick.click();
   }
   
   
   
}
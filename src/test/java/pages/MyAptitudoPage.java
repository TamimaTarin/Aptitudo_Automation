package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.utils;

import org.openqa.selenium.interactions.Actions;

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
  
   @FindBy(xpath= "//button[normalize-space()='Next Step']")
   WebElement nextStepButton;
   
   public void nameAptitudo(String nameYourAptitud0, String department,String jobTitle, String jobTitleId ) throws InterruptedException {
	  
	   WebElement nameYourAptitudoField = driver.findElement(By.xpath("//input[@placeholder='Enter your APTITUDO name']"));
	   nameYourAptitudoField.sendKeys(nameYourAptitud0);
	   WebElement departmentField = driver.findElement(By.xpath("//div[@class='space-y-4.5 pb-20 border-b-2 border-solid border-gray-500']//select[@class='custom-select-1 shadow-1 text-gray-500']"));
	   departmentField.click();
	   departmentField.sendKeys(department);
	   departmentField.sendKeys(Keys.ENTER);
	   Thread.sleep(1000);
	   WebElement jobTitleField = driver.findElement(By.xpath("//div[@class='space-y-4.5 pt-20']//select[@class='custom-select-1 shadow-1 text-gray-500']"));
	   jobTitleField.click();
	   jobTitleField.sendKeys(jobTitle);
	   jobTitleField.sendKeys(Keys.ENTER);
	   WebElement jobTitleIdField = driver.findElement(By.xpath("//input[@placeholder='Enter Job Title ID']"));
	   jobTitleIdField.sendKeys(jobTitleId);
	   //WebElement nextStepButton = driver.findElement(By.xpath("//button[normalize-space()='Next Step']"));
	   Thread.sleep(1000);
	   nextStepButton.click();
   }
   
   //Job description-Step-2
   
   public void jobDescription(String description) {
	   
	   WebElement jobDescriptionField = driver.findElement(By.xpath("//textarea[@placeholder='Enter your job description']"));
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
//	   testTypeField.click();
//	   testTypeField.sendKeys(testType);
//	   questionNoField.sendKeys(noOfQuestion);
//	   Thread.sleep(3000);
//	   durationField.click();
//	   durationField.clear();
//	   durationField.sendKeys(setDuration);
//	   Thread.sleep(3000);
//	   industryField.click();
//	   industryField.sendKeys(industry);
//	   industryField.sendKeys(Keys.ENTER);
//	   Thread.sleep(3000);
//	   subIndustryField.click();
//	   subIndustryField.sendKeys(subIndustry);
//	   subIndustryField.sendKeys(Keys.ENTER);
//	   Thread.sleep(3000);
//	
//	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	   wait.until(ExpectedConditions.elementToBeClickable(aptitudoTestTypeField)).click();
//	   
//	   WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		        By.xpath("//span[contains(text(),'" + aptitudoTestType + "')]")
//		    ));
//		    optionToSelect.click();
//	   
//	    submitButtonclick.click();
//	    Thread.sleep(3000);
//	    
//	    
//	    // Select All Questions
//	    selectAllButtonclick.click();
//	    Thread.sleep(1200);
//	    scrollIntoView(submitQuestionButtonclick);
//	    submitQuestionButtonclick.click();
//	    
//	    testNameField.sendKeys(testName);
//	    saveTestNameButton.click();
//	    //nextStepButton.click();
//	    Thread.sleep(1200);
	    
	    
   }
   
   public void selecttestCode(String testType, String noOfQuestion, String setDuration, String industry, String subIndustry, String aptitudoTestType, String testName, String programminglang, String passedTestCase, String executionTime ) throws InterruptedException {
//	   testTypeField.click();
//	   testTypeField.sendKeys(testType);
//	   questionNoField.sendKeys(noOfQuestion);
//	   Thread.sleep(3000);
//	   durationField.click();
//	   durationField.clear();
//	   durationField.sendKeys(setDuration);
//	   Thread.sleep(3000);
//	   industryField.click();
//	   industryField.sendKeys(industry);
//	   industryField.sendKeys(Keys.ENTER);
//	   Thread.sleep(3000);
//	   subIndustryField.click();
//	   subIndustryField.sendKeys(subIndustry);
//	   subIndustryField.sendKeys(Keys.ENTER);
//	   Thread.sleep(3000);
//	
//	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	   wait.until(ExpectedConditions.elementToBeClickable(aptitudoTestTypeField)).click();
//	   
//	   WebElement optionToSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(
//		        By.xpath("//span[contains(text(),'" + aptitudoTestType + "')]")
//		    ));
//		    optionToSelect.click();
//	    selectProgrammingLang.click();
//	    selectProgrammingLang.sendKeys(programminglang);
//	    selectProgrammingLang.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		enterPassedtestcase.click();
//		enterPassedtestcase.sendKeys(passedTestCase);     
//		enterexecutionTine.click();
//		enterexecutionTine.sendKeys(executionTime);  
//		    
//	   
//	    submitButtonclick.click();
//	    Thread.sleep(3000);
//	    
//	    
//	    // Select All Questions
//	    selectAllButtonclick.click();
//	    Thread.sleep(1200);
//	    scrollIntoView(submitQuestionButtonclick);
//	    submitQuestionButtonclick.click();
//	    
//	    testNameField.sendKeys(testName);
//	    saveTestNameButton.click();
	    nextStepButton.click();
	    Thread.sleep(1200);
	    
	    
   }

   //Save Button on Custom Question Page
   @FindBy(xpath= "(//button[@class='btn-capsule-outline border-primary'])[1]")
   WebElement customSaveButton;
   
   // Back button on Custom Question Page
   @FindBy(xpath = "//button[@class='p-2 circular-button-white']")
   WebElement customBackButton;
   
   
   
   // Custom Question-Code Add
   public void codeCustomQuestion(String questionTitle,String selectLan, String setTime, String quetion, String constraints1,
			  String constraints2, String constraints3, String example1In, String example1Out, String example1Exaplanation,
			  String example2In, String example2Out, String example2Exaplanation, String passedTestScore) throws InterruptedException {
	   
	   
	   
//	   WebElement questionTitleField = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//	   questionTitleField.clear();
//	   questionTitleField.sendKeys(questionTitle);
//	   
//	   WebElement selectLanguageField = driver.findElement(By.xpath("(//select[@class='w-full text-gray-900 bg-gray-50 focus:ring-primary-500 focus:border-primary-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-primary-500 dark:focus:border-primary-500 p-2.5 text-sm border border-gray-300 rounded-lg'])[1]"));
//	   selectLanguageField.click();
//	   selectLanguageField.sendKeys(selectLan);
//	   selectLanguageField.sendKeys(Keys.ENTER);
//	   
//	   WebElement setTimeField = driver.findElement(By.xpath("//input[@id='min']"));
//	   setTimeField.clear();
//	   setTimeField.sendKeys(setTime);
//	   
//	   WebElement questionField = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
//	   questionField.sendKeys(quetion);
//	   
//	   //Click Add more button on Constraints
//	   
//	   WebElement addConstraints= driver.findElement(By.xpath("//body/div[@id='app']/div/div[@class='w-full']/div[@class='w-full space-y-12.5']/div[@class='px-7.5 xl:px-10 space-y-5']/div[@class='container mx-auto my-auto']/div[@class='bg-cardBg mt-1 shadow-lg size-full p-5 space-y-5']/button[1]"));
//	   addConstraints.click();
//	   
//	   WebElement constraints1Field = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//	   constraints1Field.sendKeys(constraints1);
//	   addConstraints.click();
//	   
//	   WebElement constraints2Field = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//	   constraints2Field.sendKeys(constraints2);
//	   addConstraints.click();
//	   
//	   WebElement constraints3Field = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//	   constraints3Field.sendKeys(constraints3);
//	   
//	   //Example Add more button
//	   
//	   WebElement exampleAddMore= driver.findElement(By.xpath("(//button[@class='inline-flex items-center justify-center gap-2.5 py-4 px-10 text-center font-medium hover:bg-opacity-90 lg:px-8 xl:px-10 bg-primary text-white rounded-full'][normalize-space()='Add More'])[2]"));
//	   scrollIntoView(exampleAddMore);
//	   exampleAddMore.click();
//	   
//	   WebElement example1InField = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
//	   example1InField.sendKeys(example1In);
//	   
//	   WebElement example1OutField = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
//	   example1OutField.sendKeys(example1Out);
//	   
//	   WebElement example1ExaplanationField = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
//	   example1ExaplanationField.sendKeys(example1Exaplanation);
//	   exampleAddMore.click();
//	   
//	   WebElement example2InField = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
//	   example2InField.sendKeys(example2In);
//	   
//	   WebElement example2OutField = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
//	   example2OutField.sendKeys(example2Out);
//	   
//	   WebElement example2ExaplanationField = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
//	   example2ExaplanationField.sendKeys(example2Exaplanation);
//	   
//	   WebElement passedTestScoreField = driver.findElement(By.xpath("(//input[@placeholder='Enter weight'])[1]"));
//	   passedTestScoreField.clear();
//	   passedTestScoreField.sendKeys(passedTestScore);
//	   
//	   
//	   Actions actions = new Actions(driver);
//
//	   // Perform a single PAGE UP
//	   actions.sendKeys(Keys.PAGE_UP).build().perform();
//	   
//	   System.out.println("tarintamima");
//	   
//	  
//	   JavascriptExecutor js = (JavascriptExecutor) driver;
//	   js.executeScript("arguments[0].click();", customSaveButton);
//	   Thread.sleep(3000);
//	   js.executeScript("arguments[0].click();", customBackButton);
//	   
//	
}

   // Custom Question MCQ Add
   public void mcqCustomQuestion(String questionTitle,String settime, String question, String option1, String option2,String option3, String option4) throws InterruptedException {
	 
	   WebElement questionTitleField = driver.findElement(By.xpath("//input[@class='input-h65 bg-bodyColor']"));
	   questionTitleField.clear();
	   questionTitleField.sendKeys(questionTitle);
	   
	   WebElement setTimeField = driver.findElement(By.xpath("//input[@id='min']"));
	   setTimeField.clear();
	   setTimeField.sendKeys(settime);
	   
	   WebElement questionField = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
	   questionField.sendKeys(question);
	   
	   WebElement option1Field = driver.findElement(By.xpath("//input[@id='country']"));
	   scrollIntoView(option1Field);
       option1Field.sendKeys(option1);
	   
	   //Click Add another answer button
	   
	   WebElement addAnotherAnswer =driver.findElement(By.xpath("//button[normalize-space()='Add another answer']"));
	   addAnotherAnswer.click();
	   
	   WebElement option2Field = driver.findElement(By.xpath("(//input[@id='country'])[2]"));
	   option2Field.sendKeys(option2);
	   addAnotherAnswer.click();
	   
	   WebElement option3Field = driver.findElement(By.xpath("(//input[@id='country'])[3]"));
	   option3Field.sendKeys(option3);
	   addAnotherAnswer.click();
	   
	   WebElement option4Field = driver.findElement(By.xpath("(//input[@id='country'])[4]"));
	   option4Field.sendKeys(option4);
	   
	   Actions actions = new Actions(driver);

	   // Perform a single PAGE UP
	   actions.sendKeys(Keys.PAGE_UP).build().perform();
	   	  
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", customSaveButton);
	   Thread.sleep(3000);
	   js.executeScript("arguments[0].click();", customBackButton);
	 	 
 }
 
   // Custom Question -File Upload
   
   public void fileUploadCustomQuestion(String questionTitle,String question ) throws InterruptedException {
	   
	   WebElement questionTitleField = driver.findElement(By.xpath("//input[@class='input-h65 bg-bodyColor']"));
	   questionTitleField.sendKeys(questionTitle);
	   
	   WebElement questionField = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
	   questionField.sendKeys(question);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", customSaveButton);
	   Thread.sleep(3000);
	   js.executeScript("arguments[0].click();", customBackButton);
}

   
   // Custom Question- Video
   
   public void videoCustomQuestion(String questionTitle,String maxLength,String question) throws InterruptedException {
	   
	   WebElement questionTitleField = driver.findElement(By.xpath("//input[@class='input-h65 bg-bodyColor']"));
	   questionTitleField.sendKeys(questionTitle);
	   
	   WebElement maxLengthField = driver.findElement(By.xpath("//input[@id='min']"));
	   maxLengthField.sendKeys(maxLength);
	   
	   
	   WebElement questionField = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
	   questionField.sendKeys(question);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", customSaveButton);
	   Thread.sleep(3000);
	   js.executeScript("arguments[0].click();", customBackButton);
	
}
   
   // Custom Question- essay
   
   public void essayCustomQuestion(String questionTitle,String maxWord,String setTime,String question) throws InterruptedException {
	   
	   WebElement questionTitleField = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   questionTitleField.clear();
	   questionTitleField.sendKeys(questionTitle);
	   
	   WebElement maxWordField = driver.findElement(By.xpath("(//input[@placeholder='Maximum Word Limit'])[1]"));
	   maxWordField.clear();
	   maxWordField.sendKeys(maxWord);
	   
	   WebElement setTimeField = driver.findElement(By.xpath("//input[@id='min']"));
	   setTimeField.sendKeys(setTime);
	   
	   WebElement questionField = driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]"));
	   questionField.sendKeys(question);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", customSaveButton);
	   Thread.sleep(3000);
	   js.executeScript("arguments[0].click();", customBackButton);
	
}
   
   public void SQCustomQuestion(String questionTitle,String maxWord,String setTime,String question) throws InterruptedException {
	   
	   WebElement questionTitleField = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   questionTitleField.clear();
	   questionTitleField.sendKeys(questionTitle);
	   
	   WebElement maxWordField = driver.findElement(By.xpath("//input[@placeholder='Maximum Word Limit']"));
	   maxWordField.clear();
	   maxWordField.sendKeys(maxWord);
	   
	   WebElement setTimeField = driver.findElement(By.xpath("//input[@id='min']"));
	   setTimeField.sendKeys(setTime);
	   
	   WebElement questionField = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
	   questionField.sendKeys(question);
	   
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].click();", customSaveButton);
	   Thread.sleep(3000);
	   js.executeScript("arguments[0].click();", customBackButton);
	
}
   
   
 }


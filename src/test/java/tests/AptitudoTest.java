package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.MyAptitudoPage;
import utility.utils;




public class AptitudoTest extends LoginTest{
    By myAptitudoMenu = By.xpath("//a[normalize-space()='My APTITUDO']");

    @Test(priority = 1)

    public void goToMyAptitudo() throws InterruptedException {
        driver.findElement(myAptitudoMenu).click();
        //System.out.println("tarin");
        Thread.sleep(1200);
    }
    @Test(priority = 2)
	
    public void CreateAptitudo() throws InterruptedException {
    	String nameYourAptitudo = utils.getCellData("Sheet2", 0, 0);
        String department = utils.getCellData("Sheet2", 0, 1);
        String jobTitle = utils.getCellData("Sheet2", 0,2);
        String jobTitleId = utils.getCellData("Sheet2", 0,3);
        
        if (nameYourAptitudo == null || department == null || jobTitle == null ||jobTitleId == null) {
            throw new IllegalArgumentException("Test data missing for Step1- Name Aptitudo");
        }

        performstep1(nameYourAptitudo,department, jobTitle, jobTitleId);

        Thread.sleep(1200);
		
	}
    
    public void performstep1(String nameYourAptitudo,String department,String jobTitle,String jobTitleId) throws InterruptedException {
       MyAptitudoPage myaptitudo = new MyAptitudoPage(driver);
       myaptitudo.nameAptitudo(nameYourAptitudo,department, jobTitle, jobTitleId);
        Thread.sleep(3000); 
      
    }
    @Test(priority = 3)
    public void jobDescription() throws InterruptedException {
    	
    	String description = utils.getCellData("Sheet2", 0, 4);
    	
    	if (description == null ) {
            throw new IllegalArgumentException("Test data missing for Step2- Job Description");
        }
    	performstep2(description);

        Thread.sleep(1200);
	}
    
    public void performstep2(String description) throws InterruptedException {
        MyAptitudoPage jobdescription = new MyAptitudoPage(driver);
        jobdescription.jobDescription(description);
         Thread.sleep(3000); 
       
     }
  @Test(priority=4)
    
    public void selecttest() throws InterruptedException {
    	String testType = utils.getCellData("Sheet2", 1,0);
    	String noOfQuestion = utils.getCellData("Sheet2", 1,1);
    	String setDuration = utils.getCellData("Sheet2", 1, 2);
    	String industry = utils.getCellData("Sheet2",1,3);
    	String subIndustry = utils.getCellData("Sheet2",1,4);
    	String aptitudoTestType = utils.getCellData("Sheet2",1,5);	
		
    	
    	if (testType == null || noOfQuestion == null || setDuration == null ||industry == null || setDuration == null ||aptitudoTestType == null) {
            throw new IllegalArgumentException("Test data missing for Step3- Select Test");
        }
    	performstep3(testType, noOfQuestion, setDuration, industry, subIndustry, aptitudoTestType);

        Thread.sleep(1200);
	}
    
    public void performstep3(String testType, String noOfQuestion, String setDuration, String industry, String subIndustry, String aptitudoTestType) throws InterruptedException{
    	
    	MyAptitudoPage aiSelectTest = new MyAptitudoPage(driver);
    	aiSelectTest.selecttest(testType, noOfQuestion, setDuration, industry, subIndustry, aptitudoTestType);
         Thread.sleep(3000); 
		
	}
}

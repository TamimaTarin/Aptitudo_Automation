package tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;


import pages.MyAptitudoPage;
import utility.utils;

public class AptitudoTest extends LoginTest{
    By myAptitudoMenu = By.xpath("//a[normalize-space()='My APTITUDO']");
    By selectLibrary= By.xpath("//button[normalize-space()='Select Tests From Test Library']");

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

        MyAptitudoPage myaptitudo = new MyAptitudoPage(driver);
        myaptitudo.nameAptitudo(nameYourAptitudo,department, jobTitle, jobTitleId);
         Thread.sleep(3000); 
		  System.out.println("AptitudoTest.selectTestLibrary()");

		
	}
   
    @Test(priority = 3)
    public void jobDescription() throws InterruptedException {
    	
    	String description = utils.getCellData("Sheet2", 0, 4);
    	
    	if (description == null ) {
            throw new IllegalArgumentException("Test data missing for Step2- Job Description");
        }
    	
    	 MyAptitudoPage jobdescription = new MyAptitudoPage(driver);
         jobdescription.jobDescription(description);
         Thread.sleep(3000);
         System.out.println("tarin1111");

	}
    
  @Test(priority = 4)
    
    public void selecttest() throws InterruptedException {
	  for (int i = 1; i < 5; i++) {
    	String testType = utils.getCellData("Sheet2", i,0);
    	String noOfQuestion = utils.getCellData("Sheet2", i,1);
    	String setDuration = utils.getCellData("Sheet2", i, 2);
    	String industry = utils.getCellData("Sheet2",i,3);
    	String subIndustry = utils.getCellData("Sheet2",i,4);
    	String aptitudoTestType = utils.getCellData("Sheet2",i,5);	
    	String testName= utils.getCellData("Sheet2", i, 6);
    	
    	
    	if (testType == null || noOfQuestion == null || setDuration == null ||industry == null || setDuration == null ||aptitudoTestType == null || testName==null) {
            throw new IllegalArgumentException("Test data missing for Step3- Select Test");
        }
    	MyAptitudoPage aiSelectTest = new MyAptitudoPage(driver);
    	
    	if (testType.equalsIgnoreCase("Code")) {
            // Handle Code test: requires 2 extra fields
            String programminglang = utils.getCellData("Sheet2", i, 7);
            String passedTestCase = utils.getCellData("Sheet2", i, 8);
            String executionTime= utils.getCellData("Sheet2", i, 9);

            if (programminglang == null || passedTestCase == null || executionTime==null) {
                throw new IllegalArgumentException("Code test data missing (level/language) at row " + (i + 1));
            }

            aiSelectTest.selecttestCode(testType, noOfQuestion, setDuration, industry, subIndustry, aptitudoTestType, testName, programminglang, passedTestCase,executionTime );

        } else {
            // Handle MCQ, Essay, Case Study
            aiSelectTest.selecttest(testType, noOfQuestion, setDuration,industry, subIndustry, aptitudoTestType, testName);
        }
    	
    	
         Thread.sleep(3000);
         

	}
  }

//	public void selectTestLibrary() throws InterruptedException {
//	  System.out.println("AptitudoTest.selectTestLibrary()");
//		  driver.findElement(selectLibrary).click();
//		  
//	      Thread.sleep(1200);
//	}

  
}

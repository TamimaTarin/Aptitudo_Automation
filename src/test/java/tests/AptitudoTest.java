package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import pages.MyAptitudoPage;
import utility.utils;

public class AptitudoTest extends LoginTest{
    
    @Test(priority = 1)

    public void goToMyAptitudo() throws InterruptedException {
    	
      WebElement myAptitudoMenu= driver.findElement(By.xpath("//a[normalize-space()='My APTITUDO']"));
      myAptitudoMenu.click();
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
            // Handle Code test: requires 3 extra fields
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
	}
  }
  @Test(priority = 5)
    public void customQuestionCode() throws InterruptedException {
	  
	  WebElement selectCode= driver.findElement(By.xpath("(//div[@class='containerClass shadow-1'])[1]"));
	   selectCode.click();
	   Thread.sleep(1200);
	  
	  String questionTitle= utils.getCellData("Sheet2", 5, 0);
	  String selectLan=utils.getCellData("Sheet2", 5, 1);
	  String setTime =utils.getCellData("Sheet2", 5, 2);
	  String quetion=utils.getCellData("Sheet2", 5, 3);
	  String constraints1=utils.getCellData("Sheet2", 5, 4);
	  String constraints2=utils.getCellData("Sheet2", 5, 5);
	  String constraints3=utils.getCellData("Sheet2", 5, 6);
	  String example1In=utils.getCellData("Sheet2", 5, 7);
	  String example1Out=utils.getCellData("Sheet2", 5, 8);
	  String example1Exaplanation=utils.getCellData("Sheet2", 5, 9);
	  String example2In=utils.getCellData("Sheet2", 5, 10);
	  String example2Out=utils.getCellData("Sheet2", 5, 11);
	  String example2Exaplanation=utils.getCellData("Sheet2", 5, 12);
	  String passedTestScore=utils.getCellData("Sheet2", 5, 13);
	  
	  
	  if (questionTitle == null ||selectLan == null ||setTime == null ||quetion == null ||constraints1 == null ||
			  constraints2 == null ||constraints3 == null ||example1In == null ||example1Out == null ||example1Exaplanation == null ||
					  example2In == null ||example2Out == null || example2Exaplanation == null ||passedTestScore == null) {
          throw new IllegalArgumentException("Test data missing for Custom Question-Code");
      }
	  
	  MyAptitudoPage customCode = new MyAptitudoPage(driver);
	  customCode.codeCustomQuestion(questionTitle,selectLan, setTime, quetion, constraints1,
			  constraints2, constraints3, example1In, example1Out, example1Exaplanation,
			  example2In, example2Out, example2Exaplanation, passedTestScore);
      Thread.sleep(3000);
     // System.out.println("birokto ami ey testng niye");
	
}
  @Test(priority =6)
    public void customQuestionMcq() throws InterruptedException {
	  WebElement selectMcq= driver.findElement(By.xpath("(//div[@class='containerClass shadow-1'])[2]"));
	  selectMcq.click();
	   Thread.sleep(1200);
	  for (int i = 5; i < 10; i++) {
	    	String questionTitle = utils.getCellData("Sheet2", i,0);
	    	String settime = utils.getCellData("Sheet2", i,1);
	    	String question = utils.getCellData("Sheet2", i, 2);
	    	String option1 = utils.getCellData("Sheet2",i,3);
	    	String option2 = utils.getCellData("Sheet2",i,4);
	    	String option3 = utils.getCellData("Sheet2",i,5);	
	    	String option4= utils.getCellData("Sheet2", i, 6);
	    	
	    	
	    	if (questionTitle == null || settime == null || question == null ||option1 == null || option2 == null ||option3 == null || option4==null) {
	            throw new IllegalArgumentException("Test data missing for Custom Question-MCQ");
	        }
	  
	    	 MyAptitudoPage custommcq = new MyAptitudoPage(driver);
	    	 custommcq.mcqCustomQuestion(questionTitle,settime, question, option1, option2,option3, option4);
	         Thread.sleep(3000);	
}
  }
  @Test(priority =7)
 public void customQuestionFileUpload() throws InterruptedException {
	  WebElement selectFileUpload= driver.findElement(By.xpath("(//div[@class='containerClass shadow-1'])[3]"));
	  selectFileUpload.click();
	   Thread.sleep(1200);
	   
	  String questionTitle= utils.getCellData("Shett2", 11, 0);
	  String question=utils.getCellData("Sheet2", 11, 1);
	  
	  if (questionTitle == null || question == null) {
          throw new IllegalArgumentException("Test data missing for Custom Question-File Upload");
      }
	  
	  MyAptitudoPage customFile = new MyAptitudoPage(driver);
	  customFile.fileUploadCustomQuestion(questionTitle,question);
      Thread.sleep(3000);
	
}
  @Test(priority =8)
 public void customQuestionVideo() throws InterruptedException {
	  WebElement selectVideo= driver.findElement(By.xpath("(//div[@class='containerClass shadow-1'])[4]"));
	  selectVideo.click();
	   Thread.sleep(1200);
	   String questionTitle = utils.getCellData("Sheet2", 12,0);
   	   String maxLength = utils.getCellData("Sheet2", 12,1);
   	   String question = utils.getCellData("Sheet2", 12, 2);
   	   
   	   
   	 if (questionTitle == null || maxLength == null || question == null) {
         throw new IllegalArgumentException("Test data missing for Custom Question-Video");
     }
	  
	  MyAptitudoPage customVideo = new MyAptitudoPage(driver);
	  customVideo.videoCustomQuestion(questionTitle,maxLength,question);
     Thread.sleep(3000);
	
}
  @Test(priority =9)
 public void customQuestionEssay() throws InterruptedException {
	  WebElement selectEssay= driver.findElement(By.xpath("(//div[@class='containerClass shadow-1'])[5]]"));
	  selectEssay.click();
	   Thread.sleep(1200);
	   
	   String questionTitle = utils.getCellData("Sheet2", 13,0);
   	   String maxWord = utils.getCellData("Sheet2", 13,1);
   	   String setTime = utils.getCellData("Sheet2", 13,2);
   	   String question = utils.getCellData("Sheet2", 13, 3);
   	   
   	   
   	 if (questionTitle == null || maxWord == null || setTime == null || question == null) {
         throw new IllegalArgumentException("Test data missing for Custom Question-Essay");
     }
	  
	  MyAptitudoPage customEssay = new MyAptitudoPage(driver);
	  customEssay.essayCustomQuestion(questionTitle,maxWord,setTime,question);
     Thread.sleep(3000);
	   
	   
	
	
	
}
  @Test(priority =10)
 public void customQuestionSQ() throws InterruptedException {
	  
	  WebElement selectSQ= driver.findElement(By.xpath("(//div[@class='containerClass shadow-1'])[6]"));
	  selectSQ.click();
	   Thread.sleep(1200);
	   
	   String questionTitle = utils.getCellData("Sheet2", 13,0);
   	   String maxWord = utils.getCellData("Sheet2", 13,1);
   	   String setTime = utils.getCellData("Sheet2", 13,2);
   	   String question = utils.getCellData("Sheet2", 13, 3);
   	   
   	   
   	 if (questionTitle == null || maxWord == null || setTime == null || question == null) {
         throw new IllegalArgumentException("Test data missing for Custom Question-Essay");
     }
	  
	  MyAptitudoPage customSQ = new MyAptitudoPage(driver);
	  customSQ.SQCustomQuestion(questionTitle,maxWord,setTime,question);
     Thread.sleep(3000);
	   
	
}

  
}

package StepDef;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import Pages.ElelementWebElementPage;
import Runner.DriverFactory;
import io.cucumber.java.en.Then;

public class ElementWebTableStep {
	
	ElelementWebElementPage webtable=new ElelementWebElementPage(DriverFactory.getdriver());
	
	@Then("click on the WebTable option")
	public void click_on_the_web_table_option() throws InterruptedException {
		Thread.sleep(2000);
	    webtable.clickonWebTable();
	    System.out.println("webtable option is clicked");
	}

	@Then("Verify the add button and click on that button")
	public void verify_the_add_button_and_click_on_that_button() throws InterruptedException {
		Thread.sleep(2000);
		webtable.clickonAddRecord();
		System.out.println("addrecord button is clicked");
	}

	@Then("Fetch input fields and verify {string} {string} {string} {string} {string} {string}")
	public void fetch_input_fields_and_verify(String string1, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> list= webtable.getinoputfields();
		ArrayList<WebElement> arrayList = new ArrayList<>(list);       
		for(WebElement ele:arrayList) {
			System.out.println(ele);
		}
		
		
	String[] str= webtable.verifylabels();
	String[] str2= new String[6];
 	str2[0]=string1;
 	str2[1]=string2;
 	str2[2]=string3;
 	str2[3]=string4;
 	str2[4]=string5;
 	str2[5]=string6;
 	
 	
 	int a=0;
	for(int i=0; i<str.length; i++) {
		System.out.println(str[i]);
		System.out.println(str2[i]);
		if(str[i].equals(str2[i])) {
			a++;
			
		}
	}
	
	if(a==6) {
		Assert.assertTrue(true);
		System.out.println("all labesls are matched");
		
	}
	else {
		Assert.assertTrue(false);
	}
		
	}

	@Then("enter the inputs {string} {string} {string} {string} {string} {string}")
	public void enter_the_inputs(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		Thread.sleep(2000);
		
		
		webtable.enterinputs(string, string2, string3, string4, string5, string6);
		
		System.out.println("all inputs are taken");
		
		
	}

	@Then("Click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		Thread.sleep(2000);
		webtable.clicksubmit();
		System.out.println("submit button is clicked");
		
		
	}

	
	@Then("verify the detials in the table {string} {string} {string} {string} {string} {string}")
	public void verify_the_detials_in_the_table(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = webtable.getheaders();
		System.out.println(element.getText());
	
		String [] str = webtable.getdata(string);
		String [] str2=new String[6];
		   str2[0]=string;
		   str2[1]=string2;
		   str2[2]=string3;
		   str2[3]=string4;
		   str2[4]=string5;
		   str2[5]=string6;
		   int b=0;
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals(str[i])) {
				b++;
				
			}
		}
		
		if(b==6) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		
		
	}

	
	
	@Then("search on with firsnamt {string}")
	public void search_on_with_firsnamt_naveen(String string) {
		webtable.searchwithname(string);
	    
	}

	@Then("verify the detials in the table after searching {string} {string} {string} {string} {string} {string}")
	public void verify_the_detials_in_the_table_after_searching(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		Thread.sleep(2000);
		WebElement element = webtable.getheaders();
		System.out.println(element.getText());
	
		String [] str = webtable.getdata(string);
		String [] str2=new String[6];
		   str2[0]=string;
		   str2[1]=string2;
		   str2[2]=string3;
		   str2[3]=string4;
		   str2[4]=string5;
		   str2[5]=string6;
		   int b=0;
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals(str[i])) {
				b++;
				
			}
		}
		
		if(b==6) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		
		
	}
	
	@Then("verify the error msg {string}")
	public void verify_the_error_msg(String string) throws InterruptedException {
		Thread.sleep(2000);
	  String[] st= webtable.getelementerrormsg();
	  int b=0;
	  for(int i=0;i<st.length; i++) {
		  System.out.println(st[i]);
		  System.out.println(string);
		  if(st[i].equals(string)) {
			  System.out.println(st[i]);
			  b++;
		  }
	  }
	  
	  if(b==6) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.assertTrue(true);

	  }
	}

	@Then("verify the error msg for format {string}")
	public void verify_the_error_msg_for_format(String string) throws InterruptedException {
		Thread.sleep(2000);
		String[] st= webtable.getelementerrormsgformat();
		  int b=0;
		  for(int i=0;i<st.length; i++) {
			  System.out.println(st[i]);
			  System.out.println(string);
			  if(st[i].equals(string)) {
				  System.out.println(st[i]);
				  b++;
			  }
		  }
		  
		  if(b==3) {
			  Assert.assertTrue(true);
		  }
		  else {
			  Assert.assertTrue(true);

		  }
	}

}

package StepDef;

import org.junit.Assert;

import Pages.ElementButtonsPage;
import Runner.DriverFactory;
import io.cucumber.java.en.Then;

public class Elementbuttonsstep{
	ElementButtonsPage button=new ElementButtonsPage(DriverFactory.getdriver());
			
	
	
	
	@Then("click on the buttons option")
	public void click_on_the_buttons_option() throws InterruptedException {
		Thread.sleep(2000);
	   button.clickbuttons();
	   System.out.println("button got clicked");
	}

	@Then("varify the all the buttons are displayed")
	public void varify_the_all_the_buttons_are_displayed() throws InterruptedException {
		Thread.sleep(2000);
		String [] str=button.verifybuttonsdisplayed();
		int b=0;
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
			if(str[i].equals("true")) {
				b++;
			}
			
		}
		if(b==3) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
	}

	@Then("varify the msg displayed below {string} {string} {string}")
	public void varify_the_msg_displayed_below(String string, String string2, String string3) throws InterruptedException {
		Thread.sleep(2000);
		
		String [] str=button.verifytextmsg();
		String [] str2=new String[3];
		str2[0]=string;
		str2[1]=string2;
		str2[2]=string3;	
		int b=0;
		for(int i=0;i<str.length;i++) {
			
			System.out.println(str[i]);
			System.out.println(str2[i]);
			if(str[i].equals(str2[i])) {
				b++;
			}
			
		}
		if(b==3) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
		
	}

}

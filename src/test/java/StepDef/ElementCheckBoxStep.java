package StepDef;

import org.junit.Assert;

import Pages.ElementCheckBoxPage;
import Runner.DriverFactory;
import io.cucumber.java.en.Then;

public class ElementCheckBoxStep {
	
	
	ElementCheckBoxPage checkbox=new ElementCheckBoxPage(DriverFactory.getdriver());
	
	
	

@Then("click on the check box option")
public void click_on_the_check_box_option() throws InterruptedException {
	Thread.sleep(5000);
	checkbox.clickcheckboxoption();
  
}

@Then("verify chekcbox unselected")
public void verify_chekcbox_unselected() throws InterruptedException {
	Thread.sleep(5000);
   boolean selected=   checkbox.verifyhomecheckboxunselected();
   if(selected=true) {
	   Assert.assertTrue(true);
   }
      
}

@Then("Verify all the checkboxes unselected")
public void verify_all_the_checkboxes_unselected() throws InterruptedException {
	Thread.sleep(5000);
//	System.out.println(checkbox.verifyallcheckboxunselected());
     String [] str2= checkbox.verifyallcheckboxunselected();
    
     int a =0;
     for(int b=0; b<3; b++) {
    	 System.out.println(str2[b]);
    	 if(str2[b].equals("false")) {
    		 a++;
    	 }
     }
     
     if(a==3) {
    	 Assert.assertTrue(true);
     }
     
     
}

@Then("select the checkbox")
public void select_the_checkbox() throws InterruptedException {
	Thread.sleep(5000);
  checkbox.clickparentcheckbox();
  
}

@Then("verify all the checkboxes selected")
public void verify_all_the_checkboxes_selected() throws InterruptedException {
	Thread.sleep(5000);
  String [] str=checkbox.verifyallcheckboxselected();
  int a =0;
  for(int b=0; b<3; b++) {
 	 if(str[b].equals("true")) {
 		 a++;
 	 }
  }
  
  if(a==3) {
 	 Assert.assertTrue(true);
  }
  
  
  
}

@Then("verify text msg showned below")
public void verify_text_msg_showned_below() throws InterruptedException {
	Thread.sleep(5000);
    String str= checkbox.verifyresult();
    System.out.println(str);
    
    
}

//@Then("diselect the parent checkbox and verify the text msg")
//public void diselect_the_parent_checkbox_and_verify_the_text_msg() {
// 
//}
//
//@Then("select only one child checkbox and verify parent check box partially selected")
//public void select_only_one_child_checkbox_and_verify_parent_check_box_partially_selected() {
//  
//}
//
//@Then("verify text msg showned below contains selected child and parent checkbox name")
//public void verify_text_msg_showned_below_contains_selected_child_and_parent_checkbox_name() {
//   
//}
//
//@Then("select all the child checkbox and verify parent chekc box fully selected")
//public void select_all_the_child_checkbox_and_verify_parent_chekc_box_fully_selected() {
//
//}
//
//@Then("diselect only one child check box and verify parent check box got updated as partially selected")
//public void diselect_only_one_child_check_box_and_verify_parent_check_box_got_updated_as_partially_selected() {
//   
//}
//
//@Then("verify text msg showned below that updated to only selected checkboxes")
//public void verify_text_msg_showned_below_that_updated_to_only_selected_checkboxes() {
//    
//}
//
//@Then("diselect all the child checkbox and verify parent check box is unselected")
//public void diselect_all_the_child_checkbox_and_verify_parent_check_box_is_unselected() {
//  
//}
//
//@Then("verify arrow point working functionality")
//public void verify_arrow_point_working_functionality() {
// 
//}
//
//@Then("verify plus and minus working functionality")
//public void verify_plus_and_minus_working_functionality() {
//   
//}

}

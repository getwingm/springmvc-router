package org.springframework.web.servlet.mvc.router;

import javax.inject.Named;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Named("myTestController")
public class MyTestController {

	public void simpleAction() {
		
	}
	
	public void paramAction(@PathVariable(value = "param") String param) {
	
	}
	
	public void httpAction(@PathVariable(value ="type") String type) {
		
	}
	
	public void regexNumberAction(@PathVariable(value ="number") int number) {
		
	}
	
	public void regexStringAction(@PathVariable(value ="string") String string) {
		
	}
	
	public void hostAction(@PathVariable(value ="host") String host) {
		
	}

}

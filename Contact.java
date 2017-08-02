
package javaapplication13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    
    public boolean validatePhoneNumber(String phoneNo) {
	
		if (phoneNo.matches("\\d{10}")) 
                   return true;
        return false;
    }
    
}

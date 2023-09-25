package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object emailexist
     
    /**
     * <p></p>
     */
    public static Object id
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object globalemail
     
    /**
     * <p></p>
     */
    public static Object first_name
     
    /**
     * <p></p>
     */
    public static Object last_name
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            emailexist = selectedVariables['emailexist']
            id = selectedVariables['id']
            email = selectedVariables['email']
            globalemail = selectedVariables['globalemail']
            first_name = selectedVariables['first_name']
            last_name = selectedVariables['last_name']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

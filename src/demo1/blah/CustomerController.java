package blah;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {


    //pre-process all web requests coming into controller
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        //stringTrimmerEditor removes whitespaces (leading and trailing) this is defined in springAPI
        //StringTrimmerEditor(true) the true means trim down to null if there is only white space
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        //registerCustomEditor(String.class, StringTrimmerEditor) means perform for all strings
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        theModel.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            //tells spring to validate the customer object being passed in
            //ModelAttribute is the customer object. Spring will store the result in the BindingResult
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult){
        //for debugging
        System.out.println("Last name: |" + theCustomer.getLastName()+"|");
        System.out.println("Binding Result: " + theBindingResult);
        System.out.println("\n\n\n\n");
        //check the bindingResult if it has errors
        if(theBindingResult.hasErrors()){
            //send back to the form page
            return"customer-form";
        }else{
            //send to success confirmation page
            return "customer-confirmation";
        }
    }


}

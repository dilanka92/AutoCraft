package com.autocraft.controller;

import com.autocraft.model.Customer;
import com.autocraft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        //use this when the login is complete
//        return "home";
        return "mainmenu";
    }

    @RequestMapping(value = "/addCustomers", method = RequestMethod.GET)
    public String addCustomers(ModelMap model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        model.addAttribute("edit", false);
        return "AddCustomers";
    }

    @RequestMapping(value = "/saveCustomer", method = RequestMethod.GET)
    @ResponseBody
    public String saveCustomer(@Valid Customer customer) {
        if (customerService.saveCustomer(customer)) {
            return messageSource.getMessage("save.success", null, Locale.getDefault());
        } else {
            return messageSource.getMessage("save.error", null, Locale.getDefault());
        }
    }

    @RequestMapping(value = "/loadAllCustomers", method = RequestMethod.GET)
    public ModelAndView loadAllCustomers() {
        ModelAndView modelAndView = new ModelAndView("customerDetail");
        modelAndView.addObject("customers", customerService.findAllCustomers());
        return modelAndView;
    }

    @RequestMapping(value = {"/edit-{cusId}-customer"}, method = RequestMethod.GET)
    public String editCustomer(@PathVariable int cusId, ModelMap model) {
        Customer customer = customerService.findById(cusId);
        model.addAttribute("customer", customer);
        model.addAttribute("edit", true);
        return "AddCustomers";
    }

    @RequestMapping(value = {"/update-{cusId}-customer"}, method = RequestMethod.GET)
    @ResponseBody
    public String updateCustomer(@Valid Customer customer, BindingResult result,
                                 ModelMap model, @PathVariable String cusId) {

        if (customerService.isCustomerUnique(customer.getCusId())) {
            if (customerService.updateCustomer(customer)) {
                return messageSource.getMessage("save.success", null, Locale.getDefault());
            } else {
                return messageSource.getMessage("save.error", null, Locale.getDefault());
            }
        } else {
            return messageSource.getMessage("save.error", null, Locale.getDefault());
        }
    }
}

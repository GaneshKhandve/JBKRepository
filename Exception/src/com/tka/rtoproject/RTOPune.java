package com.tka.rtoproject;

import com.tka.allcustomeexception.AgeToHighException;
import com.tka.allcustomeexception.AgeToLowException;

public class RTOPune extends RTOService {
    public static void main(String[] args) {
        RTO rto = new RTO("Pune RTO","Pune District");
        RTOService rtoService = new RTOPune();

        try {
            rtoService.checkAgeValidation(rto,25);
        } catch (AgeToLowException e){
            System.out.println(e.getMessage());
        }
           catch (AgeToHighException e){
             System.out.println(e.getMessage());
         }
    }




}

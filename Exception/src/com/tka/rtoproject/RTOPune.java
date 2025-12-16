package com.tka.rtoproject;

import com.tka.allcustomeexception.AgeToHighException;
import com.tka.allcustomeexception.AgeToLowException;
import com.tka.allcustomeexception.OutOfRegionAddress;

public class RTOPune extends RTOService {
    public static void main(String[] args) {
        RTO rto = new RTO("Pune RTO","Pune District");
        RTOService rtoService = new RTOPune();

        try {
            rtoService.checkAgeValidation(rto,21);
        } catch (AgeToLowException e){
            System.out.println(e.getMessage());
        }
           catch (AgeToHighException e){
             System.out.println(e.getMessage());
         }

        try {
            rtoService.checkRegion(rto,"Ahilyanagar");
        } catch (OutOfRegionAddress e){
            System.out.println(e.getMessage());
        }


    }




}

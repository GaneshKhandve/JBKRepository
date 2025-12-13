package com.tka.rtoproject;

import com.tka.allcustomeexception.AgeToHighException;
import com.tka.allcustomeexception.AgeToLowException;
import com.tka.allcustomeexception.OutOfRegionAddress;

public class RTOService {
    void checkAgeValidation(RTO rto, int age) throws AgeToHighException,AgeToLowException{
        String nameOfRto = rto.getRtoName();

        if (age<18){
         throw new AgeToLowException("Not allow due to Age is too Low for Applying Driving License "+nameOfRto);
        } else if (age>75) {
            throw new AgeToHighException("Not allow due to Age is too High for Applying Driving License " +nameOfRto);
        }
        else {
            System.out.println("Age Is Valid Welcome To Pune RTO");
        }

    }

    void checkRegion(RTO rto , String region) throws OutOfRegionAddress {
        String nameOfRto = rto.getRtoName();

        if (region.equals("Pune")){
            System.out.println("Candidate Valid for Apply Licence for Region "+ nameOfRto);
        } else{
            throw new OutOfRegionAddress("Candidate is not Valid for Pune Region");
        }
    }
}

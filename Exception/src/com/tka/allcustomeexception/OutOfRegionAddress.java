package com.tka.allcustomeexception;

public class OutOfRegionAddress extends RuntimeException {
    public OutOfRegionAddress(){
        super();
    }

    public OutOfRegionAddress (String msg){
        super(msg);
    }
}

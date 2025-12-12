package com.tka.rtoproject;

public class RTO {
    private String rtoName;
    private String rtoDistrict;

    public RTO(String rtoName, String rtoDistrict) {
        this.rtoName = rtoName;
        this.rtoDistrict = rtoDistrict;
    }

    public String getRtoName() {
        return rtoName;
    }

    public void setRtoName(String rtoName) {
        this.rtoName = rtoName;
    }

    public String getRtoDistrict() {
        return rtoDistrict;
    }

    public void setRtoDistrict(String rtoDistrict) {
        this.rtoDistrict = rtoDistrict;
    }

    @Override
    public String toString() {
        return "RTO{" +
                "rtoName='" + rtoName + '\'' +
                ", rtoDistrict='" + rtoDistrict + '\'' +
                '}';
    }
}

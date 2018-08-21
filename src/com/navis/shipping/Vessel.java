package com.navis.shipping;
enum Ship_type{
    BARGE,COMMON,REFER
}
public class Vessel {
    private String vesselId;
    private String lineOperator;
    private long noOfContainers;
    private String manufacturer;
    private long weight;
    private Ship_type s;
    private boolean isOperative;
//    private VesselVist vesselVist;
    private Container[] c;
    private int fuelCapacity;
}

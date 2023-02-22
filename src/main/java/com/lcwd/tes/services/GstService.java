package com.lcwd.tes.services;

public class GstService {

    private GstProvider gstProvider;

    public GstService(GstProvider gstProvider) {
        this.gstProvider = gstProvider;
    }

    public int calculateGST(){
        System.out.println("Calculating GST");
        int rate=this.gstProvider.getGSTDetails();
        System.out.println("GST rate is"+rate);
        return rate;
    }
}

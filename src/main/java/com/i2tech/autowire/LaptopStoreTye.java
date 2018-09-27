package com.i2tech.autowire;

public class LaptopStoreTye {
	private AcerLaptop laptop1;  
    private HpLaptop laptop2;  

    public AcerLaptop getLaptop1() {  
         return laptop1;  
    }  
    public void setLaptop1(AcerLaptop laptop1) {  
         this.laptop1 = laptop1;  
    }  
    public HpLaptop getLaptop2() {  
         return laptop2;  
    }  
    public void setLaptop2(HpLaptop laptop2) {  
         this.laptop2 = laptop2;  
    }  
}

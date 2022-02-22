package com.company;

record laptop(int speedProcessor,int amountOfRam,
              String ownerCountry,int price,int yearOfCreation) {

    private static final String VIDEO_CARD = "RTX 3050";

    public static String getVideoCard(){
       return VIDEO_CARD;
    }

    laptop(){
        this(0,0,null,0,0);
    }

     laptop(int speedProcessor,int amountOfRam,String ownerCountry){

        this(speedProcessor, amountOfRam,ownerCountry,0,2022);
    }

    @Override
    public String toString() {
        return "laptop[" +
                "speedProcessor = " + speedProcessor +
                ", amountOfRam = " + amountOfRam +
                ", ownerCountry = '" + ownerCountry + '\'' +
                ", price = " + price +
                ", yearOfCreation = " + yearOfCreation +
                ']';
    }
}

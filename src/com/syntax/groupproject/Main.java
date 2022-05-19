package com.syntax.groupproject;

public class Main {

    public static void main(String[] args) {
        SolarSystem factorX = new SolarSystem();
        factorX.sun="1";
        factorX.moon ="4";
        factorX.planet="2";
        factorX.stars="10000";

        //adding 2nd scenario: feature of sun

        FeatureSun Xfact= new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="309324934898kj";

        FeatureStars fs = new FeatureStars();
        fs.size="5";
        fs.color=red;
        fs.radius="1";
    }
}

package org.example;

public class IMCCalc {
    public float calcImc(int height, float weight) {
        return (float) (weight / Math.pow(height, 2));
    }
}

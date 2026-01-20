package com.example;

public class activity7 {
    public interface BicycleParts{
        public int tyres=2;
        public int maxSpeed=120;
    }
    public interface BicycleOperations{
        void applyBrake(int decrement);
        void speedUp(int increment);
    }

    
}

package com.company;

public class LimitException extends Exception {

        double remainingAmount;

        public LimitException(String message){
            super(message);
            this.remainingAmount = remainingAmount;
        }
        public LimitException(double remainingAmount){
            this.remainingAmount = remainingAmount;
        }
    }

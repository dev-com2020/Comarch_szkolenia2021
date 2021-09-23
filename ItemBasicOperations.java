package com.company;

public interface ItemBasicOperations {

    private int getItemValue(int value1, int value2) {
        return value1 + value2;
    }

    default int multiply(int value) {
        return getItemValue(4,3) * value;
    }

    default int sum(int value) {
        return getItemValue(4,3) + value;
    }
}
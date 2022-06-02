package org.example.zadanie6.ru.netology.sqr;

public class SQRService {
    public int calcSQRService(int limit1, int limit2) {
        int amount = 0;
        for (int square = 10; square <= 99; square++) {
            if ((limit1 <= square * square) && (square * square <= limit2)) {
                amount++;
            }
        }
        return amount;
    }
}

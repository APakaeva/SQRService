package org.example.zadanie6.ru.netology.sqr;

public class SQRService {
    public int calcSQRService(int a, int b) {
        int z = 0;
        for (int i = 10; i <= 99; i++) {
            if ((a <= i * i) && (i * i <= b)) {
                z++;
            }
        }
        return z;
    }
}

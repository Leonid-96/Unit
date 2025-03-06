package ru.netology.service;

public class Cahsback {

    public class CashbackHackService {
        private final int boundary = 1000;

        public int remain(int amount) {
            return boundary - amount % boundary;
        }
    }
}

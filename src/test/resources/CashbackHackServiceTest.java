package ru.netology.service;

    public class CashBackHackerTest {

        @Test
        public void shouldReturn1000IfAmountIs0() {
            CashbackHackService CashbackHackService = new CashbackHackService();
            int amount = 0;

            int actual = CashbackHackService.remain(amount);
            int expected = 1000;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldReturn100IfAmountIs900() {
            CashbackHackService CashbackHackService = new CashbackHackService();
            int amount = 900;

            int actual = CashbackHackService.remain(amount);
            int expected = 100;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldReturn1IfAmountIs999() {
            CashbackHackService CashbackHackService = new CashbackHackService();
            int amount = 999;

            int actual = CashbackHackService.remain(amount);
            int expected = 1;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldReturn0IfAmountIs1000() {
            CashbackHackService CashbackHackService = new CashbackHackService();
            int amount = 1000;

            int actual = CashbackHackService.remain(amount);
            int expected = 0;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldReturn0IfAmountIs1001() {
            CashbackHackService CashbackHackService = new CashbackHackService();
            int amount = 1001;

            int actual = CashbackHackService.remain(amount);
            int expected = 0;
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void shouldReturn0IfAmountIs1400() {
            CashbackHackService CashbackHackService = new CashbackHackService();
            int amount = 1400;

            int actual = CashbackHackService.remain(amount);
            int expected = 0;
            Assert.assertEquals(expected, actual);
        }
    }
}

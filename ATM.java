class ATM {
    public int countBanknotes(int sum) {
        int counter = 0;
        int i = sum;
        while (sum > 0) {
             i = i / 500;
            counter += i;
             sum = sum % 500;
             i = sum;
             if (sum != 0) {
                 i = i / 200;
                 counter += i;
                 sum = sum % 200;
                 i = sum;
             } if (sum != 0) {
                i = i / 100;
                counter += i;
                sum = sum % 100;
                i = sum;
            } if (sum != 0) {
                i = i / 50;
                counter += i;
                sum = sum % 50;
                i = sum;
            } if (sum != 0) {
                i = i / 20;
                counter += i;
                sum = sum % 20;
                i = sum;
            } if (sum != 0) {
                i = i / 10;
                counter += i;
                sum = sum % 10;
                i = sum;
            } if (sum != 0) {
                i = i / 5;
                counter += i;
                sum = sum % 5;
                i = sum;
            } if (sum != 0) {
                i = i / 2;
                counter += i;
                sum = sum % 2;
                i = sum;
            } if (sum != 0) {
                i = i;
                counter += i;
                sum = 0;
            }
        }
          return counter;
    }

}

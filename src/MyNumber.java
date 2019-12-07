final class MyNumber {
    double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean myNumberIsOdd() {
             return number % 2 == 1 ;
    }

    public boolean myNumberisEven() {
        return number % 2 == 0;

        }
    public MyNumber myNumberAdd(MyNumber x) {
        return new MyNumber(number + x.number);
    }

    public MyNumber myNumberSubstract(MyNumber x) {
        return new MyNumber(number - x.number);
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "number=" + number +
                '}';
    }
}


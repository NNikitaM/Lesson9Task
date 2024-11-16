public abstract class Phone {
    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public final void makeCall(String targetNumber) {
        overloadMakeCall(number);
        System.out.println("Привет!");
    }

    protected abstract void overloadMakeCall(String targetNumber);
}
public class LandlinePhone extends Phone{
    public LandlinePhone(String number) {
        super(number);
    }

    @Override
    protected void overloadMakeCall(String targetNumber) {
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
    }
}

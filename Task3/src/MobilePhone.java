public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    @Override
    protected void overloadMakeCall(String targetNumber) {
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");

    }

    void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
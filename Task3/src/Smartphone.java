public class Smartphone extends MobilePhone{
    private String appName;

    public Smartphone(String number, String appName) {
        super(number);
        this.appName = appName;
    }

    void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    @Override
    protected void overloadMakeCall(String targetNumber) {
        System.out.println("Позвоним через приложение " + appName + " по номеру" + targetNumber);

    }

}
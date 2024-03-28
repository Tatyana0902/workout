package mvc.observer;

public class PassportDemo {
    public static void main(String[] args) {
        PassportModel passportModel = new PassportModel();
        PassportView passportView = new PassportView(passportModel);
        passportModel.setName("Masha");
        passportModel.setName("Glasha");
    }
}

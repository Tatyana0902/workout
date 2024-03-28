package mvc.observer;

public class PassportModel {

    static int passportIdGenerator = 0;

    private String name;
    private int id;
    private PassportModelListener listener;
    public void setListener(PassportModelListener listener) {
        this.listener = listener;
    }

    public PassportModel() {
        this.id = passportIdGenerator;
        passportIdGenerator++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        if (listener != null){
            listener.onNameChanged();
        }
    }

    public static void main(String[] args) {
        PassportModel masha = new PassportModel();
        masha.setName("Masha");
        System.out.println(masha.getId() + " " + masha.getName());

        PassportModel glasha = new PassportModel();
        glasha.setName("Glasha");
        System.out.println(glasha.getId() + " " + glasha.getName());
    }

    public int getId() {
        return id;
    }
}

package mvc.observer;

public class PassportView implements PassportModelListener {
    private final PassportModel model;

    public PassportView(PassportModel model) {
        this.model = model;
        model.setListener(this);
    }

    @Override
    public void onNameChanged() {
        System.out.println(model.getName());
    }
}

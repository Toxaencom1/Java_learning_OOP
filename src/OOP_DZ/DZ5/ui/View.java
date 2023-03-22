package OOP_DZ.DZ5.ui;

import OOP_DZ.DZ5.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    int scan();

    String scanRecord();

    void start();

    void print(String text);

    void succeeded(boolean isWork);

    void setFlag(boolean flag);

    void infoOutput();

    void addRecord();

    void removeRecord();

    void changeRecord();

    void exit();
}

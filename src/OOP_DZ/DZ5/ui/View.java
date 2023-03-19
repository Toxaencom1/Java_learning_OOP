package OOP_DZ.DZ5.ui;

import OOP_DZ.DZ5.presenter.Presenter;

import java.util.List;

public interface View {
    void setPresenter(Presenter presenter);
    int scan();
    String scanRecord();
    void start();
    void print(String text);
    void showMenu(List<String> menu);
    void succeeded(boolean isWork, String title);
}

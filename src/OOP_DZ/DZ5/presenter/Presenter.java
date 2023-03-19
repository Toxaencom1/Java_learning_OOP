package OOP_DZ.DZ5.presenter;

import OOP_DZ.DZ5.notebook.Record;
import OOP_DZ.DZ5.notebook.Service;
import OOP_DZ.DZ5.ui.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void choice(int choice) {
        switch (choice) {
            case 1 -> view.print(service.getInfo());
            case 2 -> {
                Record record = new Record(view.scanRecord());
                service.addRecord(record);
                view.print("Success!");
            }
            case 3 -> {
                chooseRecord();
                int record = view.scan();
                view.succeeded(service.removeRecord(record), "Can`t find record with your ID");
            }
            case 4 -> {
                chooseRecord();
                int id = view.scan();
                view.print("Enter changed data to: ");
                view.print("\nYour choice: "+service.get(id));
                String record = view.scanRecord();
                view.succeeded(service.changeRecord(id, record), "Can`t find record with your ID");
            }
            case 5 -> System.exit(0);
        }
    }

    private void chooseRecord() {
        view.print("Choose record id: ");
        view.print(service.getInfo());
    }
}

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
    public void infoOutput(){
        view.print(service.getRecordInfo());
    }
    public void addRecord(){
        Record record = new Record(view.scanRecord(), service.startFrom());
        service.addRecord(record);
        view.print("Success!");
    }
    public void removeRecord(){
        chooseRecord();
        int record = view.scan();
        view.succeeded(service.removeRecord(record));
    }
    public void changeRecord(){
        chooseRecord();
        int id = view.scan();
        view.print("Enter changed data to: ");
        view.print("\nYour choice: " + service.getRecordFromList(id));
        String record = view.scanRecord();
        view.succeeded(service.changeRecord(id, record));
    }
//    public void exit(){
//        view.setFlag(false);
//    }

    private void chooseRecord() {
        view.print("Choose record id: ");
        view.print(service.getRecordInfo());
    }
}

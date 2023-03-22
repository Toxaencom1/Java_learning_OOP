package OOP_DZ.DZ5.notebook;

import java.util.*;

public class RecordsList implements Service {

    private List<Record> records;

    public RecordsList() {
        this.records = new ArrayList<>();
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @Override
    public void addRecord(Record record) {
        records.add(record);
    }

    @Override
    public boolean removeRecord(int id) {
        for (Record item : records) {
            if (item.getId() == id) {
                records.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean changeRecord(int id, String newRecord) {
        for (Record item : records) {
            if (item.getId() == id) {
                item.setRecord(newRecord);
                item.setCreateTime();
                return true;
            }
        }
        return false;
    }
    @Override
    public int getMaxId() {
        int max = 0;
        if(records.size() != 0){
            for (Record item :records) {
                if(item.getId()>max){
                    max = item.getId();
                }
            }
        }
        return max;
    }

    @Override
    public String get(int id) {
        for (Record item : records) {
            if (item.getId() == id) {
                return item.getRecord();
            }
        }
        return "No records found with your ID.";
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (Record item : records) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}

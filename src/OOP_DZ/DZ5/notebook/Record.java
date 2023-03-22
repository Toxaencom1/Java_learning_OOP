package OOP_DZ.DZ5.notebook;

import java.util.Date;

public class Record {
    private final int id;
    private String createTime;
    private String record;


    public Record(String record, int id) {
        this.record = record;
        this.id = ++id;
        this.createTime = new Date().toString();
    }

    public int getId() {
        return id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getRecord() {
        return record;
    }

    public void setCreateTime() {
        this.createTime = getCreateTime() + ", Changed: " + new Date();
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return id + ": " + record + "   |Created: " + createTime;
    }
}

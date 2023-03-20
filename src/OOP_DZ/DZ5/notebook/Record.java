package OOP_DZ.DZ5.notebook;

import java.util.Date;

public class Record {
    private int id;
    private String createTime;
    private static int idStart = 0;
    private String record;

    public Record(String record) {
        this.record = record;
        this.id = ++idStart;
        this.createTime = new Date().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime() {
        this.createTime = getCreateTime() + ", Changed: " + new Date();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return id + ": " + record + "   |Created: " + createTime;
    }
}

package OOP_DZ.DZ5.notebook;

public interface Service {
    int startFrom();

    String getRecordFromList(int id);

    String getRecordInfo();

    void addRecord(Record record);

    boolean removeRecord(int id);

    boolean changeRecord(int id, String newRecord);

}

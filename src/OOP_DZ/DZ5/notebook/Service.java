package OOP_DZ.DZ5.notebook;

public interface Service {
    int getMaxId();

    String get(int id);

    String getInfo();

    void addRecord(Record record);

    boolean removeRecord(int id);

    boolean changeRecord(int id, String newRecord);

}

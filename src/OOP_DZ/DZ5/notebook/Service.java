package OOP_DZ.DZ5.notebook;

public interface Service {
    void setId();

    String get(int id);

    String getInfo();

    void addRecord(Record record);

    boolean removeRecord(int id);

    boolean changeRecord(int id, String newRecord);

}

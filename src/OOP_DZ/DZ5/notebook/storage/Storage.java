package OOP_DZ.DZ5.notebook.storage;

import OOP_DZ.DZ5.notebook.Service;

public interface Storage {
    Service read();
    void write(Service service);
}

package OOP_DZ.DZ5.notebook.storage;

import OOP_DZ.DZ5.notebook.Record;
import OOP_DZ.DZ5.notebook.RecordsList;
import OOP_DZ.DZ5.notebook.Service;

import java.io.*;

public class File implements Storage{
    private Service service;

    public File() {
        this.service = new RecordsList();
    }

    @Override
    public Service read() {
        try {
            String pathProject = System.getProperty("user.dir");
            String taskPath = "\\src\\OOP_DZ\\DZ5\\files\\";
            String pathFile = pathProject.concat(taskPath+"file2.txt");
            File file = new File();
            FileReader fr = new FileReader(pathFile);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            int count= 0;
            while (line != null) {
                service.addRecord(new Record(line,count));
                line = reader.readLine();
                count++;
            }
            return service;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new RecordsList();
    }

    @Override
    public void write(Service service) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\src\\OOP_DZ\\DZ5\\files\\file2.txt");
            java.io.File file = new java.io.File(pathFile);
            FileWriter fileWriter = new FileWriter(file, false);
            StringBuilder sb = new StringBuilder();
            for (Record item : service.getRecords()) {
                sb.append(item.getRecord()).append("\n");
            }
            fileWriter.write(sb.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Not a plan(((");
        }
//        System.out.println(service.getRecords());
    }
}

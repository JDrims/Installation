import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Installation {
    static StringBuilder stringBuilder = new StringBuilder();
    static File rootFolder;

    public Installation(String dirRoomFolder) {
        rootFolder = new File(dirRoomFolder);
    }

    public void dirCreate(File file) {
        String temp = "";
        if (file.mkdir()) {
            temp = "Директория '" + "\\" + file.getPath() + "' создана";
        } else {
            if (file.exists()) {
                temp = "Директория '" + file.getPath() + "' уже существует";
            } else {
                temp = "Что то произошло не так при создании директории '" + "\\" + file.getPath() + "'";
            }
        }
        System.out.println(temp);
        stringBuilder.append(temp + "\n");
    }

    public void fileCreate(File file) {
        String temp = "";
        try {
            if (file.createNewFile()) {
                temp = "Файл '" + file.getName() + "' создана в директории '" + file.getParent() + "'";
            } else {
                if (file.exists()) {
                    temp = "Файл '" + file.getName() + "' уже существует";
                } else {
                    temp = "Что то произошло не так при создании директории '" +  "\\" + file.getName() + "'";
                }
            }
        } catch (IOException e) {
            temp = e.getMessage();
        }
        System.out.println(temp);
        stringBuilder.append(temp + "\n");
    }

    public void logWrite(File file) {
        try {
            FileWriter fileWriterTemp = new FileWriter(file);
            fileWriterTemp.write(stringBuilder.toString());
            fileWriterTemp.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getPathRoomFolder() {
        return rootFolder.getPath() + "\\";
    }
}

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Installation installation = new Installation("D:\\Games");
        File dirSrc = new File(installation.getPathRoomFolder() + "src");
        File dirRes = new File(installation.getPathRoomFolder() + "res");
        File dirSaveGames = new File(installation.getPathRoomFolder() + "savegames");
        File dirTemp = new File(installation.getPathRoomFolder() + "temp");
        File dirMain = new File(installation.getPathRoomFolder() + "src\\main");
        File dirTest = new File(installation.getPathRoomFolder() + "src\\test");
        File fileMain = new File(installation.getPathRoomFolder() + "src\\main\\Main.java");
        File fileUtils = new File(installation.getPathRoomFolder() + "src\\main\\Utils.java");
        File dirDrawables = new File(installation.getPathRoomFolder() + "res\\drawables");
        File dirVectors = new File(installation.getPathRoomFolder() + "res\\vectors");
        File dirIcons = new File(installation.getPathRoomFolder() + "res\\icons");
        File fileTemp = new File(installation.getPathRoomFolder() + "temp\\temp.txt");
        installation.dirCreate(dirSrc);
        installation.dirCreate(dirRes);
        installation.dirCreate(dirSaveGames);
        installation.dirCreate(dirTemp);
        installation.dirCreate(dirMain);
        installation.dirCreate(dirTest);
        installation.fileCreate(fileMain);
        installation.fileCreate(fileUtils);
        installation.dirCreate(dirDrawables);
        installation.dirCreate(dirVectors);
        installation.dirCreate(dirIcons);
        installation.fileCreate(fileTemp);
        installation.logWrite(fileTemp);
    }
}
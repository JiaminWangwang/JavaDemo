import java.io.File;

public class DeleteFileDemo {
    public static void main(String args[]) {
        File folder = new File("./hahaha");
        deleteFolder(folder);
    }

    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            System.out.println("file != null");
            for (File f: files) {
                System.out.println("file= " + f.toPath());
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        } else {
            System.out.println("file == null");
            folder.delete();
        }
    }
}

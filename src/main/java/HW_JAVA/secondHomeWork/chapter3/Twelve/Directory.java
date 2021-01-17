package HW_JAVA.secondHomeWork.chapter3.Twelve;

import java.io.File;
import java.io.FileFilter;

public class Directory {

    public File[] getFiles(String pathDir,String extension){
        File file=new File(pathDir);

        FileFilter fileFilter=(File pathName)->{
            if(!pathName.isFile())
                return false;
            if(pathName.getAbsolutePath().endsWith(extension)){
                return true;
            }
            return false;
        };

        return file.listFiles(fileFilter);
    }

    public static void main(String[] args) {
        Directory directory=new Directory();
        String test="C:\\Users\\huawei\\Desktop\\TestNC";
        String ext=".txt";
        File[] f=directory.getFiles(test,ext);
        for (File file:f
             ) {
            System.out.println(file.getName());
        }
    }
}

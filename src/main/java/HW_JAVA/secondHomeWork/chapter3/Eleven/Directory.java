package HW_JAVA.secondHomeWork.chapter3.Eleven;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Directory {

    public String getDirectory(String pathName) {
        File file=new File(pathName);

        /*
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return  pathname.isDirectory();
            }
        };
         */
        //          OR
        FileFilter fileFilter=(File pathname)->{
            return pathname.isDirectory();
        };

       File[] files = file.listFiles(fileFilter);
       String result="";
        for (File f :files
                ) {
            result+=f.getName()+"\n";
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Directory directory=new Directory();
        String temp="C:\\Users\\huawei\\IdeaProjects";
        System.out.println(directory.getDirectory(temp));
    }
}

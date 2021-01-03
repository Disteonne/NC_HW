package HW_ONE.secondHomeWork.chapter3.Thirteen;

import HW_ONE.secondHomeWork.chapter3.Twelve.Directory;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;



public class UseComparatorWithFile {

    public File[] sortFiles(File[] files){
        Comparator<File> comparator=new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(files,comparator);
        return files;
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

        UseComparatorWithFile useComparatorWithFile=new UseComparatorWithFile();
        File[] newFiles= useComparatorWithFile.sortFiles(f);
        for (File file: newFiles
             ) {
            System.out.println(file.getName());
        }
    }
}

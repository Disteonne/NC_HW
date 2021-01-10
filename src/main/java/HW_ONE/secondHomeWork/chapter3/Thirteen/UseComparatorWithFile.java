package HW_ONE.secondHomeWork.chapter3.Thirteen;

import HW_ONE.secondHomeWork.chapter3.Twelve.Directory;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class UseComparatorWithFile {

    public File[] sortFiles(File[] files) {

        List<File> newDir = new ArrayList<>();
        List<File> newFiles = new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                newDir.add(file);
            } else {
                newFiles.add(file);
            }
        }

        Comparator<File> comparator = Comparator.comparingInt((File file) -> file.getName().length());

        newFiles.sort(comparator);
        newDir.sort(comparator);


        ArrayList<File> resultFiles = new ArrayList<>(newFiles);
        resultFiles.addAll(newDir);
        return (File[]) resultFiles.toArray();
    }

}

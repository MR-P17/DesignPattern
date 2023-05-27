package CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String dirName;
    List<FileSystem> list;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.list = new ArrayList<>();
    }

    @Override
    public void add(FileSystem fileSystem) throws  Exception{
        list.add(fileSystem);
    }


    @Override
    public void ls() {
        System.out.println("Directory Name: "+ dirName);
        for(FileSystem fs: list){
            fs.ls();
        }
    }

}

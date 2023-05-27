package CompositeDesignPattern.FileSystem;

public class File implements FileSystem{
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File Name: "+ fileName);
    }

    @Override
    public void add(FileSystem fileSystem) throws Exception {
        throw new Exception("Invalid operation.");
    }

    public String getFileName() {
        return fileName;
    }
}

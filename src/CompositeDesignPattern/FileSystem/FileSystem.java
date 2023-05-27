package CompositeDesignPattern.FileSystem;

public interface FileSystem {
    public void ls();
    public void add(FileSystem fileSystem) throws  Exception;
}

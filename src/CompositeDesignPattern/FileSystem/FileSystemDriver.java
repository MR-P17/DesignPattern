package CompositeDesignPattern.FileSystem;

public class FileSystemDriver {
    public static void main(String[] args) {
        FileSystem movieDir = new Directory("Movie");
        FileSystem avengers = new File("Avengers");

        try{
            movieDir.add(avengers);
            FileSystem mysteryMovieDir = new Directory("Mystery");
            FileSystem seven = new File("Seven");
            FileSystem d16 = new File("D16");
            mysteryMovieDir.add(seven);
            mysteryMovieDir.add(d16);

            movieDir.add(mysteryMovieDir);

            movieDir.ls();
        }catch (Exception e){
            System.out.println("Exception in file system addition");
            System.out.println(e.getMessage());
        }

    }
}

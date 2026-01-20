import java.io.*;

public class AppLoader implements Loader{
    @Override
    public void export(Library library) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\My projects" +
                "\\Task_and_Goals_tracker\\App\\Task Tracker\\src\\serializedLibrary.txt"))){
            out.writeObject(library);
        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }
    }

    @Override
    public Library fetch() {
        Library library = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Lenovo\\My projects" +
                "\\Task_and_Goals_tracker\\App\\Task Tracker\\src\\serializedLibrary.txt"))){
           library = (Library) in.readObject();
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
        return library;
    }
}

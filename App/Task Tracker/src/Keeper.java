public abstract class Keeper {
    private Library library;

    Keeper(){

    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}

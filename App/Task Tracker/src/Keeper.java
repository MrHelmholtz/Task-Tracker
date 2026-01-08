public abstract class Keeper {
    private Library library;

    Keeper(Library library){
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}

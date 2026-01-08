public class AppManager extends Manager{
    private AppKeeper keeper;
    private AppBuilder builder;


    AppManager(){
        keeper = new AppKeeper();
        builder = new AppBuilder();
    }

    @Override
    public void addLibrary() {
        keeper.setLibrary(builder.buildLibrary());
    }

    @Override
    public void deleteLibrary() {
        if(Helper.yesOrNoMenu("\nAre you sure you want to delete "+keeper.getLibrary().getName()+" library?"))
        {
            keeper.setLibrary(null);
            System.out.println("\nLibrary has been successfully deleted");
        }
    }

    @Override
    public void adjustLibrary() {
        if(Helper.yesOrNoMenu("\nAre you sure you want to delete "+keeper.getLibrary().getName()+" library?"))
        {
            keeper.setLibrary(null);
            System.out.println("\nLibrary has been successfully deleted");
        }
    }




}

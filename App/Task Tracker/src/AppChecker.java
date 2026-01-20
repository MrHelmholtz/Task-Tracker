import java.util.ArrayList;

public class AppChecker {
    public Boolean isNull(Object object, String ... message){
        if(object == null){
            System.out.println(object+" is null. "+ message);
            return true;
        }
        return false;
    }

    public Boolean isEmpty(ArrayList<? extends AbstractData> data, String ... message){
        if(data.isEmpty()){
            System.out.println(data+" is empty. "+message);
            return true;
        }
        return false;
    }
}

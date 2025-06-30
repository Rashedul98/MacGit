enum status{
    Running,Started,Failed
}

public class enums {
    public static void main(String[] args) {
        status[] allStatus = status.values();

//        for(status s: allStatus){
//            System.out.println(s);
//        }
        for(int i =0; i< allStatus.length; i++){
            System.out.println(allStatus[i]);
        }
    }

}


public class BaseClass {
    
    private int MAGIC_VALUE = 10;

    public void show(){
        System.out.println("BaseClass::show() is being called here");
    }

    public void msg(String message) {
        System.out.println("BaseClass::msg(String) - Message: " + message);
    }


    public int getMagicValue() {
        return MAGIC_VALUE;
    }
    public void updateMagicValue(int value){
        MAGIC_VALUE = value;
    }
    
}

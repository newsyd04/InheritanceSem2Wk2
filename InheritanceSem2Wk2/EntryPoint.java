

public class EntryPoint {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        BaseClass base = new BaseClass();
        child.show();
        base.show();

        child.msg("A message being passed in from a ChildClass object");

        System.out.println("We can get values stored in the base class using a childclass reference");
        System.out.println("The Magic value that exists only in the BaseClass is " + child.getMagicValue());
        System.out.println("We can also update this value");
        child.updateMagicValue(15);
        System.out.println("The magic value stored in the BaseClass is now " + child.getMagicValue());
        
    }
}


package wrapperdemo;
public class WrapperDemo {
    public static void main(String[] args) {
        
        int i=5;
        Integer ii = new Integer(5);//wrapper class
        
        int j = ii.intValue();//unwrapping
        
        Integer value =i;
        
        int k = value;
        System.out.println(j);
        System.out.println(k); // result will be same for both j & k
    }
    
}

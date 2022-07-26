import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public void abc(Integer i){
        System.out.println("====Int======");
    }

    public void abc(String i){
        System.out.println("====String======");
    }

    public static boolean isRepeated(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))!=null){
                int oldVal = map.get(str.charAt(i));
                map.put(str.charAt(i), oldVal+1);

            }else{
                map.put(str.charAt(i), 1);
            }
        }

        boolean result = false;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " "+ entry.getValue());
                result= true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        boolean result = isRepeated("shushmeetha");
//        System.out.println(result);


        Test1 obj = new Test1();
//        obj.abc(null);

    }
}

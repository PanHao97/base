import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo2 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二", "血广阔", "li");


/*        Object[] arr1 = list.stream().toArray();
        System.out.println(Arrays.toString(arr1));*/

/*        String[] arr2 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/


        String[] arr2 = list.stream().toArray(value -> {
            return new String[value];
        });
        System.out.println(Arrays.toString(arr2));



    }

}

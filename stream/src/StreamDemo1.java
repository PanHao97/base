import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class StreamDemo1 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二", "血广阔", "li");

        //s表示流里面的每一个数据
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.stream().forEach(s -> System.out.println(s) );

    }

}

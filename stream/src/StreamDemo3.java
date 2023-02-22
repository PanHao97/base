import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {

/**
 * 流中数据保存到集合
 */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
                "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二-男-37", "血广阔-男-40",  "li-女-37");

        //收集到list集合
        List<String> collect = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(collect.toString());

        //收集到set集合
        Set<String> collect1 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(collect1.toString());

        //收集到map集合
        //谁作为键：名，谁作为值：年龄
        Map<String, Integer> map = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        new Function<String, String>() {
            /**
             * Applies this function to the given argument.
             *
             * @param s the function argument
             * @return the function result
             */
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        },
                        new Function<String, Integer>() {
            /**
             * Applies this function to the given argument.
             *
             * @param s the function argument
             * @return the function result
             */
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(map);

        Map<String, Integer> map2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));

        System.out.println(map2);
    }

}

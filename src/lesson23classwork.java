import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lesson23classwork {
    public static void main(String[] args) {
        List<User>users = new ArrayList<>();
        users.add(new User(1,"Misha",false));
        users.add(new User(2,"Petro",true));
        users.add(new User(3,"Max",false));
        users.add(new User(4,"Danilo",true));
        users.add(new User(5,"Ivan",true));
        users.add(new User(5,"Ivan",true));

        Stream<User> stream = users.stream();
        Stream<User> distinct = stream.distinct();
        Stream<User> userStream = distinct.filter(user -> user.isStatus());
        Stream<User> userStream1 = userStream.filter(user -> user.getId()<5);
        Stream<User> sorted = userStream1.sorted((o1, o2) -> o2.getId() - o1.getId());
        List<User> collect = sorted.collect(Collectors.toList());
        System.out.println(collect);

    }
    }
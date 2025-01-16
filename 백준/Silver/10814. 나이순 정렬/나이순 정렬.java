import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name, i);
        }

        Arrays.sort(members, (m1, m2) -> {
            if (m1.age == m2.age) {
                return Integer.compare(m1.order, m2.order);
            }
            return Integer.compare(m1.age, m2.age);
        });

        for (Member member : members) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }

        System.out.print(sb);
    }
}

class Member {
    int age;
    String name;
    int order;

    Member(int age, String name, int order) {
        this.age = age;
        this.name = name;
        this.order = order;
    }
}
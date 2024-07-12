package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> mesos = new ArrayList<>();

        mesos.add("gener");
        mesos.add("febrer");
        mesos.add("març");
        mesos.add("abril");
        mesos.add("maig");
        mesos.add("juny");
        mesos.add("juliol");
        mesos.add("agost");
        mesos.add("setembre");
        mesos.add("octubre");
        mesos.add("novembre");
        mesos.add("desembre");

        mesos.forEach(i -> System.out.println(i));
    }
}

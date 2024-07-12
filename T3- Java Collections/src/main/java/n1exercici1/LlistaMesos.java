package n1exercici1;

import n1exercici1.models.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LlistaMesos {

	public static void llistarMesos() {
	ArrayList <Month> mesos = new ArrayList<>();

	Month gener = new Month("gener");
	Month febrer = new Month("febrer");
	Month march = new Month("march");
	Month abril = new Month("abril");
	Month maig = new Month("maig");
	Month juny = new Month("juny");
	Month juliol = new Month("juliol");
	Month setembre = new Month("setembre");
	Month octubre = new Month("octubre");
	Month novembre = new Month("novembre");
	Month desembre = new Month("desembre");


		mesos.add(gener);
		mesos.add(febrer);
		mesos.add(march);
		mesos.add(abril);
		mesos.add(maig);
		mesos.add(juny);
		mesos.add(juliol);
		mesos.add(setembre);
		mesos.add(octubre);
		mesos.add(novembre);
		mesos.add(desembre);

	imprimirMesos(mesos);
	afegirAgost(mesos);
        System.out.println();
	imprimirMesos(mesos);
        System.out.println();
	HashSet<String> set = hashSet();
	bucleFor(set);
        System.out.println();
	iterator(mesos);
}

public static HashSet<String> hashSet() {
	HashSet<String> set = new HashSet<>();
	set.add("gener");
	set.add("febrer");
	set.add("march");
	set.add("abril");
	set.add("maig");
	set.add("juny");
	set.add("juliol");
	set.add("setembre");
	set.add("octubre");
	set.add("novembre");
	set.add("desembre");

	set.add("juliol");

	return set;
}

public static void bucleFor(HashSet<String> set) {

	for (String mes : set) {
		System.out.println(mes);
	}

}
public static void iterator(ArrayList <Month> mesos) {

	Iterator<Month> it = mesos.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
}

public static void imprimirMesos(ArrayList <Month> mesos) {
	for (int a = 0; a < mesos.size(); a++) {
		System.out.println(mesos.get(a));
	}
}

public static void afegirAgost(ArrayList <Month> mesos) {
	Month agost = new Month("agost");
	mesos.add(7, agost);
}

}

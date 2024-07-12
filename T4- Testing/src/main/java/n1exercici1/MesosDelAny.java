package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class MesosDelAny {
	private final List<String> mesos;

	public MesosDelAny() {
		mesos = new ArrayList<>();
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
	}

	public List<String> rebreMesos() {
		return mesos;
	}



}
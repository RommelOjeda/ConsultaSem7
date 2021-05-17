package threadmodel;

class LightTask implements Runnable {

	private Integer id;

	public LightTask(Integer id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println(String.format("La luz se enciende durante %s", id));
	}

}
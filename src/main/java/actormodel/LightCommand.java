package actormodel;

class LightCommand implements Command {

	private Integer id;

	public LightCommand(Integer id) {
		this.id = id;
	}

	@Override
	public void execute() {
		System.out.println(String.format("La luz se enciende durante %s", id));
	}

}

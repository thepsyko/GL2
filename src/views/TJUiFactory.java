package views;

/**
 * Create views for Tom&Jerry game
 * @author Jocelyn Duc
 */
public class TJUiFactory extends AbstractUiFactory {

	/**
	 * Return a new Tom&Jerry GUI
	 * @return tjGui
	 */
	@Override
	public AbstractGui createGui() {
		return new TJGui();
	}

	/**
	 * Return a new Tom&Jerry CLI
	 * @return tjCli
	 */
	@Override
	public AbstractCli createCli() {
		return new TJCli();
	}
}

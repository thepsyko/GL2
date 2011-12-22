package views;

/**
 * Create views for HellLife game
 * @author Jocelyn Duc
 */
public class HLUiFactory extends AbstractUiFactory{
	
	/**
	 * Return a new HellLife GUI
	 * @return hlGui
	 */
	@Override
	public AbstractGui createGui() {
		return new HLGui();
	}
	
	/**
	 * Return a new HellLife CLI
	 * @return hlCli
	 */
	@Override
	public AbstractCli createCli() {
		return new HLCli();
	}
}
package views;

public abstract class AbstractUiFactory {

	abstract AbstractGui createGui();
	abstract AbstractCli createCli();
	
}
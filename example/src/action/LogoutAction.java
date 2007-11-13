package action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.RedirectResolution;
import net.sourceforge.stripes.action.Resolution;

public class LogoutAction extends BaseAction {

	@DefaultHandler
	public Resolution logout() {
		context.setLogin(null);
		return new RedirectResolution(HubAction.class);
	}
}

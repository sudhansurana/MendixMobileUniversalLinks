package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(deeplink.actions.ExecuteDeeplink.class);
    registrator.registerUserAction(deeplink.actions.GetApplicationUrl.class);
    registrator.registerUserAction(deeplink.actions.GetCurrentSessionID.class);
    registrator.registerUserAction(deeplink.actions.ReadMicroflows.class);
    registrator.registerUserAction(deeplink.actions.StartDeeplinkJava.class);
    registrator.registerUserAction(googlemaps.actions.CalculateGeo.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}

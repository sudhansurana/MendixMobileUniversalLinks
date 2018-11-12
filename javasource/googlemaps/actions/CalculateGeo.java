// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package googlemaps.actions;

import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.UserAction;
import googlemaps.actions.GeoCoder.Location;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.security.AccessControlException;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class CalculateGeo extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __locationObj;
	private googlemaps.proxies.Location locationObj;
	private java.lang.String addressString;

	public CalculateGeo(IContext context, IMendixObject locationObj, java.lang.String addressString)
	{
		super(context);
		this.__locationObj = locationObj;
		this.addressString = addressString;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.locationObj = __locationObj == null ? null : googlemaps.proxies.Location.initialize(getContext(), __locationObj);

		// BEGIN USER CODE
		Location loc;
		
		loc = GeoCoder.getLocation(addressString);

		if(loc != null) {
			locationObj.setLatitude(new BigDecimal(loc.lat, MathContext.DECIMAL64));
			locationObj.setLongitude(new BigDecimal(loc.lon, MathContext.DECIMAL64));
			return true;
		}
		else {
			return false;
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CalculateGeo";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

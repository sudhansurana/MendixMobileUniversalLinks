// This file was generated by Mendix Modeler 7.18.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlemaps.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the GoogleMaps module
	public static boolean bCo_Location(IContext context, googlemaps.proxies.Location _location)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Location", _location == null ? null : _location.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GoogleMaps.BCo_Location", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void location_Commit(IContext context, googlemaps.proxies.Location _location)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Location", _location == null ? null : _location.getMendixObject());
			Core.execute(context, "GoogleMaps.Location_Commit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_LocationAddress(IContext context, googlemaps.proxies.Location _location)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Location", _location == null ? null : _location.getMendixObject());
			Core.execute(context, "GoogleMaps.OCh_LocationAddress", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean setCoordinatesByAddress(IContext context, googlemaps.proxies.Location _location)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Location", _location == null ? null : _location.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "GoogleMaps.SetCoordinatesByAddress", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
// This file was generated by Mendix Modeler 7.18.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package deeplink.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the DeepLink module
	public static void aCT_AttributeSelect(IContext context, deeplink.proxies.Attribute _attribute, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Attribute", _attribute == null ? null : _attribute.getMendixObject());
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.ACT_AttributeSelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_EntitySelect(IContext context, deeplink.proxies.Entity _entity, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Entity", _entity == null ? null : _entity.getMendixObject());
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.ACT_EntitySelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MicroflowSelect(IContext context, deeplink.proxies.Microflow _microflow, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Microflow", _microflow == null ? null : _microflow.getMendixObject());
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.ACT_MicroflowSelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ReloadMetaData(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.ACT_ReloadMetaData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ShowEntitySelect(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.ACT_ShowEntitySelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ShowMicroflowSelect(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.ACT_ShowMicroflowSelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bCo_Deeplink_SetAttributes(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "DeepLink.BCo_Deeplink_SetAttributes", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void clearOldPendingLinks(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DeepLink.ClearOldPendingLinks", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void createDeeplinkConfig(IContext context, java.lang.String _name, java.lang.String _microflow, java.lang.String _objectType, java.lang.String _objectAttr, boolean _allowGuests, boolean _useStringArg, boolean _useAsHome, java.lang.String _indexPage, boolean _includeGetParams, boolean _separateGetParams, boolean _objectAsParameter)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Name", _name);
			params.put("Microflow", _microflow);
			params.put("ObjectType", _objectType);
			params.put("ObjectAttr", _objectAttr);
			params.put("AllowGuests", _allowGuests);
			params.put("UseStringArg", _useStringArg);
			params.put("UseAsHome", _useAsHome);
			params.put("IndexPage", _indexPage);
			params.put("IncludeGetParams", _includeGetParams);
			params.put("SeparateGetParams", _separateGetParams);
			params.put("ObjectAsParameter", _objectAsParameter);
			Core.execute(context, "DeepLink.CreateDeeplinkConfig", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean deepLinkHome(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "DeepLink.DeepLinkHome", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<deeplink.proxies.Attribute> dS_Attribute(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "DeepLink.DS_Attribute", params);
			java.util.List<deeplink.proxies.Attribute> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<deeplink.proxies.Attribute>();
				for (IMendixObject obj : objs)
					result.add(deeplink.proxies.Attribute.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void home_Anon_Default(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DeepLink.Home_Anon_Default", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void home_Desktop_Default(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DeepLink.Home_Desktop_Default", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_Name(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.OCh_Name", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void showDeeplinkConfigurationOverview(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DeepLink.ShowDeeplinkConfigurationOverview", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean startDeeplink(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "DeepLink.StartDeeplink", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_EnsureSuperEricAdmin(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DeepLink.SUB_EnsureSuperEricAdmin", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String sUB_GetApplicationURL(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.String)Core.execute(context, "DeepLink.SUB_GetApplicationURL", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static system.proxies.User sUB_GetCreateSuperEric(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "DeepLink.SUB_GetCreateSuperEric", params);
			return result == null ? null : system.proxies.User.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_ReloadMetaData(IContext context, deeplink.proxies.DeepLink _deepLink)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("DeepLink", _deepLink == null ? null : _deepLink.getMendixObject());
			Core.execute(context, "DeepLink.SUB_ReloadMetaData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
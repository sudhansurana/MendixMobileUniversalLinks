// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package deeplink.proxies;

public class Microflow
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject microflowMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DeepLink.Microflow";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		UseStringArg("UseStringArg"),
		UseObjectArgument("UseObjectArgument"),
		ArgumentExample("ArgumentExample"),
		Module("Module"),
		param("DeepLink.param");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Microflow(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DeepLink.Microflow"));
	}

	protected Microflow(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject microflowMendixObject)
	{
		if (microflowMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DeepLink.Microflow", microflowMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DeepLink.Microflow");

		this.microflowMendixObject = microflowMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Microflow.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static deeplink.proxies.Microflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return deeplink.proxies.Microflow.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static deeplink.proxies.Microflow initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new deeplink.proxies.Microflow(context, mendixObject);
	}

	public static deeplink.proxies.Microflow load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return deeplink.proxies.Microflow.initialize(context, mendixObject);
	}

	public static java.util.List<deeplink.proxies.Microflow> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<deeplink.proxies.Microflow> result = new java.util.ArrayList<deeplink.proxies.Microflow>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DeepLink.Microflow" + xpathConstraint))
			result.add(deeplink.proxies.Microflow.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of UseStringArg
	 */
	public final java.lang.Boolean getUseStringArg()
	{
		return getUseStringArg(getContext());
	}

	/**
	 * @param context
	 * @return value of UseStringArg
	 */
	public final java.lang.Boolean getUseStringArg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseStringArg.toString());
	}

	/**
	 * Set value of UseStringArg
	 * @param usestringarg
	 */
	public final void setUseStringArg(java.lang.Boolean usestringarg)
	{
		setUseStringArg(getContext(), usestringarg);
	}

	/**
	 * Set value of UseStringArg
	 * @param context
	 * @param usestringarg
	 */
	public final void setUseStringArg(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean usestringarg)
	{
		getMendixObject().setValue(context, MemberNames.UseStringArg.toString(), usestringarg);
	}

	/**
	 * @return value of UseObjectArgument
	 */
	public final java.lang.Boolean getUseObjectArgument()
	{
		return getUseObjectArgument(getContext());
	}

	/**
	 * @param context
	 * @return value of UseObjectArgument
	 */
	public final java.lang.Boolean getUseObjectArgument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.UseObjectArgument.toString());
	}

	/**
	 * Set value of UseObjectArgument
	 * @param useobjectargument
	 */
	public final void setUseObjectArgument(java.lang.Boolean useobjectargument)
	{
		setUseObjectArgument(getContext(), useobjectargument);
	}

	/**
	 * Set value of UseObjectArgument
	 * @param context
	 * @param useobjectargument
	 */
	public final void setUseObjectArgument(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean useobjectargument)
	{
		getMendixObject().setValue(context, MemberNames.UseObjectArgument.toString(), useobjectargument);
	}

	/**
	 * @return value of ArgumentExample
	 */
	public final java.lang.String getArgumentExample()
	{
		return getArgumentExample(getContext());
	}

	/**
	 * @param context
	 * @return value of ArgumentExample
	 */
	public final java.lang.String getArgumentExample(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ArgumentExample.toString());
	}

	/**
	 * Set value of ArgumentExample
	 * @param argumentexample
	 */
	public final void setArgumentExample(java.lang.String argumentexample)
	{
		setArgumentExample(getContext(), argumentexample);
	}

	/**
	 * Set value of ArgumentExample
	 * @param context
	 * @param argumentexample
	 */
	public final void setArgumentExample(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String argumentexample)
	{
		getMendixObject().setValue(context, MemberNames.ArgumentExample.toString(), argumentexample);
	}

	/**
	 * @return value of Module
	 */
	public final java.lang.String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final java.lang.String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(java.lang.String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of param
	 */
	public final deeplink.proxies.Entity getparam() throws com.mendix.core.CoreException
	{
		return getparam(getContext());
	}

	/**
	 * @param context
	 * @return value of param
	 */
	public final deeplink.proxies.Entity getparam(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		deeplink.proxies.Entity result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.param.toString());
		if (identifier != null)
			result = deeplink.proxies.Entity.load(context, identifier);
		return result;
	}

	/**
	 * Set value of param
	 * @param param
	 */
	public final void setparam(deeplink.proxies.Entity param)
	{
		setparam(getContext(), param);
	}

	/**
	 * Set value of param
	 * @param context
	 * @param param
	 */
	public final void setparam(com.mendix.systemwideinterfaces.core.IContext context, deeplink.proxies.Entity param)
	{
		if (param == null)
			getMendixObject().setValue(context, MemberNames.param.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.param.toString(), param.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return microflowMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final deeplink.proxies.Microflow that = (deeplink.proxies.Microflow) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DeepLink.Microflow";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

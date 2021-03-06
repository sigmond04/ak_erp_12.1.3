package oracle.apps.ap.invoice.request.negotiation.webui;

import java.io.Serializable;
import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.OAApplicationModule;
import oracle.apps.fnd.framework.webui.OAControllerImpl;
import oracle.apps.fnd.framework.webui.OAPageContext;
import oracle.apps.fnd.framework.webui.beans.OAWebBean;

public class NotifPGCO
  extends OAControllerImpl
{
  public static final String RCS_ID = "$Header: NotifPGCO.java 120.0 2006/04/14 21:01:35 rlandows noship $";
  public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion("$Header: NotifPGCO.java 120.0 2006/04/14 21:01:35 rlandows noship $", "oracle.apps.ap.invoice.request.negotiation.webui");
  
  public void processRequest(OAPageContext paramOAPageContext, OAWebBean paramOAWebBean)
  {
    super.processRequest(paramOAPageContext, paramOAWebBean);
    
    OAApplicationModule localOAApplicationModule = paramOAPageContext.getApplicationModule(paramOAWebBean);
    
    String str1 = paramOAPageContext.getParameter("HOLDID");
    String str2 = paramOAPageContext.getParameter("INVOICEID");
    String str3 = paramOAPageContext.getParameter("ITEMTYPE");
    String str4 = paramOAPageContext.getParameter("ITEMKEY");
    
    Serializable[] arrayOfSerializable1 = { str2 };
    localOAApplicationModule.invokeMethod("initNotifPGAcctSumVO", arrayOfSerializable1);
    
    Serializable[] arrayOfSerializable2 = { str1, str2, str3, str4 };
    localOAApplicationModule.invokeMethod("initNotifPGLineDetailsVO", arrayOfSerializable2);
  }
  
  public void processFormRequest(OAPageContext paramOAPageContext, OAWebBean paramOAWebBean)
  {
    super.processFormRequest(paramOAPageContext, paramOAWebBean);
  }
}

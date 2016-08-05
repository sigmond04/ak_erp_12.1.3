package oracle.apps.ap.invoice.request.negotiation.server;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;

public class NotificationPageAMImpl
  extends OAApplicationModuleImpl {
    /**This is the default constructor (do not remove)
     */
    public NotificationPageAMImpl() {
    }
    public static final String RCS_ID = "$Header: NotificationPageAMImpl.java 120.0 2006/04/14 21:01:58 rlandows noship $";
  public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion("$Header: NotificationPageAMImpl.java 120.0 2006/04/14 21:01:58 rlandows noship $", "oracle.apps.ap.invoice.request.negotiation.server");
  
  public static void main(String[] paramArrayOfString)
  {
    launchTester("oracle.apps.ap.invoice.request.negotiation.server", "NotificationPageAMLocal");
  }
  
  public void initNotifPGAcctSumVO(String paramString)
  {
    getNotifPGAcctSumVO().executeQuery(paramString);
  }
  
  public void initNotifPGLineDetailsVO(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    getNotifPGLineDetailsVO().executeQuery(paramString1, paramString2, paramString3, paramString4);
  }
  
  public NotifPGLineDetailsVOImpl getNotifPGLineDetailsVO()
  {
    return (NotifPGLineDetailsVOImpl)findViewObject("NotifPGLineDetailsVO");
  }
  
  public NotifPGAcctSumVOImpl getNotifPGAcctSumVO()
  {
    return (NotifPGAcctSumVOImpl)findViewObject("NotifPGAcctSumVO");
  }
}

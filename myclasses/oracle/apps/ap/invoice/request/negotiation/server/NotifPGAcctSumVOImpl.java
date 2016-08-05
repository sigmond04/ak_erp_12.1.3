package oracle.apps.ap.invoice.request.negotiation.server;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;

public class NotifPGAcctSumVOImpl
  extends OAViewObjectImpl
{
  public static final String RCS_ID = "$Header: NotifPGAcctSumVOImpl.java 120.0 2006/04/14 21:02:14 rlandows noship $";
  public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion("$Header: NotifPGAcctSumVOImpl.java 120.0 2006/04/14 21:02:14 rlandows noship $", "oracle.apps.ap.invoice.request.negotiation.server");
  
  public void executeQuery(String paramString)
  {
    setWhereClause(null);
    setWhereClauseParam(0, paramString);
    executeQuery();
  }
}

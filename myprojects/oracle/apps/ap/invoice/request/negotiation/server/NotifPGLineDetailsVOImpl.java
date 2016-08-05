package oracle.apps.ap.invoice.request.negotiation.server;

import oracle.apps.fnd.common.VersionInfo;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;

public class NotifPGLineDetailsVOImpl
  extends OAViewObjectImpl
{
  public static final String RCS_ID = "$Header: NotifPGLineDetailsVOImpl.java 120.0 2006/04/14 21:02:30 rlandows noship $";
  public static final boolean RCS_ID_RECORDED = VersionInfo.recordClassVersion("$Header: NotifPGLineDetailsVOImpl.java 120.0 2006/04/14 21:02:30 rlandows noship $", "oracle.apps.ap.invoice.request.negotiation.server");
  
  public void executeQuery(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    setWhereClause(null);
    if (paramString1 != null)
    {
      setWhereClauseParam(0, paramString1);
      setWhereClauseParam(1, "1");
      setWhereClauseParam(2, "-1");
      setWhereClauseParam(3, null);
      setWhereClauseParam(4, null);
      setWhereClauseParam(5, "-1");
      setWhereClauseParam(6, "-1");
      setWhereClauseParam(7, "-1");
      
      executeQuery();
    }
    else if (paramString4 != null)
    {
      setWhereClauseParam(0, "-1");
      setWhereClauseParam(1, "-1");
      setWhereClauseParam(2, paramString2);
      setWhereClauseParam(3, paramString3);
      setWhereClauseParam(4, paramString4);
      setWhereClauseParam(5, "1");
      setWhereClauseParam(6, "-1");
      setWhereClauseParam(7, "-1");
      
      executeQuery();
    }
    else
    {
      setWhereClauseParam(0, "-1");
      setWhereClauseParam(1, "-1");
      setWhereClauseParam(2, "-1");
      setWhereClauseParam(3, null);
      setWhereClauseParam(4, null);
      setWhereClauseParam(5, "-11");
      setWhereClauseParam(6, paramString2);
      setWhereClauseParam(7, "1");
      
      executeQuery();
    }
  }
}

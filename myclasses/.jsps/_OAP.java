
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.apps.fnd.framework.webui.OAJSPHelper;


public class _OAP extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations

 public static final String RCS_ID = "$Header: OAP.jsp 120.22 2005/09/13 09:47:03 atgops1 noship $"; 
  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, "OAErrorPage.jsp", true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _OAP page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      oracle.apps.fnd.framework.webui.OAPageBean pageBean;
      synchronized (request) {
        if ((pageBean = (oracle.apps.fnd.framework.webui.OAPageBean) pageContext.getAttribute( "pageBean", PageContext.REQUEST_SCOPE)) == null) {
          pageBean = (oracle.apps.fnd.framework.webui.OAPageBean) new oracle.apps.fnd.framework.webui.OAPageBean();
          pageContext.setAttribute( "pageBean", pageBean, PageContext.REQUEST_SCOPE);
          out.write(__oracle_jsp_text[2]);
        }
      }
      out.write(__oracle_jsp_text[3]);
      
        // Bug 3184117: Non-ASCII parameters are turned into garbage even if it
        // encoded correctly.
        OAJSPHelper.setRequestCharacterEncoding(pageContext);
      
        //Bug5857608 - Synchronize threads within one session.  
        Object sessionLock = null;
        synchronized (session)
        {
          sessionLock = pageBean.getSessionLock(session);
        }
      
        synchronized (sessionLock)
        {
         String redirectURL = null;
         try
         {
          redirectURL = pageBean.preparePage(pageContext, true);
      
          if (redirectURL != null)
          {
      
      out.write(__oracle_jsp_text[4]);
      if (true) {
        String __url=OracleJspRuntime.toStr(redirectURL);
        // Forward 
        pageContext.forward( __url);
        return;
      }

      out.write(__oracle_jsp_text[5]);
      
          }
          pageBean.renderDocument();
        }
        catch (Exception e)
        {
          pageBean.registerSevereException(e);
        }
        catch (Error err)
        {
          // Catastrophic error - print stack trace to logs to assist debugging
          err.printStackTrace();
          throw err;
        }
        finally
        {
          // Fix for bug 5584243 - Swallow the NPE.
          try
          {
            pageBean.finalizeRequest(request, redirectURL);
          }
          catch( Exception e ){}
        }
       } // end - synchronized (sessionLock)
      
      out.write(__oracle_jsp_text[6]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[7][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n      ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}

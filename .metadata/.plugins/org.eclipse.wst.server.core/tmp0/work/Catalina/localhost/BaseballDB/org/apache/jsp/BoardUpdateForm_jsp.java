/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-10-24 04:12:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Boardmodel.BoardBean;
import Boardmodel.BoardDAO;

public final class BoardUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Boardmodel.BoardDAO");
    _jspx_imports_classes.add("Boardmodel.BoardBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<title>MLB-Statcast Database</title>\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"xeicon/xeicon.min.css\">\n");
      out.write("	<link rel=\"stylesheet\" href=\"css_part/board.css\">\n");
      out.write("	<link rel=\"stylesheet\" href=\"css_part/swiper.min.css\">\n");
      out.write("	<link rel=\"stylesheet\" href=\"css_part/default.css\">\n");
      out.write("	<script src=\"script_part/jquery.js\" charset=\"utf-8\"></script>\n");
      out.write("	<script src=\"script_part/swiper.js\" charset=\"utf-8\"></script>\n");
      out.write("	<script src=\"script_part/default.js\" charset=\"utf-8\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("	");

	
		int num = Integer.parseInt(request.getParameter("num").trim());
	
		BoardDAO bdao = new BoardDAO();
		
		BoardBean bean = bdao.getOneUpdateBoard(num);
	
	
      out.write("\n");
      out.write("\n");
      out.write("	 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Top.jsp", out, false);
      out.write("	\n");
      out.write("	  <section class=\"block board_wrap\">\n");
      out.write("	  <form action=\"BoardUpdateProc.jsp\" method=\"post\">\n");
      out.write("            <div class=\"joincontents\">\n");
      out.write("                <h2 class=\"subject2\">게시판</h2>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("			<div class=\"board_title\">\n");
      out.write("				<strong>공지사항</strong>\n");
      out.write("				<p>공지사항을 빠르고 정확하게 안내해 드립니다.</p>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"board_write_wrap\">\n");
      out.write("				<div class=\"board_write\">\n");
      out.write("					<div class=\"titler\">\n");
      out.write("						<dl>\n");
      out.write("							<dt>제목</dt>\n");
      out.write("							<dd><input type=\"text\" placeholder=\"제목입력\" name=\"subject\" value=\"");
      out.print( bean.getSubject() );
      out.write("\"></dd>\n");
      out.write("						</dl>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"infom\">\n");
      out.write("						<dl>\n");
      out.write("							<dt>글쓴이</dt>\n");
      out.write("							<dd><input type=\"text\" placeholder=\"글쓴이입력\" name=\"writer\" value=\"");
      out.print( bean.getWriter() );
      out.write("\"> </dd>\n");
      out.write("						</dl>\n");
      out.write("						<dl>\n");
      out.write("							<dt>비밀번호</dt>\n");
      out.write("							<dd><input type=\"password\" placeholder=\"비밀번호 입력\" name=\"password\" value=\"");
      out.print( bean.getPassword() );
      out.write("\"></dd>\n");
      out.write("						</dl>\n");
      out.write("						<dl>\n");
      out.write("							<dt>이메일</dt>\n");
      out.write("							<dd><input type=\"email\" placeholder=\"이메일 입력\" name=\"email\" value=\"");
      out.print( bean.getEmail() );
      out.write("\"></dd>\n");
      out.write("						</dl>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"contenter\">\n");
      out.write("						<textarea placeholder=\"내용입력\" name=\"content\">");
      out.print( bean.getContent() );
      out.write("</textarea>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("\n");
      out.write("				<div class=\"bt_wrap\">\n");
      out.write("					<input type=\"hidden\" name=\"num\" value=\"");
      out.print( bean.getNum() );
      out.write("\">\n");
      out.write("					<input type=\"submit\" value=\"글수정\" class=\"on\">&nbsp;&nbsp;\n");
      out.write("					<input type=\"button\" onclick=\"location.href='BoardList.jsp'\" class=\"on\" value=\"전체글보기\">\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("			</form>\n");
      out.write("        </section>\n");
      out.write("		\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

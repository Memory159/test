/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-08-12 00:16:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class information_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/information.css\">\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/axios/0.18.0/axios.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        window.onload = () => {\r\n");
      out.write("            let reserve = document.querySelector(\".big-box\");\r\n");
      out.write("            let nan = document.getElementById(\"nan\");\r\n");
      out.write("            let nv = document.getElementById(\"nv\");\r\n");
      out.write("            axios({\r\n");
      out.write("                method: 'get',\r\n");
      out.write("                url: \"http://localhost:8080/login/information?id=\" +");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("            }).then(function (resp) {\r\n");
      out.write("                let information = resp.data;\r\n");
      out.write("                if (information.gender == nan.value) {\r\n");
      out.write("                    nan.checked = \"checked\";\r\n");
      out.write("                } else if (information.gender == nv.value) {\r\n");
      out.write("                    nv.checked = \"checked\";\r\n");
      out.write("                }\r\n");
      out.write("                console.log(information);\r\n");
      out.write("                reserve.children[1].innerHTML = `用&nbsp;&nbsp;户&nbsp;&nbsp;名 : <input type=\"text\" value=\"` + information.username + `\"> `;\r\n");
      out.write("                reserve.children[2].innerHTML = `密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码 : <input type=\"text\" value=\"` + information.password + `\">`;\r\n");
      out.write("                reserve.children[3].innerHTML = `电&nbsp;&nbsp;话&nbsp;&nbsp;号 : <input type=\"text\" value=\"` + information.telephone + `\">`;\r\n");
      out.write("                reserve.children[4].innerHTML = `身份证号 : <input type=\"text\" value=\"` + information.identity + `\">`;\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            let btn1 = document.getElementById(\"btn1\");\r\n");
      out.write("            let btn2 = document.getElementById(\"btn2\");\r\n");
      out.write("            btn1.onclick = function () {\r\n");
      out.write("                let username = reserve.children[1].children[0].value;\r\n");
      out.write("                let password = reserve.children[2].children[0].value;\r\n");
      out.write("                let telephone = reserve.children[3].children[0].value;\r\n");
      out.write("                let identity = reserve.children[4].children[0].value;\r\n");
      out.write("                let gender = nan.checked ? reserve.children[5].children[0].value : reserve.children[5].children[2].value;\r\n");
      out.write("                console.log(gender);\r\n");
      out.write("                alert(\"修改成功\");\r\n");
      out.write("                window.location.href = \"http://localhost:8080/login/revise?username=\" + username + \"&password=\" + password + \"&telephone=\" + telephone + \"&identity=\" + identity + \"&gender=\" + gender + \"&id=\" +");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            btn2.onclick = function () {\r\n");
      out.write("                window.location.href = \"http://localhost:8080/room/roomOperate\"\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"big-box\">\r\n");
      out.write("    <h1>修改信息</h1>\r\n");
      out.write("    <p>用&nbsp;&nbsp;户&nbsp;&nbsp;名 : <input type=\"text\"></p>\r\n");
      out.write("    <p>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码 : <input type=\"password\"></p>\r\n");
      out.write("    <p>电&nbsp;&nbsp;话&nbsp;&nbsp;号 : <input type=\"text\"></p>\r\n");
      out.write("    <p>身份证号 : <input type=\"text\"></p>\r\n");
      out.write("    <p>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别 : <input type=\"radio\" name=\"gender\" id=\"nan\" value=\"男\"> <label\r\n");
      out.write("            for=\"nan\" class=\"nan\">男</label>\r\n");
      out.write("        <input type=\"radio\" name=\"gender\" id=\"nv\" value=\"女\"> <label for=\"nv\">女</label>\r\n");
      out.write("    </p>\r\n");
      out.write("    <button id=\"btn1\">确认修改</button>\r\n");
      out.write("    <button class=\"btn\" id=\"btn2\">取消修改</button>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-01 14:55:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class goods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"/css/goods.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/axios/0.18.0/axios.min.js\"></script>\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        window.onload = () => {\r\n");
      out.write("            axios({\r\n");
      out.write("                method: 'get',\r\n");
      out.write("                url: \"http://localhost:8080/goods/getGoodsList\"\r\n");
      out.write("            }).then((resp) => {\r\n");
      out.write("                let information = resp.data;\r\n");
      out.write("                console.log(information);\r\n");
      out.write("                for(let i = 0; i < information.length; i++){\r\n");
      out.write("                    ListAll.innerHTML +=\r\n");
      out.write("                        `\r\n");
      out.write("                        <tr class=\"border-tr2\" align=\"center\">\r\n");
      out.write("                            <td><img src=\"/imgs/` + information[i].image + `\" width=\"200px\" height=\"150px\"></td>\r\n");
      out.write("                            <td> ` + information[i].username + ` </td>\r\n");
      out.write("                            <td> ` + information[i].number +` </td>\r\n");
      out.write("                            <td> ` + information[i].price +` </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        `\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<button onclick=\"javascript:history.back(-1);\">返回</button>\r\n");
      out.write("<h2 style=\"width: 90%; height: 50px; background-color: #233645; margin: 5px auto; margin-top:90px; line-height: 50px; color: aliceblue;\">&nbsp;&nbsp;&nbsp; 采&nbsp;购&nbsp;明&nbsp;细</h2>\r\n");
      out.write("<table border=\"1px\" cellspacing=\"0\" width=\"90%\" id=\"ListAll\" style=\"position: relative; margin: auto;\">\r\n");
      out.write("    <tr class=\"border-tr1\" align=\"center\">\r\n");
      out.write("        <th>商品图片</th>\r\n");
      out.write("        <th>商品名称</th>\r\n");
      out.write("        <th>商品数量</th>\r\n");
      out.write("        <th>商品价格</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

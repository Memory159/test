/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-08-15 07:51:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificationRoom_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"stylesheet\" href=\"css/modificationRoom.css\">\r\n");
      out.write("    <script src=\"js/axios-0.18.0.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        window.onload = function(){\r\n");
      out.write("            let modificationRoomId = window.location.search.substring(4);\r\n");
      out.write("            let bigBox = document.querySelector(\".big-box\");\r\n");
      out.write("            axios({\r\n");
      out.write("                method:\"get\",\r\n");
      out.write("                url:\"http://localhost:8080/room/selectById?id=\" + modificationRoomId\r\n");
      out.write("            }).then(function(resp){\r\n");
      out.write("                let room = resp.data;\r\n");
      out.write("                bigBox.children[1].innerHTML = `房间图片 : <input type=\"text\" value=\"`+ room.roomImage +`\">`;\r\n");
      out.write("                bigBox.children[2].innerHTML = `房间类型 : <input type=\"text\" value=\"`+ room.type +`\">`;\r\n");
      out.write("                bigBox.children[3].innerHTML = `房间价格 : <input type=\"text\" value=\"`+ room.price +`\">`;\r\n");
      out.write("                bigBox.children[4].innerHTML = `房间描述 : <input type=\"text\" value=\"`+ room.des +`\">`;\r\n");
      out.write("                bigBox.children[5].innerHTML = `可住人数 : <input type=\"text\" value=\"`+ room.peopleNumber +`\">`;\r\n");
      out.write("                bigBox.children[6].innerHTML = `床&nbsp; 位 &nbsp;数 : <input type=\"text\" value=\"`+ room.bedNumber +`\">`;\r\n");
      out.write("                bigBox.children[7].innerHTML = `房间总数 : <input type=\"text\" value=\"`+ room.sumRoom +`\">`;\r\n");
      out.write("            })\r\n");
      out.write("\r\n");
      out.write("            let btn1 = document.querySelector(\".btn1\");\r\n");
      out.write("            let btn2 = document.querySelector(\".btn2\");\r\n");
      out.write("            btn1.onclick = function(){\r\n");
      out.write("                let roomImage = bigBox.children[1].children[0].value;\r\n");
      out.write("                let type = bigBox.children[2].children[0].value;\r\n");
      out.write("                let price = bigBox.children[3].children[0].value;\r\n");
      out.write("                let des = bigBox.children[4].children[0].value;\r\n");
      out.write("                let peopleNumber = bigBox.children[5].children[0].value;\r\n");
      out.write("                let bedNumber = bigBox.children[6].children[0].value;\r\n");
      out.write("                let sumRoom = bigBox.children[7].children[0].value;\r\n");
      out.write("\r\n");
      out.write("                if(roomImage != \"\" && type != \"\" && price != \"\" && des != \"\" && peopleNumber != \"\" && bedNumber != \"\" && sumRoom != \"\"){\r\n");
      out.write("                    window.location.href = \"http://localhost:8080/room/modificationRoom?roomImage=\"+roomImage+\"&type=\"+type+\"&price=\"+price+\"&des=\"+des+\"&peopleNumber=\"+peopleNumber+\"&bedNumber=\"+bedNumber+\"&sumRoom=\"+sumRoom+\"&id=\"+modificationRoomId;\r\n");
      out.write("                    alert(\"修改成功\");\r\n");
      out.write("                }else {\r\n");
      out.write("                    alert(\"修改失败,请将信息填写完整\")\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            btn2.onclick = function(){\r\n");
      out.write("                window.location.href = \"http://localhost:8080/room/adminRoomOperate\"\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"big-box\">\r\n");
      out.write("    <h1>修改房间</h1>\r\n");
      out.write("    <p>房间图片 : <input type=\"text\"></p>\r\n");
      out.write("    <p>房间类型 : <input type=\"text\"></p>\r\n");
      out.write("    <p>房间价格 : <input type=\"text\"></p>\r\n");
      out.write("    <p>房间描述 : <input type=\"text\"></p>\r\n");
      out.write("    <p>可住人数 : <input type=\"text\"></p>\r\n");
      out.write("    <p>床&nbsp; 位 &nbsp;数 : <input type=\"text\"></p>\r\n");
      out.write("    <p>房间总数 : <input type=\"text\"></p>\r\n");
      out.write("    <button class=\"btn1\">确认修改</button><button class=\"btn2\">取消修改</button>\r\n");
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

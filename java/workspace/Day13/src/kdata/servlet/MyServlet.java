package kdata.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
//이처럼 url을 가짜로 만들어줘야 접근 가능, 이게 아니면 web.xml에 써야댐
//이 url로 들어오면 servlet접근할 수 있음
@WebServlet("/test.lny")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        
        System.out.println("MyServlet()");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init()");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy()");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
		
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String num = request.getParameter("num");
		String name = request.getParameter("name");
		
		//응답 받은 것의 컨텐츠 타입설정해주는 것
		response.setContentType("text/html; charset=UTF-8");
		
		
		//출력 스트림 설정하고 writer를 얻어와야
		PrintWriter out = response.getWriter();
		// 브라우저에 찍히는 것
		
		System.out.println(num);
		System.out.println(name);
		out.print(name);
		out.print(num);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("doPost()");
		
		//post에서는 요청 들어오는 것에 대해 encoding처리해주는 것
		request.setCharacterEncoding("UTF-8");
		
		//위에 거랑 같아서 이렇게 쓰는게 경제적이다.
		doGet(request, response);
		/*//응답 받은 것의 컨텐츠 타입설정해주는 것
		response.setContentType("text/html; charset=UTF-8");
		
		// 캐릭터를 설정해주고 파라미터 받아와야
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		
		
		//출력 스트림 설정하고 writer를 얻어와야
		PrintWriter out = response.getWriter();
		// 브라우저에 찍히는 것
		
		System.out.println(num);
		System.out.println(name);
		
		out.print(num);
		out.print(name);*/
	}

}

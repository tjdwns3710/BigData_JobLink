package kdata.project.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kdata.project.service.NextPage;
import kdata.project.service.UserService;

/**
 * Servlet implementation class Controller
 */
@WebServlet(value="*.kdata",
	initParams = {
			@WebInitParam(name = "url",
						value = "/kdata/project/util/util.properties")
			})

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// <URL,ServiceClassName>
	private Map<String, UserService> map = new HashMap<>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = request.getRequestURI();
		int cmdIdx = url.lastIndexOf("/")+1;
		String cmd = url.substring(cmdIdx);
		System.out.println(cmd);
		
		UserService service = map.get(cmd);
		NextPage nextPage = service.execute(request, response);
		
		//���������� �̵�
		if(nextPage == null) {
			System.out.println("Null�� ��ȯ������!");
		}
		else {
			if(nextPage.isRedirect()) {
				System.out.println("���� �������� �̵�");
				response.sendRedirect(nextPage.getPageName());
			}
			else {
				request.getRequestDispatcher(nextPage.getPageName()).forward(request,response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		//config.getInitParameter("url");
		
		Properties prop = new Properties();
		
		//getClass().getResourceAsStream(config.getInitParameter("url"));
		
		try {
			prop.load(getClass().getResourceAsStream(config.getInitParameter("url")));
			
			//System.out.println(prop);			
			Iterator<Object> it = prop.keySet().iterator();
			
			while(it.hasNext()) {
				String key = (String) it.next();
				
				//Ŭ���� �ε�
				Class clazz = Class.forName(prop.getProperty(key));
				
				//��ü ����
				UserService service = (UserService) clazz.newInstance();
				
				//map�� �߰�
				map.put(key, service);
			}
			
			//System.out.println(map);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}



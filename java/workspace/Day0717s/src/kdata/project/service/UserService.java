package kdata.project.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�տ� �Ƚᵵ �̸��� ������
public interface UserService {
	//�߻�޼ҵ� - ������� �Ӹ���
	//abstract�Ƚᵵ�� 

	/**
	 * @param request
	 * @param response
	 * @return
	 */
	public abstract NextPage execute(HttpServletRequest request, HttpServletResponse response);
}
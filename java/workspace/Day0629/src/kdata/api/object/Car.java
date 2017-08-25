package kdata.api.object;

public class Car {
	
	private int num;
	private String color;
	
	
	public Car(int num, String color) {
		super();
		this.num = num;
		this.color = color;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//source�޴����� tostring�� ���� ����� �� ����
	@Override
	public String toString() {
		return "Car [num=" + this.num + ", color=" + this.color + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		//class�� �ٸ��� false
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (num != other.num)
			return false;
		return true;
	}
	
	
	/*//30��
	 * //���⿡ �������̵��� ���༭ ���ο��� car tostring�� ������ ��
	//�������ε�
	//���� tostring�� ���⿡ ����ִ� �ʵ尪�� ���ִ��� Ȯ���ϴµ� ���
	@Override
	public String toString(){
		return "Car toString";
		
	}*/
	
	
	
	
	
	

}

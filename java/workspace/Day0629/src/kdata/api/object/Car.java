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
	
	//source메뉴에서 tostring을 쉽게 사용할 수 있음
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
		//class가 다르면 false
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
	
	
	/*//30줄
	 * //여기에 오버라이딩을 해줘서 메인에서 car tostring이 나오게 됨
	//동적바인딩
	//보통 tostring을 여기에 들어있는 필드값이 뭐있는지 확인하는데 사용
	@Override
	public String toString(){
		return "Car toString";
		
	}*/
	
	
	
	
	
	

}

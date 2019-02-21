package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	private int amount;
	
	
	public Money(int amount) {
		this.amount = amount;
	}
	

	public Money add(Money money) {
		Money temp = new Money(0);
		temp.amount = money.amount + this.amount; 
		return temp;
	}

	public Money minus(Money money) {
		Money temp = new Money(0);
		temp.amount = this.amount - money.amount; 
		return temp;
	}

	public Money multiply(Money money) {
		Money temp = new Money(0);
		temp.amount = this.amount * money.amount; 
		return temp;
	}

	public Money devide(Money money) {
		Money temp = new Money(0);
		temp.amount = this.amount / money.amount; 
		return temp;
	}
	
	@Override
	public boolean equals(Object obj) {

	    if (obj == null) {
	        return false;
	    }

	    if (this.getClass() != obj.getClass()) {
	        return false;
	    }

	    if (this == obj) {
	        return true;
	    }

	    Money that = (Money) obj;
  
	    if (this.amount == that.amount ) {
	        return true;
	    }

	    return false;
	}
}
package list05_02;

public class Pocket_gene<popo extends Character> {
	private popo data;
	public void put(popo o) {this.data = o;}
	public popo get() {return this.data;}
//	<E>は任意の文字でいい(popoでも...)
	@Override
	public String toString() {
		return "P_g [data=" + data + "]";
	}


}

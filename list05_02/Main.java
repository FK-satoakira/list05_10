package list05_02;

public class Main {

	public static void main(String[] args) {
//		Pocket_gene pg = new Pocket_gene();
//		Pocket_gene<String> listpg = new Pocket_gene<>();
//		listpg.put("Pocket_gene<String>");
//		String s = listpg.get();
//		System.out.println(s);
//		Hero h = new Hero();
//		h.setName("hero");
//		h.setAge(55);
		Pocket_gene<Hero> h = new Pocket_gene<>();
		h.put(new Hero());
//		h.get().setName("morita");
//		h.get().setAge(21);
		System.out.println(h);
		Pocket_gene<Samurai> s = new Pocket_gene<>();
		s.put(new Samurai());
		System.out.println(s);
	}

}

package sushi;

class KaitenSushi {

	public static void main(String[] args) {
		Kaikei akokyaku = new Kaikei();
		akokyaku.add(new Osara(Osara.MIDORI));
		akokyaku.add(new Osara(Osara.AO));
		akokyaku.add(new Osara(Osara.KURO));
		akokyaku.add(new Osara(Osara.AKA));
		akokyaku.add(new Osara(Osara.GIN));
		akokyaku.add(new Osara(Osara.KIN));
		akokyaku.add(new Osara(Osara.KIIRO));
		akokyaku.add(new Osara(Osara.KIN));
		akokyaku.account();
		// System.out.println("お会計は、" + akokyaku.account() + "円になります。");
		System.out.println("明細書はこちらになります。");
		System.out.println(akokyaku.description());
	}
}

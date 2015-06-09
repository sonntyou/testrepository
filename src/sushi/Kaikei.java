package sushi;

public class Kaikei {
	public int nedan;
	public int goukei;
	public int goukeikingaku;
	public int goukeimaisuu;
	public static int midori, midorigoukei;
	public static int ao, aogoukei;
	public static int kin, kingoukei;
	public static int kiiro, kiirogoukei;
	public static int aka, akagoukei;
	public static int gin, gingoukei;
	public static int kuro, kurogoukei;
	public int otooshi = 0;
	public double tokubetu;
	public int tokubetugoukei;
	public int tokubetutoint;

	public String description() {
		goukeimaisuu();

		System.out.println(tokubetu);
		tokubetusyori();

		System.out.println(tokubetutoint);
		return ("---------------------------------\n" + "黄色いお皿\t"
				+ kiiro
				+ "枚\t"
				+ String.format("%1$5d", kiirogoukei)
				+ "円\n"
				+ "緑のお皿\t"
				+ midori
				+ "枚\t"
				+ String.format("%1$5d", midorigoukei)
				+ "円\n"
				+ "青いお皿\t"
				+ ao
				+ "枚\t"
				+ String.format("%1$5d", aogoukei)
				+ "円\n"
				+ "赤いお皿\t"
				+ aka
				+ "枚\t"
				+ String.format("%1$5d", akagoukei)
				+ "円\n"
				+ "黒いお皿\t"
				+ kuro
				+ "枚\t"
				+ String.format("%1$5d", kurogoukei)
				+ "円\n"
				+ "銀箔のお皿\t"
				+ gin
				+ "枚\t"
				+ String.format("%1$5d", gingoukei)
				+ "円\n"
				+ "金箔のお皿\t"
				+ kin
				+ "枚\t"
				+ String.format("%1$5d", kingoukei)
				+ "円\n"
				+ "--------------------------------\n"
				+ "小合計\t\t"
				+ goukei
				+ "枚\t"
				+ String.format("%1$5d", goukeikingaku)
				+ "円\n"
				+ "お通し\t\t\t"
				+ String.format("%1$5d", otooshi)
				+ "円\n"
				+ "特別会計\t"
				+ (tokubetutoint * 10)
				+ "%\t"
				+ String.format("%1$5d", tokubetugoukei)
				+ "円\n"
				+ "--------------------------------\n"
				+ "合計\t\t\t"
				+ String.format("%1$5d",
						(goukeikingaku + otooshi + tokubetugoukei)) + "円");
	}

	public Kaikei() {
		this.nedan = 500;
	}

	public void account() {
		goukeikingaku = (kiiro * 120 + midori * 180 + kin * 800 + ao * 240
				+ gin * 600 + kuro * 440 + aka * 320);
		goukeimaisuu();
		tokubetusyori();
		System.out.println(goukeikingaku);
		System.out.println(otooshi);
		System.out.println(tokubetugoukei);
		// return (goukeikingaku + otooshi + tokubetugoukei);
	}

	// 枚数×値段
	public void goukeisyori() {
		kiirogoukei = kiiro * 120;
		midorigoukei = midori * 180;
		aogoukei = ao * 240;
		kingoukei = kin * 800;
		gingoukei = gin * 600;
		akagoukei = aka * 320;
		kurogoukei = kuro * 440;
	}

	public void otooshihantei() {
		if (goukei > 0) {

			otooshi = 0;
			if (goukei > 5) {
				tokubetu = 0.5;
			}
		} else {
			otooshi = 500;
		}
	}

	public void goukeimaisuu() {
		goukei = kiiro + midori + kin + ao + kuro + gin + aka;
	}

	public void tokubetusyori() {
		tokubetugoukei = (int) (tokubetu * goukeikingaku);
		tokubetutoint = (int) (tokubetu * 10);
	}

	public void add(Osara osara) {
		switch (osara.getIro()) {
		case "緑のお皿":
			midori++;
			break;
		case "青いお皿":
			ao++;
			break;
		case "金箔のお皿":
			kin++;
			break;

		case "黄色のお皿":
			kiiro++;
			break;
		case "銀のお皿":
			gin++;
			break;
		case "赤いお皿":
			aka++;
			break;
		case "黒いお皿":
			kuro++;
			break;

		}
	}
}
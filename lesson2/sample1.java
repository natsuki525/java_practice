//画面に文字を出力するコード
class Sample1
{
	public static void main(String [] args)
	{
		System.out.println("ようこそJavaへ!");
		System.out.println("Javaをはじめましょう！");
	}
}

class Sample2
{
	public static void main(String[] args)
	{
		System.out.print("ようこそJavaへ！");
		System.out.print("Javaをはじめましょう！");
	}
}

class Sample3
{
	public static void main(String[] args)
	{
		System.out.println('A');
		System.out.println("ようこそJavaへ！");
		System.out.println(123);
	}
}
// エスケープシーケンス
class Sample4
{
	public static void main(String[] args)
	{
		System.out.println("円記号を表示します。:¥");
		System.out.println("アポストロフィを表示します。:'");
	}
}
// Unicode
class Sample5
{
	public static void main(String[] args)
	{
		System.out.println("8進数101の文字は\101です。");
		System.out.println("16進数0061の文字は\u0061です。");
	}
}

// 数値リテラル
class Sample6
{
	public static void main(String[] args)
	{
		System.out.println("10進数の10は" + 10 + "です。");
		System.out.println("8進数の10は" + 010 + "です。");
		System.out.println("16進数の10は" + 0x10 + "です。");
		System.out.println("16進数のFは" + 0xF + "です。");
	}
}

// レッスン2練習
//3 「123」「¥100もらった」「またあした」を出力
class Sample7
{
	public static void main(String[] args)
	{
		System.out.println(123);
		System.out.println("¥100もらった");
		System.out.println("またあした");
	}
}
// 4 タブ記号を表すエスケープシーケンスを使う
class Sample8
{
	public static void main(String[] args)
	{
		System.out.println(1 +"\t"+ 2 +"\t"+ 3);
	}
}

//5 (8進数で6・20・13を出力)
class Sample9
{
	public static void main(String[] args)
	{
		System.out.println(06);
		System.out.println(024);
		System.out.println(015);
	}
}

//5 (16進数で6・20・13を出力)
class Sample10
{
	public static void main(String[] args)
	{
		System.out.println(0x6);
		System.out.println(0x14);
		System.out.println(0xD);
	}
}
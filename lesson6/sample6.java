import java.io.*;
// for文を使う
class Sample1
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++){
			System.out.println("繰り返しています。");
		}

		System.out.println("繰り返しが終わりました。");
	}
}

// 繰り返し回数を出力する
class Sample2
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++){
			System.out.println(i + "番目の繰り返しです。");
		}

		System.out.println("繰り返しが終わりました。");
	}
}

// 入力した数だけ*を出力する
class Sample3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("いくつ*を出力しますか？");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		for(int i=1; i<=num; i++){
			System.out.print("*");
		}
	}
}

// 入力した数までの合計を求める
class Sample4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("いくつまでの合計を求めますか？");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		int sum = 0;
		for(int i=1; i<=num; i++){
			sum += i;
		}

		System.out.println("1から" + num + "までの合計は" + sum + "です。");
	}
}

// while文を使う
class Sample5
{
	public static void main(String[] args)
	{
		int i = 1;

		while(i <= 5){
			System.out.println(i + "番目の繰り返しです。");
			i++;
		}

		System.out.println("繰り返しが終わりました。");
	}
}

// do〜while文を使う
class Sample6
{
	public static void main(String[] args)
	{
		int i = 1;

		do{
			System.out.println(i + "番目の繰り返しです。");
			i++;
		}while(i <= 5);

		System.out.println("繰り返しが終わりました。");
	}
}

// for文をネストする
class Sample7
{
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.println("iは" + i + ":jは" + j);
			}
		}
	}
}

// if文などと組み合わせる
class Sample8
{
	public static void main(String[] args)
	{
		boolean b1 = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(b1 == false){
					System.out.print("*");
					b1 = true;
				}
				else{
					System.out.print("-");
					b1 = false;
				}
			}
			System.out.print("\n");
		}
	}
}

// break文でブロックから抜ける
class Sample9
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目でループを中止しますか？(1~10)");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		for(int i=1; i<=10; i++){
			System.out.println(i + "番目の処理です。");
			if(i == res)
				break;
		}
	}
}

// switch文の中でbreakを使う
class Sample10
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("成績を入力してください。(1~5)");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
			case 2:
				System.out.println("もう少しがんばりましょう。");
				break;
			case 3:
			case 4:
				System.out.println("この調子でがんばりましょう。");
				break;
			case 5:
				System.out.println("たいへん優秀です。");
				break;
			default:
				System.out.println("1〜5までの成績を入力してください。");
				break;
		}
	}
}

// continue文でブロックの最初に戻る
class Sample11
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目の処理を飛ばしますか？(1〜10)");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		for(int i=1; i<=10; i++){
			if(i == res)
				continue;
			System.out.println(i + "番目の処理です。");
		}
	}
}
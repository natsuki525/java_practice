import java.io.*;

// if文を使う
class Sample1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1)
			System.out.println("1が入力されました。");

		System.out.println("処理を終了します。");
	}
}

// 複数の文を処理するif文を使う
class Sample2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("1が入力されました。");
			System.out.println("1が選択されました。");
		}

		System.out.println("処理を終了します。");
	}
}

// if〜else文を使う
class Sample3{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("1が入力されました。");
		}
		else{
			System.out.println("1以外が入力されました。");
		}
	}
}

// if〜else if〜elseを使う
class Sample4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("1が入力されました。");
		}
		else if(res == 2){
			System.out.println("2が入力されました。");
		}
		else{
			System.out.println("1か2を入力してください。");
		}

	}
}

// switch文を使う
class Sample5
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch(res){
			case 1:
				System.out.println("1が入力されました。");
				break;
			case 2:
				System.out.println("2が入力されました。");
				break;
			default:
				System.out.println("1か2を入力してください。");
				break;
		}
	}
}

// switch文を文字で場合分けする
class Sample6
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		switch(res){
			case 'a':
				System.out.println("aが入力されました。");
				break;
			case 'b':
				System.out.println("bが入力されました。");
				break;
			default:
				System.out.println("aかbを入力してください。");
				break;
		}
	}
}

// 論理演算子で条件を記述する
class Sample7
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("あなたは男性ですか。");
		System.out.println("YまたはNを入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		if (res == 'Y' || res == 'y'){
			System.out.println("あなたは男性ですね。");
		}
		else if (res =='N' || res == 'n'){
			System.out.println("あなたは女性ですね。");
		}
		else{
			System.out.println("YまたはNを入力してください。");
		}
	}
}

// 条件演算子を使う
/* class Sample8
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目のコースにしますか。");
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		char ans;
		if(res == 1)
			ans = 'A';
		else
			ans = 'B';

		System.out.println(ans + "コースを選択しました。");
	}
} */

class Sample8
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("何番目のコースにしますか。");
		System.out.println("整数を入力してください。");

		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		char ans = (res==1) ? 'A':'B';

		System.out.println(ans + "コースを選択しました。");
	}
}
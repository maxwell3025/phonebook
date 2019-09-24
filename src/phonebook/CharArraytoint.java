package phonebook;

public class CharArraytoint {
public static int power(int n, int p){
	int o = n;
	for (int i=1; i<p; i++ ){
		n=n*o;
	}
	return n;
}
public static int ArrayToInt(String[] letters){
	int numbers = 0;
	String[] alphabet={"a","b","c","d","e","f","g","h","i","j","k","l","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	for(int i=0; i<letters.length; i++){
		for (int i2=0; i2<26; i2++){
			if (String.valueOf(letters[i])==alphabet[i2]){
				numbers=numbers+i2*power(i2+1, i+1);
			}
		} 
	}
	return numbers;
	}

	public static void main(String[] args) {
		String[] stuff={"a","b"};
System.out.println(ArrayToInt(stuff));
	}

}

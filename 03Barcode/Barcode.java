import java.util.*;

public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private String addScheme;
    private int scheme;
    private static final String[] bars = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    public Barcode(String zip){
	for(int i = 0;i < zip.length();i++){
	    if(!Character.isDigit((zip.charAt(i)))){
		throw new IllegalArgumentException("Contains a non-Digit!");
	    }
	}
	if(zip.length() != 5){
	    throw new IllegalArgumentException("Zip not right size!");
	}	
	else{
	    _zip = zip;
	    _checkDigit = checkSum() % 10;
	}
    }

    public Barcode clone(){
	Barcode clone = new Barcode(_zip);
	return clone;
    }

    private int checkSum(){
	int ans = 0;
	for(int k = 0;k < _zip.length();k++){
	    ans += (int)_zip.charAt(k);
	}
	return ans;
    }

    private static int checkSum(String checked){
	int ans = 0;
	for(int k = 0;k < checked.length();k++){
	    ans += (int)checked.charAt(k);
	}
	return ans;
    }

    public static String toCode(String zip){
	if(zip.length() != 5){
	    throw new IllegalArgumentException("Zip not right length!");
	}
	for(int i = 0;i < zip.length();i++){
	    if(!Character.isDigit((zip.charAt(i)))){
		throw new IllegalArgumentException("Contains a non-Digit!");
	    }
	}
	int checkDigit = checkSum(zip) % 10;
	zip += checkDigit;
	String hold = "|";
	for(int i = 0;i < zip.length();i++){
	    int schemer = (int)zip.charAt(i) - 48;
	    switch (schemer){
	    case 1: hold +=  ":::||";
		break;
	    case 2: hold += "::|:|";
		break;
	    case 3: hold += "::||:";
		break;
	    case 4: hold += ":|::|";
		break;
	    case 5: hold += ":|:|:";
		break;
	    case 6: hold += ":||::";
		break;
	    case 7: hold += "|:::|";
		break;
	    case 8: hold += "|::|:";
		break;
	    case 9: hold += "|:|::";
		break;
	    case 0: hold += "||:::";
	    }
	}
	return hold;
    }
	

    public static String toZip(String barcode){
	if(barcode.length() != 32){
	    throw new IllegalArgumentException("Barcode is not correct size!");
	}
	if(barcode.charAt(0) != '|' || barcode.charAt(31) != '|'){
	    throw new IllegalArgumentException("Barcode missing front and end bars!");
	}
	for(int i = 0;i < barcode.length();i++){
	    if(barcode.charAt(i) != ':' || barcode.charAt(i) != '|'){
		throw new IllegalArgumentException("Barcode contains non-barcode characters!");
	    }
	}
	String ans = "";
	String switcher = "";
	for(int i = 1;i < barcode.length() - 5;i = i + 3){
	    switcher = barcode.substring(i,i+3);
	    if(!Arrays.asList(bars).contains(switcher)){
		throw new IllegalArgumentException("A part of your barcode is unrecognized!");
	    }
	    switch (switcher){
	    case "||:::": 
		break;
	    case ":::||": ans += 1;
		break;
	    case "::|:|": ans += 2;
		break;
	    case "::||:": ans += 3;
		break;
	    case ":|::|": ans += 4;
		break;
	    case ":|:|:": ans += 5;
		break;
	    case ":||::": ans += 6;
		break;
	    case "|:::|": ans += 7;
		break;
	    case "|::|:": ans += 8;
		break;
	    case "|:|::": ans += 9;
		break;
	    }
	}
	return ans;
    }
    
    public int compareTo(Barcode other){
	int ans = 0;
	for(int i = 0; i < 5;i++){
	    if(!((this._zip.charAt(i))==(other._zip.charAt(i)))){
		if(this._zip.charAt(i) > other._zip.charAt(i)){
		    ans = 1;
		    break;
		}
		else if(this._zip.charAt(i) < other._zip.charAt(i)){
		    ans = -1;
		    break;
		}
	    }
	}
	if(!(this._checkDigit==other._checkDigit)){
		if(this._checkDigit > other._checkDigit){
		    ans = 1;
		}
		else if(this._checkDigit < other._checkDigit){
		    ans = -1;
		}
	    }
	return ans;
    }

    public String toString(){
	String hold = _zip+_checkDigit+" |";
	for(int i = 0;i < _zip.length();i++){
	    scheme = (int)_zip.charAt(i)-48;
	    switch (scheme){
	    case 1: addScheme =  ":::||";
		break;
	    case 2: addScheme = "::|:|";
		break;
	    case 3: addScheme = "::||:";
		break;
	    case 4: addScheme = ":|::|";
		break;
	    case 5: addScheme = ":|:|:";
		break;
	    case 6: addScheme = ":||::";
		break;
	    case 7: addScheme = "|:::|";
		break;
	    case 8: addScheme = "|::|:";
		break;
	    case 9: addScheme = "|:|::";
		break;
	    case 0: addScheme = "||:::";
	    }
	    hold += addScheme;
	}
	hold += "|";
	return hold;
    }

    public static void main(String[]args){
	Barcode a = new Barcode("97030");
	System.out.println(a.toString());
	System.out.println(toCode("14679"));
	System.out.println(toZip("|:::||:::||:::||:::||:::||:|:|:|"));
    }
}

import java.util.*;

public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private String addScheme;
    private int scheme;

    public Barcode(String zip){
	for(int i = 0;i < zip.length();i++){
	    if(!Character.isDigit((zip.charAt(i)))){
		throw new IllegalArgumentException("Contains a non-Digit!");
	    }
	}
	if(zip.length() != 5){
	    throw new IllegalArgumentException();
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

    public int toZip(String barcode){
	if(barcode.length() != 32){
	    throw new IllegalArgumentException();
	}
	if(barcode.charAt(0) != '|' || barcode.charAt(31) != '|'){
	    throw new IllegalArgumentException();
	}
	int place = 6;
	int ans = 0;
	String switcher = "";
	for(int i = 1;i < barcode.length() - 2;i = i + 3){
	    switcher = barcode.substring(i,i+3);
	    switch (switcher){
	    case "||:::": break;
	    case ":::||": ans += 1*place;
		place--;
		break;
	    case "::|:|": ans += 2*place;
		place--;
		break;
	    case "::||:": ans += 3*place;
		place--;
		break;
	    case ":|::|": ans += 4*place;
		place--;
		break;
	    case ":|:|:": ans += 5*place;
		place--;
		break;
	    case ":||::": ans += 6*place;
		place--;
		break;
	    case "|:::|": ans += 7*place;
		place--;
		break;
	    case "|::|:": ans += 8*place;
		place--;
		break;
	    case "|:|::": ans += 9*place;
		place--;
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
	String hold = _zip + "|";
	for(int i = 0;i < _zip.length();i++){
	    scheme = (int)_zip.charAt(i);
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
	Barcode b = new Barcode("97031");
	Barcode c = new Barcode("03714");
	Barcode d = new Barcode("0");
    }
}

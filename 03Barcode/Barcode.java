public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private String addScheme;
    private int scheme
    private switch (scheme){
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
    case 0; addScheme = "||:::";
    }

    public Barcode(String zip){
	for(int i = 0;int < zip.length();i++){
	    if(!(zip.charAt(i)).isDigit()){
		throw new InvalidParameterException("Contains a non-Digit!");
	    }
	}
	if(zip.length() != 5){
	    throw new InvalidParameterException();
	}	
	/*
	else{
	    _zip = zip;
	for(int k = 0;k < zip.length();k++){
	    _checkDigit += (int)zip.charAt(k);
	}
	_checkSum = _checkSum % 10;
	}
	*/
    }


    public String toString(){
	String hold = _zip + "|";
	for(int i = 0;i < _zip.length();i++){
	    scheme = (int)_zip.charAt(i);
	    hold += addScheme;
	}
	hold += "|";
    }
}

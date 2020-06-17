package it.dstech.service;

public class Service {
	public String testo;

	public Service(String testo) {
		this.testo = testo;
	}
	public int contaParole() {
		String parole=testo;
		int count=0;
		for(int i = 0; i < parole.length(); i++){
            if(parole.charAt(i) != ' '){
                count++;
                while(parole.charAt(i) != ' ' && i < parole.length()-1){
                    i++;
                }
            }
        }
        return count;
	
	}
	public  int contaVocali(){
		String parole= testo;
        int count = 0;
        for (int i = 0; i < parole.length(); i++)
        {
            if (parole.charAt(i) == 'a' || parole.charAt(i) == 'e' || parole.charAt(i) == 'i'
                    || parole.charAt(i) == 'o' || parole.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
	public boolean isConsonant(char ch) 
    { 
        ch = Character.toUpperCase(ch); 
       
        return !(ch == 'A' || ch == 'E' ||  
                ch == 'I' || ch == 'O' ||  
                ch == 'U') && ch >= 65 && ch <= 90; 
    } 
	 public int contaConsonanti() 
	    { 
		 String str=testo;
	        int count = 0; 
	        for (int i = 0; i < str.length(); i++)  
	       
	            // To check is character is Consonant 
	            if (isConsonant(str.charAt(i))) 
	                ++count; 
	        return count; 
	    } 
}

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
	
}

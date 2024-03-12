
public class Primos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Você deve passar um parâmetro.");
            System.exit(0);
        }
        int qnt = Integer.parseInt(args[0]); //Converte para número a entrada
        int count = 0;
        int num = 0;
        
        while(count < qnt) {
        	if(isPrime(num)) {
        		System.out.println(num);
        		count++;
        	}
        	num++;
        }
        
        
    }
    public static boolean isPrime(int num) {
    	if(num <= 1) {
    		return false;
    	}
    	for(int i = 2; i <= Math.sqrt(num); i++) {
    		if(num % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}

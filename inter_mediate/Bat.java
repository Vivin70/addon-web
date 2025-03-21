package inter_mediate;


class Bat implements AnimalSound, Birds {
	 @Override
	 public void makeSound() {
	     System.out.println("The bat makes a screeching sound.");
	 }

	 @Override
	 public void fly() {
	     System.out.println("The bat is flying gracefully.");
	 }
	}
	



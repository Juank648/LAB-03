package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;



public class Registry {
	private boolean valid = true;
	private boolean duplicate = false;
	private ArrayList<Person> personas = new ArrayList<Person>();
	/**
	*Verifica que la persona tenga los atributosc correctos
	*@param p persona
	*@return RegisterResult el resultado del registro
	*/
    public RegisterResult registerVoter(Person p) {
		for(int i = 0; i < personas.size(); i++){
			if(p.getId() == personas.get(i).getId()){
				duplicate = true;
			}
		}
		if(duplicate){
			valid = false;
			return RegisterResult.DUPLICATED;
		}
		
		if(p.getGender().equals(Gender.UNIDENTIFIED)) {
			valid = false;
			return RegisterResult.INVALID_GENRE;
		}
		if(!p.isAlive()){
			valid = false;
			return RegisterResult.DEAD;
		}
		if(p.getAge() < 18){
			valid = false;
			return RegisterResult.UNDERAGE;
		}
		if(p.getAge() > 130){
			valid = false;
			return RegisterResult.INVALID_AGE;
		}
		if(p.getName().length() < 4 || p.getName().length() > 50){
			valid = false;
			return RegisterResult.INVALID_NAME;
		}
		if(valid){
			personas.add(p);
			return RegisterResult.VALID;
		}
		return null;
			
    }
}
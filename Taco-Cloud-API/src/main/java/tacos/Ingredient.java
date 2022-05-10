package tacos; 

import lombok.Data; 
import lombok.RequiredArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;

@Data 
@RequiredArgsConstructor 

@Entity
@NoArgsConstructor(force=true)
public class Ingredient { 
	@Id
	private final String id; 
	private final String name; 
	@Enumerated(EnumType.STRING)
	private final Type type; 
	
	public static enum Type { 
	 WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE 
	} 
}


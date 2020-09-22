package tacos;

import java.util.List;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;
import lombok.Data;

@Data
public class Taco {
	
	public Taco() {
		// TODO Auto-generated constructor stub
	}
	@NonNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;

}

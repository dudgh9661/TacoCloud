package tacos;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.CreditCardNumber;



import lombok.Data;

@Data
public class Order {
	
	@NotBlank(message="Name is required")
	private String deliveryName;
	
	@NotBlank(message="street is required")
	private String deliveryStreet;
	
	@NotBlank(message="city is required")
	private String deliveryCity;
	
	@NotBlank(message="state is required")
	private String deliveryState;
	
	@NotBlank(message="zip is required")
	private String deliveryZip;
	
	@CreditCardNumber(message="not a valid credit card number")
	private String ccNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
			message="must be formatted MM/YY")
	private String ccExpiration;
	
	@Digits(integer=3, fraction=0, message="invalid CVV")
	private String ccCVV;
}

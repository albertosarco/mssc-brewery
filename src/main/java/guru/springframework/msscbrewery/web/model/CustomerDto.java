package guru.springframework.msscbrewery.web.model;

import java.util.UUID;

import lombok.Data;

@Data
public class CustomerDto {
	
	private UUID id;
	private String name;

}

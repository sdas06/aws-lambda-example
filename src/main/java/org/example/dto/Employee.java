package org.example.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JacksonXmlRootElement(localName = "Employee")
@JsonRootName("Employee") // JSON Root
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private String name;
	private int age;
	private String department;

}

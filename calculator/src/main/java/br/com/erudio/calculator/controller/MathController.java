package br.com.erudio.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.calculator.service.MathService;

@RestController
public class MathController {
	
	@Autowired
	private MathService mathService;
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.subtraction(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.multiplication(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.division(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		return mathService.mean(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/squareRoot/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) {
		return mathService.squareRoot(number);
	}
	
}
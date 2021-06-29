package br.com.erudio.calculator.service.impl;

import org.springframework.stereotype.Service;

import br.com.erudio.calculator.converters.Converter;
import br.com.erudio.calculator.exception.UnsupportedMathOperationException;
import br.com.erudio.calculator.service.MathService;

@Service
public class MathServiceImpl implements MathService {

	public Double sum(String numberOne, String numberTwo) {
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value.");
		Double sum = Converter.convertDouble(numberOne) + Converter.convertDouble(numberTwo); 
		return sum;
	}
	
	public Double subtraction(String numberOne, String numberTwo) {
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value.");
		Double subtraction = Converter.convertDouble(numberOne) - Converter.convertDouble(numberTwo); 
		return subtraction;
	}
	
	public Double multiplication(String numberOne, String numberTwo) {
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value.");
		Double multiplication = Converter.convertDouble(numberOne) * Converter.convertDouble(numberTwo); 
		return multiplication;
	}
	
	public Double division(String numberOne, String numberTwo) {
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value.");
		Double division = Converter.convertDouble(numberOne) / Converter.convertDouble(numberTwo); 
		return division;
	}
	
	public Double mean(String numberOne, String numberTwo) {
		if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value.");
		Double mean = (Converter.convertDouble(numberOne) + Converter.convertDouble(numberTwo)) / 2; 
		return mean;
	}
	
	public Double squareRoot(String number) {
		if (!Converter.isNumeric(number)) throw new UnsupportedMathOperationException("Please set a numeric value.");
		Double squareRoot = Math.sqrt(Converter.convertDouble(number)); 
		return squareRoot;
	}
	
}

package com.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	
	//Dependency
	@Autowired
	private SpellChecker sp;
	
	
	public TextEditor(){
	
	}

	
	public TextEditor(SpellChecker sp) {
		super();
		this.sp = sp;
	}


	public SpellChecker getSp() {
		return sp;
	}

	
	public void setSp(SpellChecker sp) {
		this.sp = sp;
	}
	
	public void spellCheck() {
		sp.checkSpelling();
	}
	
	
}

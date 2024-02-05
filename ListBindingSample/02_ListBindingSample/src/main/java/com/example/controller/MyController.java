package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.MyForm;

@Controller
public class MyController {
	

	@GetMapping("/pageA")
    public String getPageA(Model model) {
    	MyForm form = new MyForm();
        model.addAttribute("myForm", form);
        return "pageA";
    }
	
	@PostMapping("/pageB")
	public String getPageB(Model model,
			@ModelAttribute("myForm")MyForm form) {
		return "pageB";
	}

	@PostMapping("/processForm")
    public String processForm(@ModelAttribute("myForm")MyForm form) {
				
        // ここでlistAの内容をコンソールに表示
		System.out.println("--------------------------------");
        System.out.println(form);
        return "result"; // ページをリダイレクト
    }
}

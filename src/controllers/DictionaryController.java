package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;


@Controller
public class DictionaryController {
     private  HashMap<String, String> hashMap = new HashMap<>();
    @GetMapping("/translate")
    public String getForm(){
        return "english";
    }
    @PostMapping("/translate")
    public String translateFromELToVN(@RequestParam String english, Model model){
        hashMap.put("english","tieng viet");
        hashMap.put("father","bo");
        hashMap.put("mother","me");
        hashMap.put("younger sister","em gai");
        hashMap.put("older sister","chi gai");
        hashMap.put("brother","anh trai");
        hashMap.put("tree","cay");
        hashMap.put("talk","noi");
        hashMap.put("eat","an");
        String vietnamese = hashMap.get(english);
        model.addAttribute("vietnamese",vietnamese);
        return "vietnamese";
    }
}

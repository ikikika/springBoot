package com.ltp.gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("first", new Grade("happy potter", "Potions", "C-", 20));
        model.addAttribute("second", new Grade("hermoine ganger", "Spells", "A+", 25));
        return "grades";
    }

}

package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {

    List<Grade> studentGrades = Arrays.asList(
            new Grade("happy potter", "Potions and magic", "C-", 20),
            new Grade("hermoine ganger", "Spells", "A+", 25),
            new Grade("ron wesly", "Unknown", "B+", 23));

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("first", new Grade("happy potter", "Potions and magic", "C-", 20));
        model.addAttribute("second", new Grade("hermoine ganger", "Spells", "A+", 25));

        model.addAttribute("grades", studentGrades);

        return "grades";
    }

}

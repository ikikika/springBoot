package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {

    // List<Grade> studentGrades = Arrays.asList(
    //         new Grade("happy potter", "Potions and magic", "C-", 20),
    //         new Grade("hermoine ganger", "Spells", "A+", 25),
    //         new Grade("ron wesly", "Unknown", "B+", 23));

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("first", new Grade("happy potter", "Potions and magic", "C-", 20));
        model.addAttribute("second", new Grade("hermoine ganger", "Spells", "A+", 25));

        model.addAttribute("grades", studentGrades);

        return "grades";
    }

    @GetMapping("/form")
    public String gradeForm(Model model){
        model.addAttribute("grade", new Grade());
        return "form";
    }

    @PostMapping("handleSubmit")
    public String submitForm(Grade grade){
        studentGrades.add(grade);
        return "redirect:/grades";
    }

}

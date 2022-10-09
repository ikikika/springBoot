package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GradeController {

    // List<Grade> studentGrades = Arrays.asList(
    // new Grade("happy potter", "Potions and magic", "C-", 20),
    // new Grade("hermoine ganger", "Spells", "A+", 25),
    // new Grade("ron wesly", "Unknown", "B+", 23));

    List<Grade> studentGrades = new ArrayList<>();

    @GetMapping("/grades")
    public String getGrades(Model model) {
        model.addAttribute("first", new Grade("happy potter", "Potions and magic", "C-", 20));
        model.addAttribute("second", new Grade("hermoine ganger", "Spells", "A+", 25));

        model.addAttribute("grades", studentGrades);

        return "grades";
    }

    @GetMapping("/")
    public String gradeForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("grade", getGradeIndex(id) == -1 ? new Grade() : studentGrades.get(getGradeIndex(id)));
        return "form";
    }

    @PostMapping("handleSubmit")
    public String submitForm(Grade grade) {
        int index = getGradeIndex(grade.getId());
        if (index == -1) {
            studentGrades.add(grade);
        } else {
            studentGrades.set(index, grade);
        }
        return "redirect:/grades";
    }

    public Integer getGradeIndex(String id) {
        for (int i = 0; i < studentGrades.size(); i++) {
            if (studentGrades.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}

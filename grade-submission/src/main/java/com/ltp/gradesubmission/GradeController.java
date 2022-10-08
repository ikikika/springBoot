package com.ltp.gradesubmission;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GradeController {

    @GetMapping("/grades")
    public ModelAndView getGrades() {
        Map<String, Grade> model = new HashMap<String, Grade>();
        model.put("first", new Grade("happy potter", "Potions", "C-"));
        model.put("second", new Grade("hermoine ganger", "Spells", "A+"));
        return new ModelAndView("grades", model);
    }

}

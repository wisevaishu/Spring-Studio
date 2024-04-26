package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("skills")
    @ResponseBody
    public String skillsPage() {
        return "<html>" +
                "<head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                " <h2>Languages Being Worked On</h2>" +
                " <ol>" +
                " <li>Python</li>" +
                " <li>JavaScript</li>" +
                "  <li>Java</li>" +
                "    </ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String showForm() {
        return "<html>" +
                "<head>" +
                "<body>" +
                "<h1>Programming Language Preferences</h1>" +
                " <form method='post' action='/submit'>" +
                " <label for='name'> Name: </label>" +
                " <input type='text' id='name' name='name'><br>" +
                " <label for='favorite1'> Favorite Language: </label>" +
                " <select id='favorite1' name='favorite1'>" +
                "<option value='javascript'>Javascript</option>"+
                "<option value='java'>Java</option>"+
                "<option value='python'>Python</option>"+
                " </select><br>" +
                " <label for='favorite2'> Second Favorite Language: </label>" +
                "  <select id='favorite2' name='favorite2'>" +
                "<option value='javascript'>Javascript</option>"+
                "<option value='java'>Java</option>"+
                "<option value='python'>Python</option>"+
                "</select><br>" +
                " <label for='favorite3'> Third Favorite Language: </label>" +
                " <select id='favorite3' name='favorite3'>" +
                "<option value='javascript'>Javascript</option>"+
                "<option value='java'>Java</option>"+
                "<option value='python'>Python</option>"+
                "</select><br>" +
                " <input type='submit' value='Submit'>" +
                " </form>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form1")
    @ResponseBody
    public String showForm1() {
        return "<html>" +
                "<head>" +
                "<body>" +
                "<h1>Programming Language Preferences</h1>" +
                "<form method='post' action='/hello'>" +
                "<table>" +
                "<tr>" +
                "<td><label for='name'>Name:</label></td>" +
                "<td><input type='text' id='name' name='name'></td>" +
                "</tr>" +
                "<tr>" +
                "<td><label for='favorite1'>Favorite Language:</label></td>" +
                "<td>" +
                "<select id='favorite1' name='favorite1'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "</td>" +
                "</tr>" +
                "<tr>" +
                "<td><label for='favorite2'>Second Favorite Language:</label></td>" +
                "<td>" +
                "<select id='favorite2' name='favorite2'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "</td>" +
                "</tr>" +
                "<tr>" +
                "<td><label for='favorite3'>Third Favorite Language:</label></td>" +
                "<td>" +
                "<select id='favorite3' name='favorite3'>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='java'>Java</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "</td>" +
                "</tr>" +
                "</table>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @PostMapping({"form", "form1"})
    @RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String favorite1, @RequestParam String favorite2,
                              @RequestParam String favorite3) {
        return "<html>" +
                "<head>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+favorite1+"</li>" +
                "<li>"+favorite2+"</li>" +
                "<li>"+favorite3+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>"
                ;
    }

    @PostMapping("submit")
    @RequestMapping(value="submit", method = RequestMethod.POST)
    @ResponseBody
    public String processForm1(@RequestParam String name, @RequestParam String favorite1, @RequestParam String favorite2,
                              @RequestParam String favorite3) {
        return "<html>" +
                "<head>" +
                "<body>" +
                "<h1>"+name+"</h1>" +
                "<ol>" +
                "<li>"+favorite1+"</li>" +
                "<li>"+favorite2+"</li>" +
                "<li>"+favorite3+"</li>" +
                "</ol>" +
                "</body>" +
                "</html>"
                ;
    }
}

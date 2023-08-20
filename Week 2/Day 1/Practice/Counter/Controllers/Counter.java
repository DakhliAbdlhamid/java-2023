package com.souha.Counter.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Counter {
   @RequestMapping("/your_server")
   public String welcome() {
       
   return "index.jsp";
   }
   @RequestMapping("/your_server/counter")
   public String getCounter(HttpSession session, Model model) {
       int counter = 0;

       if (session.getAttribute("counter") != null) {
           counter = (int) session.getAttribute("counter");
       }

       counter++;

       session.setAttribute("counter", counter);

       model.addAttribute("counter", counter);
       return "Counter.jsp";
   }
}

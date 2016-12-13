package com.sut.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/gogoes")
@Controller
@RooWebScaffold(path = "gogoes", formBackingObject = Gogo.class)
public class GogoController {
}

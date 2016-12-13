package com.sut.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/aaas")
@Controller
@RooWebScaffold(path = "aaas", formBackingObject = Aaa.class)
public class AaaController {
}

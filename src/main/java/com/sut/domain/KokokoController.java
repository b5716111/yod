package com.sut.domain;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/kokokoes")
@Controller
@RooWebScaffold(path = "kokokoes", formBackingObject = Kokoko.class)
public class KokokoController {
}

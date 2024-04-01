package com.topsoutherncoders.ytgetmeout;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@AnonymousAllowed
@Route("")
public class HelloWorldView extends VerticalLayout {
    public HelloWorldView() {
        Anchor link = new Anchor("http://localhost:8080/login", "Login Here");
        add(new H1("Hello World!"));
        add(link);
    }

}

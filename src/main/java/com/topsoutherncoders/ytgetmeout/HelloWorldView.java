package com.topsoutherncoders.ytgetmeout;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloWorldView extends HorizontalLayout {
    public HelloWorldView() {
        add(new H1("Hello World!"));
    }
}

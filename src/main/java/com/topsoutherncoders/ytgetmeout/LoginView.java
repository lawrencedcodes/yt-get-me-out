package com.topsoutherncoders.ytgetmeout;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.VaadinServlet;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Value;

@AnonymousAllowed
@Route("login")
public class LoginView extends VerticalLayout {

    @Value("${oauth2.client-id")
    private String clientId;

    public LoginView() {
        Button loginButton = new Button("Login with Google");
        loginButton.addClickListener(event -> {
            //redirect
            String authorizationUrl = "https://accounts.google.com/o/oauth2/auth"
                    + "?client_id=" + clientId
                    + "&redirect_uri=" + VaadinServlet.getCurrent().getServletContext().getContextPath() + "/oauth2callback"
                    + "&response_type=code"
                    + "&scope=email%20profile"; // Example scope
            getUI().ifPresent(ui -> ui.getPage().executeJs("window.location.href='" + authorizationUrl + "'"));
        });
        add(loginButton);
    }
}

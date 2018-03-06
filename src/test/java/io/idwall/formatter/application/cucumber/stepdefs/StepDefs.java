package io.idwall.formatter.application.cucumber.stepdefs;

import io.idwall.formatter.application.IdwallFormatterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IdwallFormatterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}

package io.cucumber.core.gherkin5;

import gherkin.ast.ScenarioDefinition;
import io.cucumber.core.gherkin.Location;
import io.cucumber.core.gherkin.Scenario;

import static io.cucumber.core.gherkin5.Gherkin5Location.from;

final class Gherkin5Scenario implements Scenario {

    private final ScenarioDefinition scenarioDefinition;

    Gherkin5Scenario(ScenarioDefinition scenarioDefinition) {
        this.scenarioDefinition = scenarioDefinition;
    }

    @Override
    public Location getLocation() {
        return from(scenarioDefinition.getLocation());
    }

    @Override
    public String getKeyWord() {
        return scenarioDefinition.getKeyword();
    }

    @Override
    public String getName() {
        return scenarioDefinition.getName();
    }
}
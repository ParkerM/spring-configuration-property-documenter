package org.rodnansol.core.generator.writer;

import org.rodnansol.core.generator.template.customization.TemplateCustomization;
import org.rodnansol.core.project.Project;

import java.io.File;
import java.util.List;
import java.util.Objects;

/**
 * Class representing the document creation command.
 *
 * @author nandorholozsnyak
 * @since 0.1.0
 */
public class CreateDocumentCommand {

    private final Project project;
    private final String name;
    private final File metadataInput;
    private final String template;
    private final File output;
    private final TemplateCustomization templateCustomization;
    private String description;
    private List<String> excludedGroups;
    private List<String> includedGroups;
    private List<String> excludedProperties;
    private List<String> includedProperties;
    private boolean failOnMissingInput;

    public CreateDocumentCommand(Project project, String name, File metadataInput, String template, File output, TemplateCustomization templateCustomization) {
        this.project = Objects.requireNonNull(project, "project is NULL");
        this.templateCustomization = Objects.requireNonNull(templateCustomization, "templateCustomization is NULL");
        this.name = Objects.requireNonNull(name, "name is NULL");
        this.metadataInput = Objects.requireNonNull(metadataInput, "metadataStream is NULL");
        this.template = Objects.requireNonNull(template, "template is NULL");
        this.output = output;
    }

    public String getName() {
        return name;
    }

    public String getTemplate() {
        return template;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getMetadataInput() {
        return metadataInput;
    }

    public File getOutput() {
        return output;
    }

    public Project getProject() {
        return project;
    }

    public TemplateCustomization getTemplateCustomization() {
        return templateCustomization;
    }

    public List<String> getExcludedProperties() {
        return excludedProperties;
    }

    public void setExcludedProperties(List<String> excludedProperties) {
        this.excludedProperties = excludedProperties;
    }

    public List<String> getIncludedProperties() {
        return includedProperties;
    }

    public void setIncludedProperties(List<String> includedProperties) {
        this.includedProperties = includedProperties;
    }

    public List<String> getExcludedGroups() {
        return excludedGroups;
    }

    public void setExcludedGroups(List<String> excludedGroups) {
        this.excludedGroups = excludedGroups;
    }

    public List<String> getIncludedGroups() {
        return includedGroups;
    }

    public void setIncludedGroups(List<String> includedGroups) {
        this.includedGroups = includedGroups;
    }


    public boolean isFailOnMissingInput() {
        return failOnMissingInput;
    }

    public void setFailOnMissingInput(boolean failOnMissingInput) {
        this.failOnMissingInput = failOnMissingInput;
    }
}

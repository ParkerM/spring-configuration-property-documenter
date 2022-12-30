package org.rodnansol.core.generator;

import org.rodnansol.core.project.Project;

import java.io.File;
import java.util.Objects;

/**
 * @author nandorholozsnyak
 * @since 0.1.0
 */
public class CreateDocumentCommand {

    private final Project project;
    private final String name;
    private final File metadataInput;
    private final String template;
    private final File output;
    private String description;

    public CreateDocumentCommand(Project project, String name, File metadataInput, String template, File output) {
        this.project = Objects.requireNonNull(project, "project is NULL");;
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
}

# Eclipse Setup Guide

This guide explains how to run the Barcode DSML project locally.

## Prerequisites

- Java JDK 8 or later
- Eclipse IDE
- Xtext plug-in / Eclipse Modeling tools
- Git

## Importing the project

```bash
git clone https://github.com/Jaycome/barcode_dsml.git
cd barcode_dsml
```

1. Open Eclipse.
2. Select **File → Import → General → Existing Projects into Workspace**.
3. Select the repository root directory.
4. Import all projects beginning with `uk.ac.kcl.inf.group6.cocktail`.
5. Import the runtime project `2023-cocktails-runtime-EclipseApplication`.
6. Run the Xtext Eclipse Application launch configuration.
7. In the runtime Eclipse instance, open the runtime example project and test DSL files.

## Troubleshooting

### Project cannot resolve Xtext packages

Make sure Eclipse has Xtext installed.

### Generated sources are missing

Regenerate Xtext artifacts from the grammar file, or confirm that `src-gen` / `xtend-gen` folders are present.

### Runtime project cannot recognize the DSL file

Confirm that the DSL plug-in is launched through the generated Eclipse Application and that the file extension matches the grammar configuration.

## Notes

This project was originally created as coursework. Some generated files may be committed to preserve reproducibility for portfolio review.

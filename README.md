# Barcode DSML

**Barcode DSML** is a Java / Xtext-based domain-specific modeling language (DSML) for describing structured cocktail preparation workflows. The project demonstrates how a textual modeling language can convert high-level recipe instructions into standardized, machine-readable workflow steps for automation scenarios such as franchise bar operations or beverage-preparation devices.

> This repository was originally developed as a King’s College London coursework project and has been reorganized as a portfolio project to highlight model-driven development, language engineering, validation, and automated workflow design.

## Why this project matters

Many operational workflows rely on informal instructions that are difficult to validate, standardize, or automate. Barcode DSML explores how a domain-specific language can:

- encode cocktail recipes in a consistent textual format
- validate required ingredients, quantities, and preparation steps
- reduce input errors through structured syntax and validation rules
- generate machine-readable preparation instructions
- support future automation through model-driven engineering

## Key Features

- Textual DSL for cocktail recipe and preparation workflow definition
- Xtext-based grammar and Eclipse IDE support
- Java / Xtend-based generation logic
- Validation rules for recipe consistency and input correctness
- Test project for grammar, validation, and generated output behavior
- Runtime example project demonstrating how the language can be used

## Tech Stack

- Java
- Eclipse Modeling Framework / Xtext
- Xtend
- JUnit
- Model-Driven Development
- Domain-Specific Language Design

## Repository Structure

```text
barcode_dsml/
├── uk.ac.kcl.inf.group6.cocktail/              # Main Xtext language project
├── uk.ac.kcl.inf.group6.cocktail.ide/          # IDE integration
├── uk.ac.kcl.inf.group6.cocktail.ui/           # Eclipse UI plug-in
├── uk.ac.kcl.inf.group6.cocktail.tests/        # Language / validation tests
├── uk.ac.kcl.inf.group6.cocktail.ui.tests/     # UI-related tests
├── 2023-cocktails-runtime-EclipseApplication/  # Runtime example project
├── docs/                                      # Project documentation
├── examples/                                  # Example DSL files
└── .github/workflows/                         # Optional CI checks
```

## Architecture Overview

Barcode DSML follows a typical Xtext-based language engineering structure:

```text
User-written recipe DSL
        ↓
Xtext grammar parser
        ↓
EMF model
        ↓
Validation rules
        ↓
Generator logic
        ↓
Machine-readable workflow instructions
```

For a more detailed explanation, see [`docs/architecture.md`](docs/architecture.md).

## Getting Started

### Prerequisites

- Java JDK 8 or later
- Eclipse IDE with Xtext support
- Maven / Gradle support depending on local Eclipse setup

### Importing the project into Eclipse

1. Clone this repository.
2. Open Eclipse.
3. Select **File → Import → Existing Projects into Workspace**.
4. Import all `uk.ac.kcl.inf.group6.cocktail*` projects.
5. Import `2023-cocktails-runtime-EclipseApplication` as the runtime example project.
6. Run the Xtext Eclipse Application launch configuration.
7. Open the runtime project and test example DSL files.

For a more detailed setup guide, see [`docs/setup-eclipse.md`](docs/setup-eclipse.md).

## Example Usage

A simplified example DSL file is available in [`examples/sample-cocktail.cocktail`](examples/sample-cocktail.cocktail).

> Note: The sample file is intended as documentation. If your current grammar uses a different file extension or syntax, update the sample accordingly.

## Testing

The repository includes an Xtext test project:

```text
uk.ac.kcl.inf.group6.cocktail.tests/
```

Recommended test coverage includes:

- grammar parsing
- recipe validation
- ingredient consistency
- invalid input detection
- generator output behavior

See [`docs/test-plan.md`](docs/test-plan.md) for a portfolio-friendly testing checklist.

## What I Learned

This project strengthened my understanding of:

- model-driven development
- domain-specific language design
- grammar definition and validation
- structured workflow automation
- Java / Xtext project organization
- translating domain requirements into executable software artifacts

## Future Improvements

- Add more complete example DSL programs
- Add CI validation for Java / Xtext tests
- Improve generated workflow output format
- Add screenshots or GIFs of the Eclipse editor
- Add stricter validation rules for ingredient units, quantities, and preparation order
- Refactor generated and source files for clearer separation between generated code and custom logic

## License

This project is shared for portfolio and educational purposes. See [`LICENSE`](LICENSE) for details.

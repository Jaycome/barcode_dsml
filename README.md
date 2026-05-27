# Barcode DSML

**Barcode DSML** is a Java / Xtext-based domain-specific modeling language (DSML) for describing structured cocktail preparation workflows.

This project demonstrates how a textual modelling language can be used to represent informal recipe instructions as structured, validated, and potentially machine-readable workflow definitions.

> This repository was originally developed as a King’s College London coursework project and has been reorganised as a portfolio project to highlight model-driven development, language engineering, validation logic, and Java / Xtext project structure.

---

## Why This Project Matters

Many operational workflows are still described through informal human-written instructions. These instructions may be easy for people to read, but they are difficult for software systems to validate, standardise, or automate.

Barcode DSML explores how a domain-specific language can help by:

- representing cocktail recipes in a consistent textual format
- modelling ingredients, quantities, and preparation steps as structured language elements
- supporting validation of recipe consistency and input correctness
- separating language syntax, model representation, validation, and generation logic
- demonstrating how domain-specific modelling can support future workflow automation

Although the domain example is cocktail preparation, the same approach can be applied to broader workflow-modelling scenarios such as manufacturing procedures, internal tools, device instructions, or low-code automation systems.

---

## Key Features

- Textual domain-specific language for cocktail recipe and preparation workflow definition
- Xtext-based grammar and Eclipse IDE integration
- Java / Xtend-based language implementation
- EMF-based model representation
- Validator structure for checking language-level and domain-level consistency
- Generator structure for transforming DSL input into output artefacts
- Dedicated test projects for language and UI-related testing
- Runtime Eclipse application project for experimenting with the language

---

## Tech Stack

- Java
- Xtext
- Eclipse Modeling Framework (EMF)
- Xtend
- JUnit
- Eclipse Plug-in Development
- Model-Driven Engineering
- Domain-Specific Language Design

---

## Repository Structure

```text
barcode_dsml/
├── uk.ac.kcl.inf.group6.cocktail/
│   └── Main Xtext language project, including grammar, runtime logic,
│       validation, and generator-related implementation.
│
├── uk.ac.kcl.inf.group6.cocktail.ide/
│   └── IDE integration project for language tooling support.
│
├── uk.ac.kcl.inf.group6.cocktail.ui/
│   └── Eclipse UI plug-in project for editor integration.
│
├── uk.ac.kcl.inf.group6.cocktail.tests/
│   └── Test project for language parsing, validation, and generator behaviour.
│
├── uk.ac.kcl.inf.group6.cocktail.ui.tests/
│   └── UI-related test project.
│
├── 2023-cocktails-runtime-EclipseApplication/
│   └── Runtime Eclipse application project used to experiment with the DSL.
│
├── CONTRIBUTING.md
├── LICENSE
├── .gitignore
└── README.md

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

## Example

A recipe written in the DSL (`test.cocktails`):

```text
addIc cube : 1 ounce
addI vodka : 28 ml
addI sour_mix : 28 ml
shake : 30 seconds
addD lemon 3 slices
```

The generator turns each file into a Java class (`TestCocktail.java` here) that prints the preparation steps:

```text
Step1:
put 1 ounce Cube ice
Step2:
add ingredient Vodka for 28 ml
Step3:
add ingredient Sour_mix for 28 ml
Step4:
Shake it for 30 seconds
Step5:
put Lemon 3 piece on the top of cocktail
```

Language summary:

| Statement | Syntax |
|---|---|
| Liquid ingredient | `addI <name> : <amount> ml` |
| Solid ingredient | `addF <name> : <amount> g` |
| Ice | `addIc cube\|crush\|shave\|block\|ball\|cone : <amount> ounce` |
| Muddle fruit or herbs | `mud <fruit>... : <amount> times` |
| Technique | `stir\|shake\|blend\|filter : <amount> seconds` |
| Effect | `use lighter\|co2` |
| Garnish | `addD <decoration> <amount> slices` |
| Variable | `var <name> = <int>` |

Amounts are integer expressions with `+ - * /`, parentheses and variables. The validator warns about ingredient names that are not lower case or not in the known ingredient list. Before generation, an ETL transformation (`generator/constant_fold.etl`) merges consecutive additions of the same ingredient into one step.

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

---

## Building and Running

1. Install Eclipse IDE for Java and DSL Developers (Xtext 2.29 or later, Java 17).
2. Import the projects: **File → Import → Existing Projects into Workspace**, select the repository root.
3. Generate the language infrastructure: run `uk.ac.kcl.inf.group6.cocktail/src/org/xtext/example/mydsl/GenerateCocktails.mwe2` (**Run As → MWE2 Workflow**, or the `Generate Cocktails (cocktails) Language Infrastructure` launch configuration). Generated sources (`src-gen/`, `xtend-gen/`, `model/generated/`) are not committed; this step recreates them. On the first run Xtext asks to download the ANTLR generator jar; answer `y`.
4. Run the tests: **Run As → JUnit Test** on `uk.ac.kcl.inf.group6.cocktail.tests`.
5. Try the editor: start `Launch Runtime Eclipse` and open `2023-cocktails-runtime-EclipseApplication/TestCocktails/src/test.cocktails`. Saving the file generates the Java class.

## License

Released under the MIT License. See [LICENSE](LICENSE).

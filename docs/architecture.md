# Architecture

Barcode DSML is structured as an Xtext-based language engineering project. Its purpose is to transform high-level cocktail recipe definitions into validated, structured workflow instructions.

## High-level flow

```text
Recipe author
    ↓
Textual DSL file
    ↓
Xtext parser
    ↓
EMF model
    ↓
Validation rules
    ↓
Generator
    ↓
Machine-readable preparation workflow
```

## Main components

### 1. Grammar

The grammar defines the syntax users can write in the DSL, including recipe names, ingredients, quantities, units, and preparation steps.

### 2. Model

The parsed DSL is represented as an EMF model. This model becomes the structured representation used by validation and generation logic.

### 3. Validation

Validation rules check whether the recipe definition is logically consistent.

Possible validation cases:

- missing recipe name
- missing ingredient quantity
- unsupported unit
- duplicated ingredient declaration
- preparation step referencing an undefined ingredient
- invalid preparation order

### 4. Generator

The generator converts a valid DSL model into structured output, such as step-by-step machine-readable preparation instructions.

Example target output formats may include:

- text workflow
- JSON-like instruction list
- Java objects
- automation-friendly command sequence

### 5. Runtime example

The runtime project demonstrates how the DSL can be used in an Eclipse Application environment.

## Portfolio relevance

This project demonstrates model-driven development, domain-specific language design, Java / Xtext tooling, validation logic, and workflow standardization.

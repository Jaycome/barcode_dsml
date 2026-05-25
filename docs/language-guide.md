# Language Guide

This document describes the intended concepts of Barcode DSML.

> The exact syntax should be updated to match the current Xtext grammar. This guide is written as a portfolio-friendly explanation of the domain model and expected language behavior.

## Core concepts

### Recipe

A recipe represents a cocktail preparation workflow.

Typical fields:

- recipe name
- list of ingredients
- list of preparation steps
- optional serving instructions

### Ingredient

An ingredient represents an item required for a cocktail.

Typical fields:

- name
- quantity
- unit

### Preparation step

A preparation step describes an action to be performed.

Possible actions:

- add ingredient
- mix
- shake
- stir
- pour
- garnish
- serve

## Example DSL

See [`../examples/sample-cocktail.cocktail`](../examples/sample-cocktail.cocktail).

## Validation ideas

A strong DSL should reject ambiguous or invalid workflows. Suggested validation rules:

- ingredient names must be unique within a recipe
- all ingredients referenced in preparation steps must be declared
- quantities must be positive
- units should be drawn from a supported unit list
- recipe must contain at least one preparation step
- serving step should appear after preparation steps

## Generator output

A valid DSL file can be transformed into a standardized workflow, for example:

```text
1. Add 50ml gin
2. Add 20ml lemon juice
3. Shake for 10 seconds
4. Pour into glass
5. Serve
```

Future output formats may include JSON or device-readable instructions.

# Development Notes

## Why use a DSML?

A domain-specific modeling language is useful when a domain has repeated structured workflows. In this project, cocktail recipes are treated as formal workflow definitions rather than informal free-text instructions.

## Design considerations

### Readability

The language should be easy for non-technical recipe authors to read.

### Validation

The language should prevent common mistakes before execution, such as missing ingredients or invalid quantities.

### Generation

The language should support transformation into standardized preparation instructions.

### Maintainability

Generated code should be separated from handwritten logic where possible.

## Engineering takeaways

This project demonstrates how software engineering can move from informal requirements to formal models, validation rules, and generated outputs.

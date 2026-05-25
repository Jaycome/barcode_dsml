# Test Plan

This document outlines recommended tests for Barcode DSML.

## Test categories

### 1. Grammar parsing tests

| Test case | Expected result |
|---|---|
| Valid recipe file | Parses successfully |
| Missing recipe name | Parser or validation error |
| Invalid keyword | Parser error |
| Unsupported unit | Validation error |

### 2. Validation tests

| Test case | Expected result |
|---|---|
| Duplicate ingredient declaration | Validation error |
| Step references undefined ingredient | Validation error |
| Negative quantity | Validation error |
| Empty preparation steps | Validation error |
| Valid recipe with all ingredients declared | Passes validation |

### 3. Generator tests

| Test case | Expected result |
|---|---|
| Valid recipe | Generates workflow output |
| Recipe with multiple steps | Preserves step order |
| Recipe with invalid ingredient reference | Does not generate valid workflow |

### 4. IDE behavior tests

| Test case | Expected result |
|---|---|
| Syntax highlighting | Keywords are highlighted |
| Autocomplete | DSL keywords appear |
| Validation marker | Invalid DSL file shows error marker |

## Suggested JUnit test naming

```text
RecipeParsingTest
RecipeValidationTest
WorkflowGenerationTest
```

## Portfolio note

Even if not all tests are automated yet, documenting the test plan shows awareness of language correctness, validation, and maintainability.

# Contributing

This repository is primarily maintained as a portfolio and educational project.

## Development workflow

1. Create a feature branch.
2. Keep generated files separate from hand-written implementation logic where possible.
3. Add or update examples when changing the DSL grammar.
4. Add or update validation tests when changing validation rules.
5. Update documentation when setup steps, syntax, or generated outputs change.

## Suggested commit style

Use short, descriptive commit messages, for example:

```text
docs: improve Eclipse setup guide
test: add validation case for missing ingredient
feat: add generator output for preparation steps
fix: correct unit validation rule
```

## Pull request checklist

- [ ] The project can be imported into Eclipse.
- [ ] Existing tests still pass.
- [ ] README / docs have been updated if behavior changed.
- [ ] No OS-specific files such as `.DS_Store` are committed.

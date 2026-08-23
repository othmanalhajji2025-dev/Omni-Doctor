#!/bin/bash
set -e
# Release helper script for Omni-Doctor v1.3.4
# Run this locally in a clone of the repository. Requires: git, gh (GitHub CLI), and network access.

# Target commit (change if needed)
COMMIT_SHA=d661e04d60307393e5fdefb2aa90da0923eaacc0
TAG=v1.3.4
RELEASE_TITLE="v1.3.4 — Master Specification v2.0 (النسخة الأم)"
NOTES_FILE="RELEASES/v1.3.4/notes_ar.md"

# Ensure we're up-to-date
git fetch origin

# Create annotated tag (unsigned). To sign, replace -a with -s and ensure GPG key is configured locally.
git tag -a "$TAG" "$COMMIT_SHA" -m "$RELEASE_TITLE"
git push origin "$TAG"

# Create GitHub release (requires gh authenticated)
if ! command -v gh >/dev/null 2>&1; then
  echo "gh (GitHub CLI) not found. Install and authenticate (gh auth login) to create the release from this script." >&2
  exit 1
fi

echo "Creating GitHub release $TAG..."
gh release create "$TAG" --target "$COMMIT_SHA" \
  --title "$RELEASE_TITLE" \
  --notes-file "$NOTES_FILE" \
  --draft=false

# Upload the master specification as an asset (optional — will not fail the script)
if [ -f "MASTER_SPECIFICATION_v2.0.md" ]; then
  echo "Uploading MASTER_SPECIFICATION_v2.0.md as release asset..."
  gh release upload "$TAG" MASTER_SPECIFICATION_v2.0.md || true
else
  echo "MASTER_SPECIFICATION_v2.0.md not found in repo root; skipping asset upload."
fi

echo "Release $TAG created (or already exists)."
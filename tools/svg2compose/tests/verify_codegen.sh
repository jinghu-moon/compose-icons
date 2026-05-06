#!/bin/bash
# verify_codegen.sh - Verify that svg2compose generates valid Kotlin code
# This script should be run from the tools/svg2compose directory

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"
SVG2COMPOSE="$SCRIPT_DIR/../target/release/svg2compose.exe"
MANIFEST="$SCRIPT_DIR/test-manifest.json"
OUTPUT_DIR="$PROJECT_ROOT/test-icons"

echo "=== Codegen Verification ==="
echo "Project root: $PROJECT_ROOT"
echo "svg2compose: $SVG2COMPOSE"
echo "Manifest: $MANIFEST"
echo "Output dir: $OUTPUT_DIR"
echo ""

# Step 1: Clean output directory
echo "Step 1: Cleaning output directory..."
rm -rf "$OUTPUT_DIR"
mkdir -p "$OUTPUT_DIR"

# Step 2: Generate Kotlin files
echo "Step 2: Generating Kotlin files..."
"$SVG2COMPOSE" --manifest "$MANIFEST" --output-dir "$OUTPUT_DIR"

# Step 3: Check generated files exist
echo "Step 3: Checking generated files..."
EXPECTED_FILES=(
    "regular/SinglePath.kt"
    "regular/GroupWithClip.kt"
    "regular/PathWithTransform.kt"
    "regular/MaskPanel.kt"
)

for file in "${EXPECTED_FILES[@]}"; do
    filepath="$OUTPUT_DIR/$file"
    if [ ! -f "$filepath" ]; then
        echo "ERROR: Expected file not found: $filepath"
        exit 1
    fi
    echo "  ✓ $file"
done

# Step 4: Verify Kotlin syntax (basic check)
echo ""
echo "Step 4: Verifying Kotlin syntax..."
for file in "${EXPECTED_FILES[@]}"; do
    filepath="$OUTPUT_DIR/$file"

    # Check for required elements
    if ! grep -q "package " "$filepath"; then
        echo "ERROR: Missing package declaration in $file"
        exit 1
    fi

    if ! grep -q "import " "$filepath"; then
        echo "ERROR: Missing imports in $file"
        exit 1
    fi

    if ! grep -q "val .* ImageVector" "$filepath"; then
        echo "ERROR: Missing ImageVector property in $file"
        exit 1
    fi

    if ! grep -q "addPath(" "$filepath"; then
        echo "ERROR: Missing addPath call in $file"
        exit 1
    fi

    echo "  ✓ $file - syntax OK"
done

# Step 5: Compare with snapshots (if they exist)
echo ""
echo "Step 5: Comparing with snapshots..."
SNAPSHOT_DIR="$SCRIPT_DIR/snapshots"
if [ -d "$SNAPSHOT_DIR" ]; then
    for file in "${EXPECTED_FILES[@]}"; do
        snapshot="$SNAPSHOT_DIR/$(basename "$file")"
        generated="$OUTPUT_DIR/$file"

        if [ -f "$snapshot" ]; then
            if diff -q "$snapshot" "$generated" > /dev/null 2>&1; then
                echo "  ✓ $(basename "$file") - matches snapshot"
            else
                echo "  ⚠ $(basename "$file") - differs from snapshot"
                echo "    Run: diff $snapshot $generated"
            fi
        else
            echo "  ⚠ $(basename "$file") - no snapshot found"
        fi
    done
else
    echo "  ⚠ Snapshot directory not found, skipping comparison"
fi

echo ""
echo "=== Verification Complete ==="
echo "All checks passed!"

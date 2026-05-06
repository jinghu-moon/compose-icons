#!/bin/bash
# verify_kotlin_syntax.sh - Verify that generated Kotlin files have valid syntax
# This script performs basic syntax checks without requiring a full Kotlin compiler

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
OUTPUT_DIR="${1:-$SCRIPT_DIR/../../test-icons}"

echo "=== Kotlin Syntax Verification ==="
echo "Output directory: $OUTPUT_DIR"
echo ""

# Check if output directory exists
if [ ! -d "$OUTPUT_DIR" ]; then
    echo "ERROR: Output directory not found: $OUTPUT_DIR"
    exit 1
fi

# Find all generated .kt files
KT_FILES=$(find "$OUTPUT_DIR" -name "*.kt" -type f)

if [ -z "$KT_FILES" ]; then
    echo "ERROR: No .kt files found in $OUTPUT_DIR"
    exit 1
fi

echo "Found $(echo "$KT_FILES" | wc -l) Kotlin files"
echo ""

ERRORS=0

for file in $KT_FILES; do
    filename=$(basename "$file")
    rel_path="${file#$OUTPUT_DIR/}"

    # Check 1: Package declaration
    if ! grep -q "^package " "$file"; then
        echo "ERROR: Missing package declaration in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 2: Import statements
    if ! grep -q "^import " "$file"; then
        echo "ERROR: Missing imports in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 3: ImageVector property
    if ! grep -q "val .*\.ImageVector" "$file" && ! grep -q "val .*: ImageVector" "$file"; then
        echo "ERROR: Missing ImageVector property in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 4: addPath call
    if ! grep -q "addPath(" "$file"; then
        echo "ERROR: Missing addPath call in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 5: parseSvgPathData call
    if ! grep -q "parseSvgPathData(" "$file"; then
        echo "ERROR: Missing parseSvgPathData call in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 6: Private cache variable
    if ! grep -q "private var _" "$file"; then
        echo "ERROR: Missing private cache variable in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 7: Balanced braces
    OPEN_BRACES=$(grep -o "{" "$file" | wc -l)
    CLOSE_BRACES=$(grep -o "}" "$file" | wc -l)
    if [ "$OPEN_BRACES" -ne "$CLOSE_BRACES" ]; then
        echo "ERROR: Unbalanced braces in $rel_path (open: $OPEN_BRACES, close: $CLOSE_BRACES)"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 8: No empty addPath calls
    if grep -q "addPath()" "$file"; then
        echo "ERROR: Empty addPath call in $rel_path"
        ERRORS=$((ERRORS + 1))
    fi

    # Check 9: Valid color format
    if grep -q "SolidColor(Color(0x" "$file"; then
        # Check for valid hex color format
        INVALID_COLORS=$(grep -oP "SolidColor\(Color\(0x[0-9A-Fa-f]+\)\)" "$file" | grep -vP "0x[0-9A-Fa-f]{8}" | wc -l)
        if [ "$INVALID_COLORS" -gt 0 ]; then
            echo "WARNING: Potentially invalid color format in $rel_path"
        fi
    fi

    echo "  ✓ $rel_path"
done

echo ""

if [ $ERRORS -gt 0 ]; then
    echo "=== Verification Failed ==="
    echo "Found $ERRORS errors"
    exit 1
else
    echo "=== Verification Complete ==="
    echo "All checks passed!"
fi

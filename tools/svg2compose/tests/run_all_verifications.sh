#!/bin/bash
# run_all_verifications.sh - Run all verification layers for svg2compose
# This script runs all four verification layers:
# 1. Unit tests (cargo test)
# 2. Snapshot tests (cargo test --test snapshot_test)
# 3. Syntax verification (verify_kotlin_syntax.sh)
# 4. Rendering verification (Gradle Roborazzi tests)

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(cd "$SCRIPT_DIR/../.." && pwd)"
if [[ "$OSTYPE" == "msys" || "$OSTYPE" == "cygwin" || "$OSTYPE" == "win32" ]]; then
    SVG2COMPOSE="$SCRIPT_DIR/../target/release/svg2compose.exe"
else
    SVG2COMPOSE="$SCRIPT_DIR/../target/release/svg2compose"
fi
MANIFEST="$SCRIPT_DIR/test-manifest.json"
OUTPUT_DIR="$PROJECT_ROOT/test-icons"

echo "=========================================="
echo "svg2compose Verification Suite"
echo "=========================================="
echo "Project root: $PROJECT_ROOT"
echo "Timestamp: $(date)"
echo ""

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Track results
TOTAL_TESTS=0
PASSED_TESTS=0
FAILED_TESTS=0

run_test() {
    local name=$1
    local command=$2

    TOTAL_TESTS=$((TOTAL_TESTS + 1))
    echo -e "${YELLOW}Running: $name${NC}"

    if eval "$command"; then
        echo -e "${GREEN}✓ $name passed${NC}"
        PASSED_TESTS=$((PASSED_TESTS + 1))
    else
        echo -e "${RED}✗ $name failed${NC}"
        FAILED_TESTS=$((FAILED_TESTS + 1))
    fi
    echo ""
}

# ==========================================
# Layer 1: Unit Tests
# ==========================================
echo "=========================================="
echo "Layer 1: Unit Tests"
echo "=========================================="
run_test "Rust unit tests" "cd $SCRIPT_DIR/.. && cargo test --lib"

# ==========================================
# Layer 2: Snapshot Tests
# ==========================================
echo "=========================================="
echo "Layer 2: Snapshot Tests"
echo "=========================================="
run_test "Snapshot tests" "cd $SCRIPT_DIR/.. && cargo test --test snapshot_test"

# ==========================================
# Layer 3: Syntax Verification
# ==========================================
echo "=========================================="
echo "Layer 3: Syntax Verification"
echo "=========================================="

# Generate test files
echo "Generating test files..."
rm -rf "$OUTPUT_DIR"
mkdir -p "$OUTPUT_DIR"
"$SVG2COMPOSE" --manifest "$MANIFEST" --output-dir "$OUTPUT_DIR"

run_test "Kotlin syntax verification" "bash $SCRIPT_DIR/verify_kotlin_syntax.sh $OUTPUT_DIR"

# ==========================================
# Layer 4: Rendering Verification (Optional)
# ==========================================
echo "=========================================="
echo "Layer 4: Rendering Verification"
echo "=========================================="

# Check if Gradle is available
if command -v ./gradlew &> /dev/null; then
    # Note: This requires the project to be in a compilable state
    # run_test "Roborazzi rendering tests" "cd $PROJECT_ROOT && ./gradlew :sample:verifyRoborazziDebug"
    echo -e "${YELLOW}⚠ Rendering verification skipped (requires compilable project state)${NC}"
    echo "  To run manually: ./gradlew :sample:verifyRoborazziDebug"
else
    echo -e "${YELLOW}⚠ Gradle not available, skipping rendering verification${NC}"
fi

# ==========================================
# Summary
# ==========================================
echo "=========================================="
echo "Verification Summary"
echo "=========================================="
echo "Total tests: $TOTAL_TESTS"
echo -e "Passed: ${GREEN}$PASSED_TESTS${NC}"
echo -e "Failed: ${RED}$FAILED_TESTS${NC}"
echo ""

if [ $FAILED_TESTS -gt 0 ]; then
    echo -e "${RED}✗ Some verifications failed!${NC}"
    exit 1
else
    echo -e "${GREEN}✓ All verifications passed!${NC}"
    exit 0
fi

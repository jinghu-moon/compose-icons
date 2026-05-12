# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added

#### New Icon Libraries (V1.1)
- **Heroicons** integration (1,288 icons, Outline / Solid / Solid16 / Solid20 styles).
- **Iconoir** integration (1,671 icons, Regular / Solid styles).
- **Ionicons** integration (1,357 icons, Filled / Outline / Sharp styles).
- **Bootstrap Icons** integration (2,035 icons, Regular / Fill styles).
- **Boxicons** integration (4,063 icons, Regular / Solid / Logos styles).
- **Simple Icons** integration (3,432 brand icons).
- **Material Design Icons (MDI)** integration (7,447 icons, Default / Outline styles).
- **Carbon Icons** integration (2,521 icons, Default / Filled styles).
- **Octicons** integration (343 icons, Default / Fill styles).
- **Iconsax** integration (4,497 icons, Linear / Outline / Broken / Bold / Bulk / TwoTone styles).

#### New Icon Libraries (V1.2 Flag Libraries)
- **Circle Flags** integration (403 flag icons).
- **Flag Icons** integration (542 flag icons, 1x1 / 4x3 aspect ratios).
- **Country Flags** integration (254 flag icons).

#### Earlier Additions
- **Phosphor Icons** integration (9,072 icons, 6 weight styles).
- **Radix Icons** integration (318 outline icons).
- **Remix Icon** integration (2,710 icons, Line / Fill styles).
- **svg2compose Rust CLI**: Replaced `usvg` + `NormalizedPathParser` + `KotlinFileGenerator` with a single Rust CLI that directly generates `.kt` files.
- **Manifest mode**: Batch processing via JSON manifest for improved performance.
- **Incremental build**: SVG file MD5 hash-based caching to skip unchanged icons.
- **Scanner KSP plugin**: Automatic icon usage detection for R8 keep rule injection.
- **Scanner Gradle plugin**: `composeIconsScanner` DSL for keep rule strategy configuration.
- **compose-icons-bom**: Bill of Materials for version-aligned dependency management.
- **Demo app**: Interactive icon browser with search and style filtering.
- **Web preview**: Vue 3 based icon catalog browser.
- **API snapshot validation**: Custom `dumpApi`/`checkApi` Gradle tasks for public API surface tracking (replaces kotlinx-binary-compatibility-validator which is incompatible with AGP 9.x).

### Changed
- **BREAKING**: `KotlinFileGenerator.kt` deleted — code generation moved to Rust CLI.
- **BREAKING**: `NormalizedPathParser.kt` deleted — SVG parsing moved to Rust CLI.
- `UsvgPipeline` now calls `svg2compose` instead of `usvg`.
- `IconBuilder.addPath` renamed to `addPathData`, accepts SVG path string directly.
- Output path changed from `icons-<source>/src/main/kotlin` to `icons-<source>/src/main/kotlin/composeicons/<source>`.
- `SvgValidator` simplified — only basic unsupported element detection remains.
- `GeneratorReportWriter` JSON output changed to compact format.

### Technical Details
- svg2compose Rust CLI traverses usvg's strongly-typed tree, applies transform bake, handles clipPath extraction and mask skipping.
- GeneratorEngine orchestrates manifest-based batch processing with incremental caching.
- Web-preview adapted for manifest mode data format.
- Kotlin identifier escaping for digit-starting package segments (e.g., `1x1` → `` `1x1` ``).

## [0.1.0] - 2026-05-01

### Added
- Initial release of `compose-icons`.
- Support for Tabler Icons 3.41.1 (Outline and Filled styles).
- Support for Lucide Icons (Outline style).
- **Core Engine**: High-performance pipeline using `usvg` for build-time SVG normalization.
- **R8 Friendly**: Zero runtime overhead with perfect tree-shaking support.
- **Sample App**: Demonstration app with multiple build variants for benchmark reporting.
- **Maven Central**: Standardized publishing pipeline for all icon artifacts.

### Technical Details
- Implemented `UsvgPipeline` for pre-processing SVGs to simplified absolute path data.
- Created `NormalizedPathParser` to handle standardized SVG path commands.
- Established `IconSource` abstraction for decoupled icon library integration.
- Configured automated APK size reporting in the sample module.

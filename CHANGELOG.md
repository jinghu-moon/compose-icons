# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- **Phosphor Icons** integration (~9000 icons, 6 weight styles).
- **Radix Icons** integration (~332 outline icons).
- **Remix Icon** integration (~2000+ icons, line + fill styles).
- **svg2compose Rust CLI**: Replaced `usvg` + `NormalizedPathParser` + `KotlinFileGenerator` with a single Rust CLI that directly generates `.kt` files.
- **Manifest mode**: Batch processing via JSON manifest for improved performance.
- **Incremental build**: SVG file MD5 hash-based caching to skip unchanged icons.

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

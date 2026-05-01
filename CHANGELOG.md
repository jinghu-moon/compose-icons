# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

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

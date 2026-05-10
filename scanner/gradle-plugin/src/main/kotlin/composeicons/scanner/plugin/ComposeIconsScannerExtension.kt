package composeicons.scanner.plugin

import org.gradle.api.provider.Property

/**
 * DSL extension for `composeIconsScanner { … }` configuration block.
 *
 * Example consumer-side usage:
 * ```kotlin
 * composeIconsScanner {
 *     keepRuleStrategy = KeepRuleStrategy.NONE   // rely on R8 defaults
 *     // or KeepRuleStrategy.MEMBERS              // pin getters only
 *     // or KeepRuleStrategy.AGGRESSIVE          // pin entire class (legacy)
 * }
 * ```
 *
 * Default: [KeepRuleStrategy.AGGRESSIVE] for backward compatibility — users
 * who want the most-shrunk dex should explicitly set [KeepRuleStrategy.NONE].
 */
abstract class ComposeIconsScannerExtension {
    abstract val keepRuleStrategy: Property<KeepRuleStrategy>
}

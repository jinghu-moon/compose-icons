package composeicons.demo

import kotlinx.serialization.Serializable

@Serializable
data class IconLibraryData(
    val source: String,
    val upstreamVersion: String = "",
    val total: Int = 0,
    val succeeded: Int = 0,
    val explorerEntries: List<IconEntry> = emptyList(),
)

@Serializable
data class IconEntry(
    val name: String,
    val style: String,
    val kotlinPath: String = "",
    val tags: List<String> = emptyList(),
    val category: String? = null,
)

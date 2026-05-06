package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Submarine: ImageVector
    get() {
        if (_submarine != null) return _submarine!!
        _submarine = tablerOutlineIcon(
            name = "Submarine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11v6h2L6 15.5 9 17h10c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3h-10L6 12.5 5 11h-2")
            addPathData("M17 11 16 8h-5l-1 3")
            addPathData("M13 8v-2c0-.552 .448-1 1-1h1")
        }
        return _submarine!!
    }

private var _submarine: ImageVector? = null

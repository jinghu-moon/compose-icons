package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flag2Off: ImageVector
    get() {
        if (_flag2Off != null) return _flag2Off!!
        _flag2Off = tablerOutlineIcon(
            name = "Flag2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 14h9M18 14h1v-9h-10M5 5v16")
            addPathData("M3 3 21 21")
        }
        return _flag2Off!!
    }

private var _flag2Off: ImageVector? = null

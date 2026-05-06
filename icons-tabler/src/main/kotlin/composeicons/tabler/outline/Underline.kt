package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Underline: ImageVector
    get() {
        if (_underline != null) return _underline!!
        _underline = tablerOutlineIcon(
            name = "Underline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 5v5c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-5")
            addPathData("M5 19h14")
        }
        return _underline!!
    }

private var _underline: ImageVector? = null

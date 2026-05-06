package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Overline: ImageVector
    get() {
        if (_overline != null) return _overline!!
        _overline = tablerOutlineIcon(
            name = "Overline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9v5c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5v-5")
            addPathData("M5 5h14")
        }
        return _overline!!
    }

private var _overline: ImageVector? = null

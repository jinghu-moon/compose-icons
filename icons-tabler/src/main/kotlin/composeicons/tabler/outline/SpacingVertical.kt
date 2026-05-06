package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpacingVertical: ImageVector
    get() {
        if (_spacingVertical != null) return _spacingVertical!!
        _spacingVertical = tablerOutlineIcon(
            name = "SpacingVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20v-2c0-1.105 .895-2 2-2h12c1.105 0 2 .895 2 2v2")
            addPathData("M4 4v2c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-2")
            addPathData("M16 12h-8")
        }
        return _spacingVertical!!
    }

private var _spacingVertical: ImageVector? = null

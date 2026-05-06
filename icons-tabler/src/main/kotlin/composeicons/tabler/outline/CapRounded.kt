package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CapRounded: ImageVector
    get() {
        if (_capRounded != null) return _capRounded!!
        _capRounded = tablerOutlineIcon(
            name = "CapRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6h-9C7.686 6 5 8.686 5 12c0 3.314 2.686 6 6 6h9")
            addPathData("M13 12c0 1.105-.895 2-2 2C9.895 14 9 13.105 9 12c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M13 12h7")
        }
        return _capRounded!!
    }

private var _capRounded: ImageVector? = null

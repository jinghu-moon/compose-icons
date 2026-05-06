package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CubeSend: ImageVector
    get() {
        if (_cubeSend != null) return _cubeSend!!
        _cubeSend = tablerOutlineIcon(
            name = "CubeSend",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12.5l-5-3 5-3 5 3v5.5l-5 3v-5.5")
            addPathData("M11 9.5v5.5l5 3")
            addPathData("M16 12.545 21 9.515")
            addPathData("M7 9h-5")
            addPathData("M7 12h-3")
            addPathData("M7 15h-1")
        }
        return _cubeSend!!
    }

private var _cubeSend: ImageVector? = null

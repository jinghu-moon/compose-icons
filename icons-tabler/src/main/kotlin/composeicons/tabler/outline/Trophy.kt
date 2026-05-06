package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = tablerOutlineIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 17v4")
            addPathData("M7 4h10")
            addPathData("M17 4v8c0 2.761-2.239 5-5 5C9.239 17 7 14.761 7 12v-8")
            addPathData("M3 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 7.895 6.105 7 5 7 3.895 7 3 7.895 3 9")
            addPathData("M17 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 7.895 20.105 7 19 7c-1.105 0-2 .895-2 2")
        }
        return _trophy!!
    }

private var _trophy: ImageVector? = null

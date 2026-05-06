package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapCode: ImageVector
    get() {
        if (_mapCode != null) return _mapCode!!
        _mapCode = tablerOutlineIcon(
            name = "MapCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 18 9 17 3 20v-13L9 4l6 3L21 4v9")
            addPathData("M9 4v13")
            addPathData("M15 7v6.5")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _mapCode!!
    }

private var _mapCode: ImageVector? = null

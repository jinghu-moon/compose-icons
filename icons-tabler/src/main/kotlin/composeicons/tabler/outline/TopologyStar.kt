package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TopologyStar: ImageVector
    get() {
        if (_topologyStar != null) return _topologyStar!!
        _topologyStar = tablerOutlineIcon(
            name = "TopologyStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 18C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M20 6C20 4.895 19.105 4 18 4c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M8 6C8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6c0 1.105 .895 2 2 2C7.105 8 8 7.105 8 6")
            addPathData("M20 18c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M14 12c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M7.5 7.5l3 3")
            addPathData("M7.5 16.5l3-3")
            addPathData("M13.5 13.5l3 3")
            addPathData("M16.5 7.5l-3 3")
        }
        return _topologyStar!!
    }

private var _topologyStar: ImageVector? = null

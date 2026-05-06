package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapBolt: ImageVector
    get() {
        if (_mapBolt != null) return _mapBolt!!
        _mapBolt = tablerOutlineIcon(
            name = "MapBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 19 9 17 3 20v-13L9 4l6 3L21 4v8.5")
            addPathData("M9 4v13")
            addPathData("M15 7v7.5")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _mapBolt!!
    }

private var _mapBolt: ImageVector? = null

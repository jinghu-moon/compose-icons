package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersSelectedBottom: ImageVector
    get() {
        if (_layersSelectedBottom != null) return _layersSelectedBottom!!
        _layersSelectedBottom = tablerOutlineIcon(
            name = "LayersSelectedBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14.5l4-4")
            addPathData("M9.496 20l4.004-4L9.496 20")
            addPathData("M4.586 19.414 8.5 15.5")
            addPathData("M8 6C8 4.895 8.895 4 10 4h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-8C8.895 16 8 15.105 8 14v-8")
            addPathData("M16 16v2c0 1.105-.895 2-2 2h-8C4.895 20 4 19.105 4 18v-8C4 8.895 4.895 8 6 8h2")
        }
        return _layersSelectedBottom!!
    }

private var _layersSelectedBottom: ImageVector? = null

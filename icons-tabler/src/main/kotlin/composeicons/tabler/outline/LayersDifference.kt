package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersDifference: ImageVector
    get() {
        if (_layersDifference != null) return _layersDifference!!
        _layersDifference = tablerOutlineIcon(
            name = "LayersDifference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16v2c0 1.105-.895 2-2 2h-8C4.895 20 4 19.105 4 18v-8C4 8.895 4.895 8 6 8h2v-2C8 4.895 8.895 4 10 4h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2")
            addPathData("M10 8h-2v2")
            addPathData("M8 14v2h2")
            addPathData("M14 8h2v2")
            addPathData("M16 14v2h-2")
        }
        return _layersDifference!!
    }

private var _layersDifference: ImageVector? = null

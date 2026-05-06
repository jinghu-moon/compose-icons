package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hexagons: ImageVector
    get() {
        if (_hexagons != null) return _hexagons!!
        _hexagons = tablerOutlineIcon(
            name = "Hexagons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18v-5L8 11l4 2v5L8 20 4 18")
            addPathData("M8 11v-5L12 4l4 2v5")
            addPathData("M12 13l4-2 4 2v5l-4 2L12 18")
        }
        return _hexagons!!
    }

private var _hexagons: ImageVector? = null

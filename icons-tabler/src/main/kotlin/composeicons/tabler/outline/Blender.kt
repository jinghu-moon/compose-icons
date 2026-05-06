package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blender: ImageVector
    get() {
        if (_blender != null) return _blender!!
        _blender = tablerOutlineIcon(
            name = "Blender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 10h-3C5.448 10 5 9.552 5 9v-4C5 4.448 5.448 4 6 4h10.802c.297-0 .578 .132 .768 .359 .19 .228 .269 .528 .216 .82L16 15")
            addPathData("M8 4l2 11")
            addPathData("M11 15h4c1.657 0 3 1.343 3 3v2c0 .552-.448 1-1 1h-8C8.448 21 8 20.552 8 20v-2c0-1.657 1.343-3 3-3")
            addPathData("M12 4v-1h2v1")
            addPathData("M13 18v.01")
        }
        return _blender!!
    }

private var _blender: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LayersLinked: ImageVector
    get() {
        if (_layersLinked != null) return _layersLinked!!
        _layersLinked = tablerOutlineIcon(
            name = "LayersLinked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 8.268c.619 .357 1 1.017 1 1.732v8c0 1.105-.895 2-2 2h-8C8.895 20 8 19.105 8 18v-8C8 8.895 8.895 8 10 8h3")
            addPathData("M5 15.734C4.381 15.376 3.999 14.715 4 14v-8C4 4.895 4.895 4 6 4h8c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-3")
        }
        return _layersLinked!!
    }

private var _layersLinked: ImageVector? = null

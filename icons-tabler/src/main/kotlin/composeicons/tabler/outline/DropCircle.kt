package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropCircle: ImageVector
    get() {
        if (_dropCircle != null) return _dropCircle!!
        _dropCircle = tablerOutlineIcon(
            name = "DropCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.07 15.34c1.115 .88 2.74 .88 3.855 0 1.115-.88 1.398-2.388 .671-3.575L12 8 9.398 11.765c-.726 1.187-.443 2.694 .672 3.575")
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
        }
        return _dropCircle!!
    }

private var _dropCircle: ImageVector? = null

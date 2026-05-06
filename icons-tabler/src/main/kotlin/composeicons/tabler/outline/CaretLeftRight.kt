package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CaretLeftRight: ImageVector
    get() {
        if (_caretLeftRight != null) return _caretLeftRight!!
        _caretLeftRight = tablerOutlineIcon(
            name = "CaretLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 18l6-6L14 6v12")
            addPathData("M10 18 4 12 10 6v12")
        }
        return _caretLeftRight!!
    }

private var _caretLeftRight: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignTopLeft: ImageVector
    get() {
        if (_boxAlignTopLeft != null) return _boxAlignTopLeft!!
        _boxAlignTopLeft = tablerOutlineIcon(
            name = "BoxAlignTopLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5v5c0 .552-.448 1-1 1h-5C4.448 11 4 10.552 4 10v-5C4 4.448 4.448 4 5 4h5c.552 0 1 .448 1 1")
            addPathData("M15 4h-.01")
            addPathData("M20 4h-.01")
            addPathData("M20 9h-.01")
            addPathData("M20 15h-.01")
            addPathData("M4 15h-.01")
            addPathData("M20 20h-.01")
            addPathData("M15 20h-.01")
            addPathData("M9 20h-.01")
            addPathData("M4 20h-.01")
        }
        return _boxAlignTopLeft!!
    }

private var _boxAlignTopLeft: ImageVector? = null

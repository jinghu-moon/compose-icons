package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignBottomLeft: ImageVector
    get() {
        if (_boxAlignBottomLeft != null) return _boxAlignBottomLeft!!
        _boxAlignBottomLeft = tablerOutlineIcon(
            name = "BoxAlignBottomLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 13h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-5C4.448 20 4 19.552 4 19v-5c0-.552 .448-1 1-1")
            addPathData("M4 9v.01")
            addPathData("M4 4v.01")
            addPathData("M9 4v.01")
            addPathData("M15 4v.01")
            addPathData("M15 20v.01")
            addPathData("M20 4v.01")
            addPathData("M20 9v.01")
            addPathData("M20 15v.01")
            addPathData("M20 20v.01")
        }
        return _boxAlignBottomLeft!!
    }

private var _boxAlignBottomLeft: ImageVector? = null

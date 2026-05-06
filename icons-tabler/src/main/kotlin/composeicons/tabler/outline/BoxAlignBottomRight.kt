package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignBottomRight: ImageVector
    get() {
        if (_boxAlignBottomRight != null) return _boxAlignBottomRight!!
        _boxAlignBottomRight = tablerOutlineIcon(
            name = "BoxAlignBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 13h-5c-.552 0-1 .448-1 1v5c0 .552 .448 1 1 1h5c.552 0 1-.448 1-1v-5c0-.552-.448-1-1-1")
            addPathData("M20 9v.01")
            addPathData("M20 4v.01")
            addPathData("M15 4v.01")
            addPathData("M9 4v.01")
            addPathData("M9 20v.01")
            addPathData("M4 4v.01")
            addPathData("M4 9v.01")
            addPathData("M4 15v.01")
            addPathData("M4 20v.01")
        }
        return _boxAlignBottomRight!!
    }

private var _boxAlignBottomRight: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignTopRight: ImageVector
    get() {
        if (_boxAlignTopRight != null) return _boxAlignTopRight!!
        _boxAlignTopRight = tablerOutlineIcon(
            name = "BoxAlignTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 11.01h-5c-.552 0-1-.448-1-1v-5c0-.552 .448-1 1-1h5c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1")
            addPathData("M20 15.01v-.01")
            addPathData("M20 20.01v-.01")
            addPathData("M15 20.01v-.01")
            addPathData("M9 20.01v-.01")
            addPathData("M9 4.01v-.01")
            addPathData("M4 20.01v-.01")
            addPathData("M4 15.01v-.01")
            addPathData("M4 9.01v-.01")
            addPathData("M4 4.01v-.01")
        }
        return _boxAlignTopRight!!
    }

private var _boxAlignTopRight: ImageVector? = null

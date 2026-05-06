package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignRight: ImageVector
    get() {
        if (_boxAlignRight != null) return _boxAlignRight!!
        _boxAlignRight = tablerOutlineIcon(
            name = "BoxAlignRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.998 20.003v-16h5c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-5")
            addPathData("M8.998 20.003h.01")
            addPathData("M3.997 20.003h.011")
            addPathData("M3.997 15.002h.011")
            addPathData("M3.997 9.002h.011")
            addPathData("M3.997 4.002h.011")
            addPathData("M8.998 4.002h.01")
        }
        return _boxAlignRight!!
    }

private var _boxAlignRight: ImageVector? = null

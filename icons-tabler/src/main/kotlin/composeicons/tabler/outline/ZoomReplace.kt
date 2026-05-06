package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomReplace: ImageVector
    get() {
        if (_zoomReplace != null) return _zoomReplace!!
        _zoomReplace = tablerOutlineIcon(
            name = "ZoomReplace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 21 15 15")
            addPathData("M3.291 8C4.005 5.607 5.94 3.776 8.368 3.194c3.467-.839 7.012 1.055 8.242 4.403")
            addPathData("M17 4v4h-4")
            addPathData("M16.705 12c-.716 2.389-2.649 4.217-5.074 4.798C8.164 17.637 4.62 15.743 3.39 12.395")
            addPathData("M3 16v-4h4")
        }
        return _zoomReplace!!
    }

private var _zoomReplace: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZoomQuestion: ImageVector
    get() {
        if (_zoomQuestion != null) return _zoomQuestion!!
        _zoomQuestion = tablerOutlineIcon(
            name = "ZoomQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C17 6.134 13.866 3 10 3 6.134 3 3 6.134 3 10")
            addPathData("M21 21 15 15")
            addPathData("M10 13v.01")
            addPathData("M10 10c.694 0 1.297-.475 1.459-1.149 .162-.674-.159-1.372-.777-1.687C10.064 6.849 9.31 6.998 8.86 7.526")
        }
        return _zoomQuestion!!
    }

private var _zoomQuestion: ImageVector? = null

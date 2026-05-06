package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellCheck: ImageVector
    get() {
        if (_bellCheck != null) return _bellCheck!!
        _bellCheck = tablerOutlineIcon(
            name = "BellCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 17h-7.5c1.105-.626 1.847-1.739 2-3v-3C6.121 8.414 7.66 6.107 10 5c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 2.34 1.107 3.879 3.414 4 6v3c.016 .129 .037 .256 .065 .382")
            addPathData("M9 17v1c-0 1.465 1.057 2.716 2.502 2.959")
            addPathData("M15 19l2 2 4-4")
        }
        return _bellCheck!!
    }

private var _bellCheck: ImageVector? = null

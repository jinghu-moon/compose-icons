package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Disabled2: ImageVector
    get() {
        if (_disabled2 != null) return _disabled2!!
        _disabled2 = tablerOutlineIcon(
            name = "Disabled2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C19 4.895 18.105 4 17 4c-1.105 0-2 .895-2 2")
            addPathData("M9 11C6.631 10.959 4.558 12.587 4.036 14.899c-.522 2.312 .651 4.672 2.808 5.653 2.157 .981 4.707 .312 6.105-1.601")
            addPathData("M19 20 15 15h-4l3-5L10 7 6 8")
        }
        return _disabled2!!
    }

private var _disabled2: ImageVector? = null

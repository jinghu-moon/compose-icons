package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeCheck: ImageVector
    get() {
        if (_eyeCheck != null) return _eyeCheck!!
        _eyeCheck = tablerOutlineIcon(
            name = "EyeCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M11.102 17.957C7.898 17.65 5.198 15.663 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6-.21 .351-.431 .695-.663 1.032")
            addPathData("M15 19l2 2 4-4")
        }
        return _eyeCheck!!
    }

private var _eyeCheck: ImageVector? = null

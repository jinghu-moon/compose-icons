package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeExclamation: ImageVector
    get() {
        if (_eyeExclamation != null) return _eyeExclamation!!
        _eyeExclamation = tablerOutlineIcon(
            name = "EyeExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M15.03 17.478c-.972 .351-1.997 .527-3.03 .522C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6-.084 .141-.17 .28-.258 .419")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _eyeExclamation!!
    }

private var _eyeExclamation: ImageVector? = null

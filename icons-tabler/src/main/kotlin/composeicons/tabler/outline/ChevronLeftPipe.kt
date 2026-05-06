package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronLeftPipe: ImageVector
    get() {
        if (_chevronLeftPipe != null) return _chevronLeftPipe!!
        _chevronLeftPipe = tablerOutlineIcon(
            name = "ChevronLeftPipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 6v12")
            addPathData("M18 6l-6 6 6 6")
        }
        return _chevronLeftPipe!!
    }

private var _chevronLeftPipe: ImageVector? = null

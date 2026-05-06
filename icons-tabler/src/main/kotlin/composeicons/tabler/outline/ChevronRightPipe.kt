package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronRightPipe: ImageVector
    get() {
        if (_chevronRightPipe != null) return _chevronRightPipe!!
        _chevronRightPipe = tablerOutlineIcon(
            name = "ChevronRightPipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 6l6 6L6 18")
            addPathData("M17 5v13")
        }
        return _chevronRightPipe!!
    }

private var _chevronRightPipe: ImageVector? = null

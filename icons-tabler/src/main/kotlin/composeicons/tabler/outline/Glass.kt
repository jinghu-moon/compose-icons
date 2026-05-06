package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Glass: ImageVector
    get() {
        if (_glass != null) return _glass!!
        _glass = tablerOutlineIcon(
            name = "Glass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 16v5")
            addPathData("M17 5l1 6c0 3.012-2.686 5-6 5C8.686 16 6 14.012 6 11L7 5")
            addPathData("M7 5c0 1.105 2.239 2 5 2 2.761 0 5-.895 5-2C17 3.895 14.761 3 12 3 9.239 3 7 3.895 7 5")
        }
        return _glass!!
    }

private var _glass: ImageVector? = null

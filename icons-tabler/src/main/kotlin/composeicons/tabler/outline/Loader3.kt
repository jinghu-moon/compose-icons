package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Loader3: ImageVector
    get() {
        if (_loader3 != null) return _loader3!!
        _loader3 = tablerOutlineIcon(
            name = "Loader3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3")
            addPathData("M17 12C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12c0 2.761 2.239 5 5 5")
        }
        return _loader3!!
    }

private var _loader3: ImageVector? = null

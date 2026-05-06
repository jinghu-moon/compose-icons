package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRampLeft3: ImageVector
    get() {
        if (_arrowRampLeft3 != null) return _arrowRampLeft3!!
        _arrowRampLeft3 = tablerOutlineIcon(
            name = "ArrowRampLeft3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 3v6")
            addPathData("M8 16 4 12 8 8")
            addPathData("M18 21v-6c0-1.657-1.343-3-3-3h-11")
        }
        return _arrowRampLeft3!!
    }

private var _arrowRampLeft3: ImageVector? = null

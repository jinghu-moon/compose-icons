package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRampRight3: ImageVector
    get() {
        if (_arrowRampRight3 != null) return _arrowRampRight3!!
        _arrowRampRight3 = tablerOutlineIcon(
            name = "ArrowRampRight3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3v6")
            addPathData("M16 16l4-4L16 8")
            addPathData("M6 21v-6C6 13.343 7.343 12 9 12h11")
        }
        return _arrowRampRight3!!
    }

private var _arrowRampRight3: ImageVector? = null

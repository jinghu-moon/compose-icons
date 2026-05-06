package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacTaurus: ImageVector
    get() {
        if (_zodiacTaurus != null) return _zodiacTaurus!!
        _zodiacTaurus = tablerOutlineIcon(
            name = "ZodiacTaurus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6")
            addPathData("M6 15c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 11.686 15.314 9 12 9 8.686 9 6 11.686 6 15")
        }
        return _zodiacTaurus!!
    }

private var _zodiacTaurus: ImageVector? = null

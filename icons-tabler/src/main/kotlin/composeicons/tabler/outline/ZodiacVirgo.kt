package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacVirgo: ImageVector
    get() {
        if (_zodiacVirgo != null) return _zodiacVirgo!!
        _zodiacVirgo = tablerOutlineIcon(
            name = "ZodiacVirgo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 4c1.105 0 2 .895 2 2v9")
            addPathData("M5 6C5 4.895 5.895 4 7 4c1.105 0 2 .895 2 2v9")
            addPathData("M9 6C9 4.895 9.895 4 11 4c1.105 0 2 .895 2 2v10c0 2.761 3.134 5 7 5")
            addPathData("M12 21c3.866 0 7-2.239 7-5v-2c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _zodiacVirgo!!
    }

private var _zodiacVirgo: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = tablerOutlineIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C9 7.895 8.105 7 7 7 5.895 7 5 7.895 5 9")
            addPathData("M22 17v-3h-20")
            addPathData("M2 8v9")
            addPathData("M12 14h10v-2C22 10.343 20.657 9 19 9h-7v5")
        }
        return _bed!!
    }

private var _bed: ImageVector? = null

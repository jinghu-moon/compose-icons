package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BedOff: ImageVector
    get() {
        if (_bedOff != null) return _bedOff!!
        _bedOff = tablerOutlineIcon(
            name = "BedOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7C5.895 7 5 7.895 5 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2")
            addPathData("M22 17v-3h-4M14 14h-12")
            addPathData("M2 8v9")
            addPathData("M12 12v2h2M18 14h4v-2C22 10.343 20.657 9 19 9h-6")
            addPathData("M3 3 21 21")
        }
        return _bedOff!!
    }

private var _bedOff: ImageVector? = null

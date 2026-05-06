package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EggCracked: ImageVector
    get() {
        if (_eggCracked != null) return _eggCracked!!
        _eggCracked = tablerOutlineIcon(
            name = "EggCracked",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 14.083c0 4.154-2.966 6.74-7 6.917C7.8 21 5 18.237 5 14.083 5 8.545 8.5 2.993 12 3c3.5 .007 7 5.545 7 11.083")
            addPathData("M12 3 10.5 8 14 10.5 12 14")
        }
        return _eggCracked!!
    }

private var _eggCracked: ImageVector? = null

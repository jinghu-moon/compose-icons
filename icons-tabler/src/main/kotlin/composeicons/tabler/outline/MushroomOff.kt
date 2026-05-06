package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MushroomOff: ImageVector
    get() {
        if (_mushroomOff != null) return _mushroomOff!!
        _mushroomOff = tablerOutlineIcon(
            name = "MushroomOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.874 5.89C4.659 7.354 3.996 9.198 4 11.1c0 .497 .403 .9 .9 .9h7.1M16 12h3.1c.497 0 .9-.403 .9-.9C20 6.626 16.418 3 12 3 10.57 3 9.226 3.38 8.064 4.047")
            addPathData("M10 12v7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-5")
            addPathData("M3 3 21 21")
        }
        return _mushroomOff!!
    }

private var _mushroomOff: ImageVector? = null

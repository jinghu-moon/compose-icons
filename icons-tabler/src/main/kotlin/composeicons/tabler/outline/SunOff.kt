package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunOff: ImageVector
    get() {
        if (_sunOff != null) return _sunOff!!
        _sunOff = tablerOutlineIcon(
            name = "SunOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M16 12C16 9.791 14.209 8 12 8M9.166 9.177c-1.561 1.563-1.56 4.096 .003 5.657 1.563 1.561 4.096 1.56 5.657-.003")
            addPathData("M3 12h1M12 3v1M20 12h1M12 20v1M5.6 5.6l.7 .7M18.4 5.6l-.7 .7M17.7 17.7l.7 .7M6.3 17.7l-.7 .7")
        }
        return _sunOff!!
    }

private var _sunOff: ImageVector? = null

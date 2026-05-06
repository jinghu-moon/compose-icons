package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WindmillOff: ImageVector
    get() {
        if (_windmillOff != null) return _windmillOff!!
        _windmillOff = tablerOutlineIcon(
            name = "WindmillOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.061 11.06C16.241 10.236 17 8.95 17 7.5 17 5.01 14.76 3 12 3v5")
            addPathData("M12 12c0 2.76 2.01 5 4.5 5 .166 0 .33-.01 .49-.03M19.614 15.61C20.47 14.7 21 13.42 21 12h-5")
            addPathData("M12 12C9.24 12 7 14.01 7 16.5 7 18.99 9.24 21 12 21v-9")
            addPathData("M6.981 7.033C4.737 7.318 3 9.435 3 12h9")
            addPathData("M3 3 21 21")
        }
        return _windmillOff!!
    }

private var _windmillOff: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrophyOff: ImageVector
    get() {
        if (_trophyOff != null) return _trophyOff!!
        _trophyOff = tablerOutlineIcon(
            name = "TrophyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 21h8")
            addPathData("M12 17v4")
            addPathData("M8 4h9")
            addPathData("M17 4v8c0 .31-.028 .612-.082 .905M15.534 15.537c-1.43 1.429-3.581 1.856-5.448 1.082C8.218 15.845 7 14.022 7 12v-5")
            addPathData("M3 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 7.895 6.105 7 5 7 3.895 7 3 7.895 3 9")
            addPathData("M17 9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C21 7.895 20.105 7 19 7c-1.105 0-2 .895-2 2")
            addPathData("M3 3 21 21")
        }
        return _trophyOff!!
    }

private var _trophyOff: ImageVector? = null

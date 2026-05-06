package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadphonesOff: ImageVector
    get() {
        if (_headphonesOff != null) return _headphonesOff!!
        _headphonesOff = tablerOutlineIcon(
            name = "HeadphonesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M4 15c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C4.895 20 4 19.105 4 18v-3")
            addPathData("M17 13h1c1.105 0 2 .895 2 2v1M19.411 19.417C19.05 19.777 18.551 20 18 20h-1c-1.105 0-2-.895-2-2v-3")
            addPathData("M4 15v-3C4 9.79 4.896 7.79 6.344 6.342M8.713 4.704c2.476-1.116 5.349-.899 7.63 .575C18.624 6.753 20.001 9.284 20 12v3")
        }
        return _headphonesOff!!
    }

private var _headphonesOff: ImageVector? = null

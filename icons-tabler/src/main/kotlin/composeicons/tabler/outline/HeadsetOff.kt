package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadsetOff: ImageVector
    get() {
        if (_headsetOff != null) return _headsetOff!!
        _headsetOff = tablerOutlineIcon(
            name = "HeadsetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 14v-3C4 9.047 4.7 7.258 5.862 5.87M8.044 4.045c2.477-1.409 5.516-1.394 7.979 .038C18.486 5.516 20.001 8.151 20 11v3")
            addPathData("M18 19c0 1.657-2.686 3-6 3")
            addPathData("M4 14c0-1.105 .895-2 2-2h1c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C4.895 19 4 18.105 4 17v-3")
            addPathData("M16.169 12.18C16.422 12.065 16.703 12 17 12h1c1.105 0 2 .895 2 2v2M18.817 18.826C18.567 18.938 18.291 19 18 19h-1c-1.105 0-2-.895-2-2v-2")
            addPathData("M3 3 21 21")
        }
        return _headsetOff!!
    }

private var _headsetOff: ImageVector? = null

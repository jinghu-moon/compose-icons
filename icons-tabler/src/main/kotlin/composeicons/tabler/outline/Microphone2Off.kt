package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microphone2Off: ImageVector
    get() {
        if (_microphone2Off != null) return _microphone2Off!!
        _microphone2Off = tablerOutlineIcon(
            name = "Microphone2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.908 12.917c2.485-.459 4.237-2.701 4.081-5.223C20.834 5.171 18.822 3.161 16.299 3.009 13.776 2.858 11.537 4.612 11.081 7.098")
            addPathData("M10.116 10.125 3.587 17.585c-.781 .781-.782 2.047-.001 2.829 .781 .781 2.047 .782 2.829 .002l7.461-6.529")
            addPathData("M3 3 21 21")
        }
        return _microphone2Off!!
    }

private var _microphone2Off: ImageVector? = null

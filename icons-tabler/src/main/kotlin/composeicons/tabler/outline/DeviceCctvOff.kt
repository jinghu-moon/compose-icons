package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceCctvOff: ImageVector
    get() {
        if (_deviceCctvOff != null) return _deviceCctvOff!!
        _deviceCctvOff = tablerOutlineIcon(
            name = "DeviceCctvOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7h-3C3.448 7 3 6.552 3 6v-2c0-.275 .11-.523 .29-.704M7 3h13c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-9")
            addPathData("M10.36 10.35c-1.622 .73-2.567 2.444-2.318 4.206 .248 1.761 1.63 3.147 3.391 3.401 1.761 .253 3.477-.686 4.212-2.306")
            addPathData("M19 7v7c0 .321-.022 .637-.064 .947M17.841 17.86c-1.703 2.579-4.896 3.736-7.856 2.846C7.025 19.816 4.999 17.091 5 14v-7")
            addPathData("M12 14h.01")
            addPathData("M3 3 21 21")
        }
        return _deviceCctvOff!!
    }

private var _deviceCctvOff: ImageVector? = null

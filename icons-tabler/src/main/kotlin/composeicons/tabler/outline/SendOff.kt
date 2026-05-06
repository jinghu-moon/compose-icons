package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SendOff: ImageVector
    get() {
        if (_sendOff != null) return _sendOff!!
        _sendOff = tablerOutlineIcon(
            name = "SendOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 14l2-2M14 10 21 3")
            addPathData("M10.718 6.713 21 3 17.285 13.289 16.222 16.23 14.5 21c-.09 .196-.285 .321-.5 .321-.215 0-.41-.125-.5-.321L10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L7.772 7.777")
            addPathData("M3 3 21 21")
        }
        return _sendOff!!
    }

private var _sendOff: ImageVector? = null

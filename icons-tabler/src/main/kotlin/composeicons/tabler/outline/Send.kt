package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Send: ImageVector
    get() {
        if (_send != null) return _send!!
        _send = tablerOutlineIcon(
            name = "Send",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 14 21 3")
            addPathData("M21 3 14.5 21c-.09 .196-.285 .321-.5 .321-.215 0-.41-.125-.5-.321L10 14 3 10.5C2.804 10.41 2.679 10.215 2.679 10c0-.215 .125-.41 .321-.5L21 3")
        }
        return _send!!
    }

private var _send: ImageVector? = null

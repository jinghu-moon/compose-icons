package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Message2Bolt: ImageVector
    get() {
        if (_message2Bolt != null) return _message2Bolt!!
        _message2Bolt = tablerOutlineIcon(
            name = "Message2Bolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M13 20l-1 1L9 18h-3C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v5.5")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _message2Bolt!!
    }

private var _message2Bolt: ImageVector? = null

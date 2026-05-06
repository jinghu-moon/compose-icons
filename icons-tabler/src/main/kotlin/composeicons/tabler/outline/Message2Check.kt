package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Message2Check: ImageVector
    get() {
        if (_message2Check != null) return _message2Check!!
        _message2Check = tablerOutlineIcon(
            name = "Message2Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M12 21 11 20 9 18h-3C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v6")
            addPathData("M15 19l2 2 4-4")
        }
        return _message2Check!!
    }

private var _message2Check: ImageVector? = null

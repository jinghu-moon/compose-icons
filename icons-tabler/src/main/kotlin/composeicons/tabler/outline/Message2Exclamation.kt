package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Message2Exclamation: ImageVector
    get() {
        if (_message2Exclamation != null) return _message2Exclamation!!
        _message2Exclamation = tablerOutlineIcon(
            name = "Message2Exclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M15 18l-3 3L9 18h-3C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v5.5")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _message2Exclamation!!
    }

private var _message2Exclamation: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IceSkating: ImageVector
    get() {
        if (_iceSkating != null) return _iceSkating!!
        _iceSkating = tablerOutlineIcon(
            name = "IceSkating",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.905 5h3.418c.409 0 .776 .249 .928 .629l1.143 2.856c.378 .945 1.209 1.634 2.207 1.83l4.717 .926c.977 .192 1.682 1.049 1.682 2.045v.714c0 .552-.448 1-1 1h-13.895c-.283 .001-.554-.118-.745-.327-.191-.21-.283-.491-.255-.773L4.905 5.9c.052-.513 .485-.903 1-.9")
            addPathData("M3 19h17c.552 0 1-.448 1-1")
            addPathData("M9 15v4")
            addPathData("M15 15v4")
        }
        return _iceSkating!!
    }

private var _iceSkating: ImageVector? = null

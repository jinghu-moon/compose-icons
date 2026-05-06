package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RollerSkating: ImageVector
    get() {
        if (_rollerSkating != null) return _rollerSkating!!
        _rollerSkating = tablerOutlineIcon(
            name = "RollerSkating",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.905 5h3.418c.409 0 .776 .249 .928 .629l1.143 2.856c.378 .945 1.209 1.634 2.207 1.83l4.717 .926c.977 .192 1.682 1.049 1.682 2.045v.714c0 .552-.448 1-1 1h-13.895c-.283 .001-.554-.118-.745-.327-.191-.21-.283-.491-.255-.773L4.905 5.9c.052-.513 .485-.903 1-.9")
            addPathData("M6 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C10 15.895 9.105 15 8 15c-1.105 0-2 .895-2 2")
            addPathData("M14 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _rollerSkating!!
    }

private var _rollerSkating: ImageVector? = null

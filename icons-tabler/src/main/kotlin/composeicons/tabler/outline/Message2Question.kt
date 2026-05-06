package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Message2Question: ImageVector
    get() {
        if (_message2Question != null) return _message2Question!!
        _message2Question = tablerOutlineIcon(
            name = "Message2Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h8")
            addPathData("M8 13h6")
            addPathData("M14.5 18.5 12 21 9 18h-3C4.343 18 3 16.657 3 15v-8C3 5.343 4.343 4 6 4h12c1.657 0 3 1.343 3 3v4.5")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _message2Question!!
    }

private var _message2Question: ImageVector? = null

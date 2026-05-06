package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EditCircle: ImageVector
    get() {
        if (_editCircle != null) return _editCircle!!
        _editCircle = tablerOutlineIcon(
            name = "EditCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15 20.385 6.585c.82-.82 .82-2.15 0-2.97-.82-.82-2.15-.82-2.97 0L9 12v3h3")
            addPathData("M16 5l3 3")
            addPathData("M9 7.07C5.36 7.589 2.742 10.834 3.005 14.501 3.269 18.168 6.324 21.007 10 21c3.48 0 6.432-2.556 6.929-6")
        }
        return _editCircle!!
    }

private var _editCircle: ImageVector? = null

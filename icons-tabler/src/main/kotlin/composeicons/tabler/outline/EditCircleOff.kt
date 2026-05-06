package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EditCircleOff: ImageVector
    get() {
        if (_editCircleOff != null) return _editCircleOff!!
        _editCircleOff = tablerOutlineIcon(
            name = "EditCircleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.507 10.498 9 12v3h3l1.493-1.498M15.493 11.492 20.383 6.585c.82-.82 .82-2.15 0-2.97-.82-.82-2.15-.82-2.97 0L12.5 8.511")
            addPathData("M16 5l3 3")
            addPathData("M7.476 7.471C4.332 8.687 2.501 11.97 3.119 15.284 3.737 18.597 6.629 21 10 21c2.892 .001 5.486-1.777 6.53-4.474")
            addPathData("M3 3 21 21")
        }
        return _editCircleOff!!
    }

private var _editCircleOff: ImageVector? = null

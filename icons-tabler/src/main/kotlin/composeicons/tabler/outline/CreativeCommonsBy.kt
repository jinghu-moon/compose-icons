package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreativeCommonsBy: ImageVector
    get() {
        if (_creativeCommonsBy != null) return _creativeCommonsBy!!
        _creativeCommonsBy = tablerOutlineIcon(
            name = "CreativeCommonsBy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M11 7c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 6.448 12.552 6 12 6c-.552 0-1 .448-1 1")
            addPathData("M9 13v-1c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-.5L13 18h-2l-.5-4h-.5C9.448 14 9 13.552 9 13")
        }
        return _creativeCommonsBy!!
    }

private var _creativeCommonsBy: ImageVector? = null

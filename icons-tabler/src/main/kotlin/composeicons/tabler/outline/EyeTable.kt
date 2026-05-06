package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeTable: ImageVector
    get() {
        if (_eyeTable != null) return _eyeTable!!
        _eyeTable = tablerOutlineIcon(
            name = "EyeTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 18h-.011")
            addPathData("M12 18h-.011")
            addPathData("M16 18h-.011")
            addPathData("M4 3h16")
            addPathData("M5 3v17c0 .552 .448 1 1 1h12c.552 0 1-.448 1-1v-17")
            addPathData("M14 7h-4")
            addPathData("M9 15h1")
            addPathData("M14 15h1")
            addPathData("M12 11v-4")
        }
        return _eyeTable!!
    }

private var _eyeTable: ImageVector? = null

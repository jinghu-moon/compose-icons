package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = tablerOutlineIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8 3 12l4 4")
            addPathData("M17 8l4 4-4 4")
            addPathData("M14 4 10 20")
        }
        return _code!!
    }

private var _code: ImageVector? = null

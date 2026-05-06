package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ruler3: ImageVector
    get() {
        if (_ruler3 != null) return _ruler3!!
        _ruler3 = tablerOutlineIcon(
            name = "Ruler3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.875 8C20.496 8 21 8.512 21 9.143v5.714C21 15.488 20.496 16 19.875 16h-15.875C3.448 16 3 15.552 3 15v-5.857C3 8.512 3.504 8 4.125 8h15.75")
            addPathData("M9 8v2")
            addPathData("M6 8v3")
            addPathData("M12 8v3")
            addPathData("M18 8v3")
            addPathData("M15 8v2")
        }
        return _ruler3!!
    }

private var _ruler3: ImageVector? = null

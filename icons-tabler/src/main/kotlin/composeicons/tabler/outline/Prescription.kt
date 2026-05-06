package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = tablerOutlineIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 19v-16h4.5C12.985 3 15 5.015 15 7.5 15 9.985 12.985 12 10.5 12h-4.5")
            addPathData("M19 21 10 12")
            addPathData("M13 21l6-6")
        }
        return _prescription!!
    }

private var _prescription: ImageVector? = null

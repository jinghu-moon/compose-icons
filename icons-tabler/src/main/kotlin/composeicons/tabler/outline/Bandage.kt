package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bandage: ImageVector
    get() {
        if (_bandage != null) return _bandage!!
        _bandage = tablerOutlineIcon(
            name = "Bandage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12v.01")
            addPathData("M10 12v.01")
            addPathData("M12 10v.01")
            addPathData("M12 14v.01")
            addPathData("M4.5 12.5l8-8c1.933-1.933 5.067-1.933 7 0 1.933 1.933 1.933 5.067 0 7l-8 8c-1.933 1.933-5.067 1.933-7 0-1.933-1.933-1.933-5.067 0-7")
        }
        return _bandage!!
    }

private var _bandage: ImageVector? = null

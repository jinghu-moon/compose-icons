package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) return _strikethrough!!
        _strikethrough = tablerOutlineIcon(
            name = "Strikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h14")
            addPathData("M16 6.5C15.533 5.594 13.871 4.97 12 5h-1C9.067 5 7.5 6.567 7.5 8.5 7.5 10.433 9.067 12 11 12h2c1.933 0 3.5 1.567 3.5 3.5C16.5 17.433 14.933 19 13 19h-1.5c-1.871 .03-3.533-.594-4-1.5")
        }
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null

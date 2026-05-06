package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashGentle: ImageVector
    get() {
        if (_washGentle != null) return _washGentle!!
        _washGentle = tablerOutlineIcon(
            name = "WashGentle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.486 5.965C3.654 5.985 3.826 5.998 4 6c.79 .009 1.539-.178 2-.5C6.461 5.18 7.21 4.993 8 5c.79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .79 .009 1.539-.178 2-.5 .461-.32 1.21-.507 2-.5 .79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .17 0 .339-.014 .503-.034")
            addPathData("M3 3 4.721 13.329c.161 .964 .995 1.671 1.973 1.671h10.612c.978 0 1.812-.707 1.973-1.671L21 3")
            addPathData("M5 18h14")
            addPathData("M5 21h14")
        }
        return _washGentle!!
    }

private var _washGentle: ImageVector? = null

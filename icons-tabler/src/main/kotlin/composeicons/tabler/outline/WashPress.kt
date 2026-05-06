package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashPress: ImageVector
    get() {
        if (_washPress != null) return _washPress!!
        _washPress = tablerOutlineIcon(
            name = "WashPress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.486 7.965C3.654 7.985 3.826 7.998 4 8c.79 .009 1.539-.178 2-.5C6.461 7.18 7.21 6.993 8 7c.79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .79 .009 1.539-.178 2-.5 .461-.32 1.21-.507 2-.5 .79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .17 0 .339-.014 .503-.034")
            addPathData("M3 5 4.721 15.329c.161 .964 .995 1.671 1.973 1.671h10.612c.978 0 1.812-.707 1.973-1.671L21 5")
            addPathData("M5 20h14")
        }
        return _washPress!!
    }

private var _washPress: ImageVector? = null

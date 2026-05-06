package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashEco: ImageVector
    get() {
        if (_washEco != null) return _washEco!!
        _washEco = tablerOutlineIcon(
            name = "WashEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6 4.721 16.329c.161 .964 .995 1.671 1.973 1.671h5.306M20.162 11.028 21 6")
            addPathData("M3.486 8.965C3.654 8.985 3.826 8.998 4 9c.79 .009 1.539-.178 2-.5C6.461 8.18 7.21 7.993 8 8c.79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .79 .009 1.539-.178 2-.5 .461-.32 1.21-.507 2-.5 .79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .17 0 .339-.014 .503-.034")
            addPathData("M16 22c0 0 0-2 3-4")
            addPathData("M19 21c-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3h3v3c0 1.657-1.343 3-3 3")
        }
        return _washEco!!
    }

private var _washEco: ImageVector? = null

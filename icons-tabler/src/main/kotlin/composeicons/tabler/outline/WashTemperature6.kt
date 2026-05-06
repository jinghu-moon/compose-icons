package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashTemperature6: ImageVector
    get() {
        if (_washTemperature6 != null) return _washTemperature6!!
        _washTemperature6 = tablerOutlineIcon(
            name = "WashTemperature6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15h.01")
            addPathData("M3 6 4.721 16.329c.161 .964 .995 1.671 1.973 1.671h10.612c.978 0 1.812-.707 1.973-1.671L21 6")
            addPathData("M12 15h.01")
            addPathData("M15 15h.01")
            addPathData("M15 12h.01")
            addPathData("M12 12h.01")
            addPathData("M9 12h.01")
            addPathData("M3.486 8.965C3.654 8.985 3.826 8.998 4 9c.79 .009 1.539-.178 2-.5C6.461 8.18 7.21 7.993 8 8c.79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .79 .009 1.539-.178 2-.5 .461-.32 1.21-.507 2-.5 .79-.007 1.539 .18 2 .5 .461 .322 1.21 .509 2 .5 .17 0 .339-.014 .503-.034")
        }
        return _washTemperature6!!
    }

private var _washTemperature6: ImageVector? = null

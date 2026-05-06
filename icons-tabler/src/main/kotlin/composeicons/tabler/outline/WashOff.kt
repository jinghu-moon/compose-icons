package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashOff: ImageVector
    get() {
        if (_washOff != null) return _washOff!!
        _washOff = tablerOutlineIcon(
            name = "WashOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6 4.721 16.329c.161 .964 .995 1.671 1.973 1.671h10.612c.208 0 .41-.032 .6-.092M19.427 15.436 21 6")
            addPathData("M3.486 8.965C3.654 8.985 3.826 8.998 4 9c.79 .009 1.539-.178 2-.5C6.461 8.18 7.21 7.993 8 8M12.92 8.919c.428-.083 .805-.227 1.08-.418 .461-.322 1.21-.508 2-.5 .79-.008 1.539 .178 2 .5 .461 .32 1.21 .508 2 .5 .17 0 .339-.015 .503-.035")
            addPathData("M3 3 21 21")
        }
        return _washOff!!
    }

private var _washOff: ImageVector? = null

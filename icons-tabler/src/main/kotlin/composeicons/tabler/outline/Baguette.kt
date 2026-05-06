package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Baguette: ImageVector
    get() {
        if (_baguette != null) return _baguette!!
        _baguette = tablerOutlineIcon(
            name = "Baguette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.628 11.283 11.272 5.646C13.937 2.983 17.196 1.899 19.935 4.441l.188 .181c.561 .56 .877 1.321 .877 2.114 0 .793-.315 1.554-.877 2.114L8.836 20.124c-1.116 1.112-2.902 1.171-4.089 .135l-.143-.135C1.876 17.4 2.9 14.007 5.628 11.283")
            addPathData("M9.5 7.5 11 11")
            addPathData("M6.5 10.5 8 14")
            addPathData("M12.5 4.5 14 8")
        }
        return _baguette!!
    }

private var _baguette: ImageVector? = null

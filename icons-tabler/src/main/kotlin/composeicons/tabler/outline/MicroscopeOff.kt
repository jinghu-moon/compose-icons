package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MicroscopeOff: ImageVector
    get() {
        if (_microscopeOff != null) return _microscopeOff!!
        _microscopeOff = tablerOutlineIcon(
            name = "MicroscopeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21h14")
            addPathData("M6 18h2")
            addPathData("M7 18v3")
            addPathData("M10 10 9 11l3 3 1-1M15 11 18 8 15 5 12 8")
            addPathData("M10.5 12.5 9 14")
            addPathData("M17 3l3 3")
            addPathData("M12 21c2.348 0 4.481-1.37 5.457-3.505M17.898 13.896c-.267-1.427-1.043-2.709-2.183-3.608")
            addPathData("M3 3 21 21")
        }
        return _microscopeOff!!
    }

private var _microscopeOff: ImageVector? = null

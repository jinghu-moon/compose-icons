package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MacroOff: ImageVector
    get() {
        if (_macroOff != null) return _macroOff!!
        _macroOff = tablerOutlineIcon(
            name = "MacroOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 15c-.001 2.828 1.974 5.273 4.738 5.867 2.765 .595 5.57-.822 6.732-3.4")
            addPathData("M15.53 15.53C13.38 16.501 11.999 18.641 12 21")
            addPathData("M12 21C12 17.686 9.314 15 6 15")
            addPathData("M12 21v-10")
            addPathData("M10.866 10.87C9.016 10.438 7.569 8.996 7.132 7.147M7 3l3 2L12 3l2 2L17 3v3c0 1.829-.999 3.512-2.604 4.389")
            addPathData("M3 3 21 21")
        }
        return _macroOff!!
    }

private var _macroOff: ImageVector? = null

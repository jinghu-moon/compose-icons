package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoneybagMoveBack: ImageVector
    get() {
        if (_moneybagMoveBack != null) return _moneybagMoveBack!!
        _moneybagMoveBack = tablerOutlineIcon(
            name = "MoneybagMoveBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 3h5C15.328 3 16 3.672 16 4.5 16 6.433 14.433 8 12.5 8h-1C9.567 8 8 6.433 8 4.5 8 3.672 8.672 3 9.5 3")
            addPathData("M12.5 21h-4.5C5.791 21 4 19.209 4 17v-1C3.999 12.369 6.443 9.193 9.952 8.264c3.51-.929 7.205 .621 9.001 3.777")
            addPathData("M16 19h6")
            addPathData("M19 16l-3 3 3 3")
        }
        return _moneybagMoveBack!!
    }

private var _moneybagMoveBack: ImageVector? = null

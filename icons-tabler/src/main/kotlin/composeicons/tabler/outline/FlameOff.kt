package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlameOff: ImageVector
    get() {
        if (_flameOff != null) return _flameOff!!
        _flameOff = tablerOutlineIcon(
            name = "FlameOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.973 8.974C8.638 9.352 8.303 9.69 8 10 6.774 11.26 6 13.24 6 15c-.002 2.83 1.973 5.276 4.739 5.871 2.766 .595 5.572-.824 6.733-3.405M17.855 13.869C17.535 12.46 16.733 10.824 16 10c-.281 .472-.543 .87-.79 1.202M12.852 8.852C12.784 6.695 11.67 4.668 11 4c0 .968-.18 1.801-.465 2.527")
            addPathData("M3 3 21 21")
        }
        return _flameOff!!
    }

private var _flameOff: ImageVector? = null

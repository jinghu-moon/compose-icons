package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldPlus: ImageVector
    get() {
        if (_worldPlus != null) return _worldPlus!!
        _worldPlus = tablerOutlineIcon(
            name = "WorldPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.985 12.518C21.2 8.788 19.088 5.313 15.678 3.786 12.268 2.259 8.269 2.998 5.63 5.642 2.991 8.286 2.259 12.287 3.793 15.694c1.533 3.407 5.012 5.512 8.742 5.29")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h11.4")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2.261 3.622 3.076 7.962 2.283 12.157")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _worldPlus!!
    }

private var _worldPlus: ImageVector? = null

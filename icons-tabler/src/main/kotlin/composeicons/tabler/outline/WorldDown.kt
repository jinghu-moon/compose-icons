package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldDown: ImageVector
    get() {
        if (_worldDown != null) return _worldDown!!
        _worldDown = tablerOutlineIcon(
            name = "WorldDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.986 12.509C21.197 8.78 19.083 5.308 15.673 3.784 12.263 2.26 8.266 3 5.629 5.645 2.991 8.289 2.26 12.288 3.793 15.694c1.533 3.406 5.01 5.512 8.738 5.291")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h10.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2.313 3.706 3.07 7.857 2.27 12")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _worldDown!!
    }

private var _worldDown: ImageVector? = null

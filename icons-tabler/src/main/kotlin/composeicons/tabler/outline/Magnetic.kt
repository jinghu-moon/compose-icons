package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Magnetic: ImageVector
    get() {
        if (_magnetic != null) return _magnetic!!
        _magnetic = tablerOutlineIcon(
            name = "Magnetic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v18")
            addPathData("M18 7C17.367 5.745 16.462 5 15.5 5 13.567 5 12 8.134 12 12c0 3.866 1.567 7 3.5 7C17.433 19 19 15.866 19 12v-1")
            addPathData("M6 7C6.633 5.745 7.538 5 8.5 5 10.433 5 12 8.134 12 12c0 3.866-1.567 7-3.5 7C6.567 19 5 15.866 5 12v-1")
            addPathData("M3 13 5 11l2 2")
            addPathData("M17 13l2-2 2 2")
        }
        return _magnetic!!
    }

private var _magnetic: ImageVector? = null

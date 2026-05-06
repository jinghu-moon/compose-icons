package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldExclamation: ImageVector
    get() {
        if (_worldExclamation != null) return _worldExclamation!!
        _worldExclamation = tablerOutlineIcon(
            name = "WorldExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.986 12.51C21.212 8.522 18.783 4.862 15.019 3.522 11.256 2.182 7.06 3.483 4.715 6.716 2.37 9.95 2.436 14.343 4.879 17.503c2.443 3.161 6.676 4.333 10.397 2.88")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h10.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c3.437 5.508 3.437 12.492 0 18")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _worldExclamation!!
    }

private var _worldExclamation: ImageVector? = null

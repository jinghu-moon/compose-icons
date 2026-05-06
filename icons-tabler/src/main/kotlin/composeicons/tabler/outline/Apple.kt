package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = tablerOutlineIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11.319c0 3.102 .444 5.319 2.222 7.978 1.351 1.797 3.156 2.247 5.08 .988 .426-.268 .97-.268 1.397 0 1.923 1.26 3.728 .809 5.079-.988C19.556 16.637 20 14.421 20 11.32 20 8.659 18.01 6 15.556 6c-1.267 0-2.41 .693-3.22 1.44-.191 .173-.481 .173-.672 0C10.855 6.694 9.711 6 8.444 6 5.99 6 4 8.66 4 11.319")
            addPathData("M7 12C7 10.53 7.454 9.66 8.5 9")
            addPathData("M12 7c0-1.2 .867-4 3-4")
        }
        return _apple!!
    }

private var _apple: ImageVector? = null

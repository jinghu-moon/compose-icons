package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransitionBottom: ImageVector
    get() {
        if (_transitionBottom != null) return _transitionBottom!!
        _transitionBottom = tablerOutlineIcon(
            name = "TransitionBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 18c0 1.657-1.343 3-3 3h-12C4.343 21 3 19.657 3 18")
            addPathData("M3 6C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-12C4.343 9 3 7.657 3 6")
            addPathData("M12 9v8")
            addPathData("M9 14l3 3 3-3")
        }
        return _transitionBottom!!
    }

private var _transitionBottom: ImageVector? = null

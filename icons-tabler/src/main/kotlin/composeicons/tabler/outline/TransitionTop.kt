package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransitionTop: ImageVector
    get() {
        if (_transitionTop != null) return _transitionTop!!
        _transitionTop = tablerOutlineIcon(
            name = "TransitionTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 6C21 4.343 19.657 3 18 3h-12C4.343 3 3 4.343 3 6")
            addPathData("M6 21h12c1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3h-12C4.343 15 3 16.343 3 18c0 1.657 1.343 3 3 3")
            addPathData("M12 15v-8")
            addPathData("M9 10 12 7l3 3")
        }
        return _transitionTop!!
    }

private var _transitionTop: ImageVector? = null

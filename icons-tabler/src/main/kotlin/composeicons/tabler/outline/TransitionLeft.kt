package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransitionLeft: ImageVector
    get() {
        if (_transitionLeft != null) return _transitionLeft!!
        _transitionLeft = tablerOutlineIcon(
            name = "TransitionLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3")
            addPathData("M21 6v12c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3v-12C15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3")
            addPathData("M15 12h-8")
            addPathData("M10 9 7 12l3 3")
        }
        return _transitionLeft!!
    }

private var _transitionLeft: ImageVector? = null

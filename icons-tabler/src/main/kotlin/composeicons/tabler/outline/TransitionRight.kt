package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TransitionRight: ImageVector
    get() {
        if (_transitionRight != null) return _transitionRight!!
        _transitionRight = tablerOutlineIcon(
            name = "TransitionRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 3c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3")
            addPathData("M3 18v-12C3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6v12c0 1.657-1.343 3-3 3C4.343 21 3 19.657 3 18")
            addPathData("M9 12h8")
            addPathData("M14 15l3-3L14 9")
        }
        return _transitionRight!!
    }

private var _transitionRight: ImageVector? = null

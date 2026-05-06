package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TargetArrow: ImageVector
    get() {
        if (_targetArrow != null) return _targetArrow!!
        _targetArrow = tablerOutlineIcon(
            name = "TargetArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M12 7C9.239 7 7 9.239 7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5")
            addPathData("M13 3.055C9.2 2.629 5.546 4.65 3.887 8.095c-1.659 3.445-.959 7.562 1.744 10.266 2.703 2.704 6.82 3.406 10.266 1.749C19.342 18.453 21.365 14.8 20.941 11")
            addPathData("M15 6v3h3L21 6h-3v-3L15 6")
            addPathData("M15 9l-3 3")
        }
        return _targetArrow!!
    }

private var _targetArrow: ImageVector? = null

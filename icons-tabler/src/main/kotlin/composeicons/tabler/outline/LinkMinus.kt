package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LinkMinus: ImageVector
    get() {
        if (_linkMinus != null) return _linkMinus!!
        _linkMinus = tablerOutlineIcon(
            name = "LinkMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15 15 9")
            addPathData("M11 6l.463-.536c1.953-1.953 5.119-1.952 7.071 0 1.953 1.953 1.952 5.119-0 7.072L18 13")
            addPathData("M12.603 18.534c-1.975 1.951-5.152 1.951-7.127 0C4.531 17.6 4 16.327 4 14.998c0-1.328 .532-2.602 1.476-3.535L6 11")
            addPathData("M16 19h6")
        }
        return _linkMinus!!
    }

private var _linkMinus: ImageVector? = null

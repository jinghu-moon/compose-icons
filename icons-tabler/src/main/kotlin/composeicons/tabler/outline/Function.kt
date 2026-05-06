package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = tablerOutlineIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6.667C4 5.194 5.194 4 6.667 4h10.666C18.806 4 20 5.194 20 6.667v10.666C20 18.806 18.806 20 17.333 20h-10.666C5.194 20 4 18.806 4 17.333v-10.666")
            addPathData("M9 15.5v.25C9 16.44 9.56 17 10.25 17c.71 0 1.304-.538 1.374-1.244l.752-7.512C12.446 7.538 13.04 7 13.75 7 14.44 7 15 7.56 15 8.25v.25")
            addPathData("M9 12h6")
        }
        return _function!!
    }

private var _function: ImageVector? = null

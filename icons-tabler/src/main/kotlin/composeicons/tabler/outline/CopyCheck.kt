package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyCheck: ImageVector
    get() {
        if (_copyCheck != null) return _copyCheck!!
        _copyCheck = tablerOutlineIcon(
            name = "CopyCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9.667C7 8.194 8.194 7 9.667 7h8.666C19.806 7 21 8.194 21 9.667v8.666C21 19.806 19.806 21 18.333 21h-8.666C8.194 21 7 19.806 7 18.333v-8.666")
            addPathData("M4.012 16.737C3.387 16.382 3.001 15.719 3 15v-10C3 3.9 3.9 3 5 3h10c.75 0 1.158 .385 1.5 1")
            addPathData("M11 14l2 2 4-4")
        }
        return _copyCheck!!
    }

private var _copyCheck: ImageVector? = null

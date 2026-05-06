package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = tablerOutlineIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5h2")
            addPathData("M19 12c-.667 5.333-2.333 8-5 8h-4C7.333 20 5.667 17.333 5 12")
            addPathData("M11 16c0 .667 .333 1 1 1 .667 0 1-.333 1-1h-2")
            addPathData("M12 18v2")
            addPathData("M10 11v.01")
            addPathData("M14 11v.01")
            addPathData("M5 4l6 .97L4.762 11.658c-.364 .409-.986 .458-1.41 .111-.282-.23-.409-.6-.327-.954L5 4")
            addPathData("M19 4l-6 .97 6.238 6.688c.358 .408 .989 .458 1.41 .111 .282-.23 .409-.6 .327-.954L19 4")
        }
        return _dog!!
    }

private var _dog: ImageVector? = null

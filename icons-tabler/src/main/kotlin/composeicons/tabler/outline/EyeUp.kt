package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeUp: ImageVector
    get() {
        if (_eyeUp != null) return _eyeUp!!
        _eyeUp = tablerOutlineIcon(
            name = "EyeUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 18C8.4 18 5.4 16 3 12 5.4 8 8.4 6 12 6c3.6 0 6.6 2 9 6-.09 .15-.18 .295-.27 .439")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _eyeUp!!
    }

private var _eyeUp: ImageVector? = null

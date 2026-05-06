package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoVideo: ImageVector
    get() {
        if (_photoVideo != null) return _photoVideo!!
        _photoVideo = tablerOutlineIcon(
            name = "PhotoVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15h-3C4.343 15 3 13.657 3 12v-6C3 4.343 4.343 3 6 3h6c1.657 0 3 1.343 3 3v3")
            addPathData("M9 12C9 10.343 10.343 9 12 9h6c1.657 0 3 1.343 3 3v6c0 1.657-1.343 3-3 3h-6C10.343 21 9 19.657 9 18v-6")
            addPathData("M3 12 5.296 9.704c.941-.941 2.467-.941 3.408 0L9 10")
            addPathData("M14 13.5v3L16.5 15 14 13.5")
            addPathData("M7 6v.01")
        }
        return _photoVideo!!
    }

private var _photoVideo: ImageVector? = null

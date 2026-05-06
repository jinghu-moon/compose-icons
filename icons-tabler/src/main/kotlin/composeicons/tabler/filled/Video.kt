package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = tablerFilledIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.117 7.625c-.194-.022-.39 .012-.564 .1L15 10v4l4.553 2.275c.31 .155 .677 .138 .972-.043 .295-.182 .474-.503 .475-.849v-6.766c-.001-.507-.38-.933-.883-.992Z")
            addPathData("M5 5C3.355 5 2 6.355 2 8v8c0 1.645 1.355 3 3 3h8c1.645 0 3-1.355 3-3v-8C16 6.355 14.645 5 13 5Z")
        }
        return _video!!
    }

private var _video: ImageVector? = null

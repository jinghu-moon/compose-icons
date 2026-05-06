package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShovelPitchforks: ImageVector
    get() {
        if (_shovelPitchforks != null) return _shovelPitchforks!!
        _shovelPitchforks = tablerOutlineIcon(
            name = "ShovelPitchforks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 3h4")
            addPathData("M7 3v12")
            addPathData("M4 15h6v3c0 1.657-1.343 3-3 3C5.343 21 4 19.657 4 18v-3")
            addPathData("M14 21v-3c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3v3")
            addPathData("M17 21v-18")
        }
        return _shovelPitchforks!!
    }

private var _shovelPitchforks: ImageVector? = null

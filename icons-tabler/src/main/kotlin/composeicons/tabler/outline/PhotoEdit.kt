package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoEdit: ImageVector
    get() {
        if (_photoEdit != null) return _photoEdit!!
        _photoEdit = tablerOutlineIcon(
            name = "PhotoEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M11 20h-4C5.343 20 4 18.657 4 17v-10C4 5.343 5.343 4 7 4h10c1.657 0 3 1.343 3 3v4")
            addPathData("M4 15 8 11c.928-.893 2.072-.893 3 0l3 3")
            addPathData("M14 14l1-1c.31-.298 .644-.497 .987-.596")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _photoEdit!!
    }

private var _photoEdit: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = tablerOutlineIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C8 14.343 6.657 13 5 13 3.343 13 2 14.343 2 16")
            addPathData("M16 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M7.5 14h5l4-4h-10.5M7.5 14l4-4")
            addPathData("M13 6h2l1.5 3 2 4")
        }
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null

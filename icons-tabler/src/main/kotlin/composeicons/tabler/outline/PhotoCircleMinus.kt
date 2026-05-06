package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoCircleMinus: ImageVector
    get() {
        if (_photoCircleMinus != null) return _photoCircleMinus!!
        _photoCircleMinus = tablerOutlineIcon(
            name = "PhotoCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M20.475 15.035c.988-2.757 .572-5.822-1.114-8.217C17.675 4.424 14.929 2.999 12 3 7.029 3 3 7.029 3 12c-0 2.478 1.022 4.847 2.824 6.547 1.803 1.7 4.227 2.582 6.701 2.438")
            addPathData("M4 15 8 11c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M14 14l1-1c.928-.893 2.072-.893 3 0l2 2")
            addPathData("M16 19h6")
        }
        return _photoCircleMinus!!
    }

private var _photoCircleMinus: ImageVector? = null

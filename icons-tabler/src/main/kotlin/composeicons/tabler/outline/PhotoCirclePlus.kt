package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoCirclePlus: ImageVector
    get() {
        if (_photoCirclePlus != null) return _photoCirclePlus!!
        _photoCirclePlus = tablerOutlineIcon(
            name = "PhotoCirclePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M20.964 12.806c.226-2.517-.616-5.013-2.321-6.878C16.938 4.062 14.527 3 12 3 7.029 3 3 7.029 3 12c0 2.456 1.004 4.805 2.778 6.503 1.774 1.698 4.166 2.597 6.619 2.488")
            addPathData("M4 15 8 11c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M14 14l1-1c.928-.893 2.072-.893 3 0")
            addPathData("M16 19.33h6")
            addPathData("M19 16.33v6")
        }
        return _photoCirclePlus!!
    }

private var _photoCirclePlus: ImageVector? = null

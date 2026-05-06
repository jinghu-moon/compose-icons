package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoDown: ImageVector
    get() {
        if (_photoDown != null) return _photoDown!!
        _photoDown = tablerOutlineIcon(
            name = "PhotoDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M12.5 21h-6.5C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3h12c1.657 0 3 1.343 3 3v6.5")
            addPathData("M3 16 8 11c.928-.893 2.072-.893 3 0l4 4")
            addPathData("M14 14l1-1c.653-.629 1.413-.815 2.13-.559")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _photoDown!!
    }

private var _photoDown: ImageVector? = null

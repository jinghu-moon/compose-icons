package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ironing3: ImageVector
    get() {
        if (_ironing3 != null) return _ironing3!!
        _ironing3 = tablerOutlineIcon(
            name = "Ironing3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15h.01")
            addPathData("M9 6h7.459c1.467 0 2.718 1.06 2.959 2.507l.577 3.464 .81 4.865c.048 .29-.033 .586-.223 .81-.19 .224-.468 .354-.762 .354h-16.82c0-3.866 3.134-7 7-7h9.8")
            addPathData("M9 15h.01")
            addPathData("M15 15h.01")
        }
        return _ironing3!!
    }

private var _ironing3: ImageVector? = null

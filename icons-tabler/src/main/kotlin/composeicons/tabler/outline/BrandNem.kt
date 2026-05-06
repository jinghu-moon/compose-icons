package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNem: ImageVector
    get() {
        if (_brandNem != null) return _brandNem!!
        _brandNem = tablerOutlineIcon(
            name = "BrandNem",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.182 2c1.94 .022 3.879 .382 5.818 1.08l.364 .135C19.626 3.702 20.843 4.3 22 5c0 5.618-1.957 10.258-5.87 13.92-1.24 1.239-2.5 2.204-3.78 2.898L12 22C10.6 21.297 9.223 20.271 7.87 18.921 3.958 15.258 2 10.618 2 5 4.545 3.473 7.09 2.529 9.636 2.168L10 2.12c.603-.073 1.21-.113 1.818-.12h.364")
            addPathData("M2.1 7.07C4.173 13.79 7.473 14.767 12 10 12 6 13.357 3.647 16.07 2.94l.59-.11")
            addPathData("M16.35 18.51C16.35 18.51 19 13 12 10")
        }
        return _brandNem!!
    }

private var _brandNem: ImageVector? = null

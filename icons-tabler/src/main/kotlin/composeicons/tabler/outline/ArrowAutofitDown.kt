package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) return _arrowAutofitDown!!
        _arrowAutofitDown = tablerOutlineIcon(
            name = "ArrowAutofitDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-6C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h8")
            addPathData("M18 4v17")
            addPathData("M15 18l3 3 3-3")
        }
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowAutofitHeight: ImageVector
    get() {
        if (_arrowAutofitHeight != null) return _arrowAutofitHeight!!
        _arrowAutofitHeight = tablerOutlineIcon(
            name = "ArrowAutofitHeight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-6C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4h6")
            addPathData("M18 14v7")
            addPathData("M18 3v7")
            addPathData("M15 18l3 3 3-3")
            addPathData("M15 6 18 3l3 3")
        }
        return _arrowAutofitHeight!!
    }

private var _arrowAutofitHeight: ImageVector? = null

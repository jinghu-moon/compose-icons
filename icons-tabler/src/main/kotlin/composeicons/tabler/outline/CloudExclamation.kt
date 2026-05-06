package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudExclamation: ImageVector
    get() {
        if (_cloudExclamation != null) return _cloudExclamation!!
        _cloudExclamation = tablerOutlineIcon(
            name = "CloudExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 18.004h-8.343C4.085 18 2 15.993 2 13.517 2 11.042 4.085 9.035 6.657 9.035 7.05 7.273 8.451 5.835 10.332 5.262c1.88-.572 3.956-.193 5.444 1 1.488 1.19 2.162 3.007 1.77 4.769h.99c1.374 0 2.562 .805 3.121 1.972")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _cloudExclamation!!
    }

private var _cloudExclamation: ImageVector? = null

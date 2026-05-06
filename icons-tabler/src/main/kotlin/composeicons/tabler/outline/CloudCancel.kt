package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudCancel: ImageVector
    get() {
        if (_cloudCancel != null) return _cloudCancel!!
        _cloudCancel = tablerOutlineIcon(
            name = "CloudCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18.004h-5.343C4.085 18 2 15.993 2 13.517 2 11.042 4.085 9.035 6.657 9.035 7.05 7.273 8.451 5.835 10.332 5.262c1.88-.572 3.956-.193 5.444 1 1.488 1.19 2.162 3.007 1.77 4.769h.99c1.083-0 2.104 .508 2.756 1.373")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _cloudCancel!!
    }

private var _cloudCancel: ImageVector? = null

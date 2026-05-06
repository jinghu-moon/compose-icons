package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudComputing: ImageVector
    get() {
        if (_cloudComputing != null) return _cloudComputing!!
        _cloudComputing = tablerOutlineIcon(
            name = "CloudComputing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.657 16C4.085 16 2 13.993 2 11.517 2 9.042 4.085 7.035 6.657 7.035 7.05 5.273 8.451 3.835 10.332 3.262c1.88-.572 3.956-.193 5.444 1 1.488 1.19 2.162 3.007 1.77 4.769h.99c1.913 0 3.464 1.56 3.464 3.486 0 1.927-1.551 3.487-3.465 3.487h-11.878")
            addPathData("M12 16v5")
            addPathData("M16 16v4c0 .552 .448 1 1 1h4")
            addPathData("M8 16v4c0 .552-.448 1-1 1h-4")
        }
        return _cloudComputing!!
    }

private var _cloudComputing: ImageVector? = null

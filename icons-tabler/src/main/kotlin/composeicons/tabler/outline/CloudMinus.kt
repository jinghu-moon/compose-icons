package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudMinus: ImageVector
    get() {
        if (_cloudMinus != null) return _cloudMinus!!
        _cloudMinus = tablerOutlineIcon(
            name = "CloudMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 18.004h-5.343C4.085 18 2 15.993 2 13.517 2 11.042 4.085 9.035 6.657 9.035 7.05 7.273 8.451 5.835 10.332 5.262c1.88-.572 3.956-.193 5.444 1 1.488 1.19 2.162 3.007 1.77 4.769h.99c1.913 0 3.464 1.56 3.464 3.486 0 .186-.015 .37-.042 .548")
            addPathData("M16 19h6")
        }
        return _cloudMinus!!
    }

private var _cloudMinus: ImageVector? = null

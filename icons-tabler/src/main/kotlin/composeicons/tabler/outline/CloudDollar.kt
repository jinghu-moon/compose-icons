package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudDollar: ImageVector
    get() {
        if (_cloudDollar != null) return _cloudDollar!!
        _cloudDollar = tablerOutlineIcon(
            name = "CloudDollar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 18.004h-6.843C4.085 18 2 15.993 2 13.517 2 11.042 4.085 9.035 6.657 9.035 7.05 7.273 8.451 5.835 10.332 5.262c1.88-.572 3.956-.193 5.444 1 1.28 1.023 1.957 2.51 1.873 4.027")
            addPathData("M21 15h-2.5C17.672 15 17 15.672 17 16.5c0 .828 .672 1.5 1.5 1.5h1c.828 0 1.5 .672 1.5 1.5C21 20.328 20.328 21 19.5 21h-2.5")
            addPathData("M19 21v1M19 14v1")
        }
        return _cloudDollar!!
    }

private var _cloudDollar: ImageVector? = null

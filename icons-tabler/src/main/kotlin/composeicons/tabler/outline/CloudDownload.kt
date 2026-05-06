package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) return _cloudDownload!!
        _cloudDownload = tablerOutlineIcon(
            name = "CloudDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 18c1.933 0 3.5-1.567 3.5-3.5C22.5 12.567 20.933 11 19 11h-1C18.614 8.266 16.649 5.602 13.611 5.05 10.574 4.498 7.614 6.266 7 9 4.801 8.912 2.845 10.326 2.334 12.373c-.512 2.047 .564 4.154 2.566 5.027")
            addPathData("M12 13v9")
            addPathData("M9 19l3 3 3-3")
        }
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null

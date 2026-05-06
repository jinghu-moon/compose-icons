package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Cancel: ImageVector
    get() {
        if (_filter2Cancel != null) return _filter2Cancel!!
        _filter2Cancel = tablerOutlineIcon(
            name = "Filter2Cancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h12")
            addPathData("M9 18h3")
            addPathData("M17 21l4-4M16 19c0 .796 .316 1.559 .879 2.121 .563 .563 1.326 .879 2.121 .879 .796 0 1.559-.316 2.121-.879C21.684 20.558 22 19.795 22 19c0-.796-.316-1.559-.879-2.121C20.558 16.316 19.795 16 19 16c-.796 0-1.559 .316-2.121 .879C16.316 17.442 16 18.205 16 19l1 2")
        }
        return _filter2Cancel!!
    }

private var _filter2Cancel: ImageVector? = null

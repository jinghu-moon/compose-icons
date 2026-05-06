package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Search: ImageVector
    get() {
        if (_filter2Search != null) return _filter2Search!!
        _filter2Search = tablerOutlineIcon(
            name = "Filter2Search",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h8.5")
            addPathData("M9 18h2")
            addPathData("M15 18c0 .796 .316 1.559 .879 2.121 .563 .563 1.326 .879 2.121 .879 .796 0 1.559-.316 2.121-.879C20.684 19.558 21 18.795 21 18c0-.796-.316-1.559-.879-2.121C19.558 15.316 18.795 15 18 15c-.796 0-1.559 .316-2.121 .879C15.316 16.442 15 17.205 15 18")
            addPathData("M20.2 20.2 22 22")
        }
        return _filter2Search!!
    }

private var _filter2Search: ImageVector? = null

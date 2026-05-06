package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Flask2Off: ImageVector
    get() {
        if (_flask2Off != null) return _flask2Off!!
        _flask2Off = tablerOutlineIcon(
            name = "Flask2Off",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.1 15h8.9")
            addPathData("M17.742 17.741c-.405 1.335-1.262 2.488-2.424 3.259h-6.635C6.786 19.743 5.763 17.521 6.042 15.262 6.321 13.004 7.854 11.097 10 10.34v-.326M10 6v-3h4v7M14.613 10.598c1.226 .594 2.214 1.587 2.801 2.817")
            addPathData("M9 3h6")
            addPathData("M3 3 21 21")
        }
        return _flask2Off!!
    }

private var _flask2Off: ImageVector? = null

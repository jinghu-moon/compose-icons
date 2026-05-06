package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PackageExport: ImageVector
    get() {
        if (_packageExport != null) return _packageExport!!
        _packageExport = tablerOutlineIcon(
            name = "PackageExport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21 4 16.5v-9L12 3l8 4.5v4.5")
            addPathData("M12 12 20 7.5")
            addPathData("M12 12v9")
            addPathData("M12 12 4 7.5")
            addPathData("M15 18h7")
            addPathData("M19 15l3 3-3 3")
        }
        return _packageExport!!
    }

private var _packageExport: ImageVector? = null

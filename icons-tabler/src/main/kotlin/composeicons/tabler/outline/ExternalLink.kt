package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExternalLink: ImageVector
    get() {
        if (_externalLink != null) return _externalLink!!
        _externalLink = tablerOutlineIcon(
            name = "ExternalLink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6h-6C4.895 6 4 6.895 4 8v10c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2v-6")
            addPathData("M11 13 20 4")
            addPathData("M15 4h5v5")
        }
        return _externalLink!!
    }

private var _externalLink: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZulip: ImageVector
    get() {
        if (_brandZulip != null) return _brandZulip!!
        _brandZulip = tablerOutlineIcon(
            name = "BrandZulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 3h11C18.825 3 20 4 20 5.5c0 2-1.705 3.264-2 3.5l-4.5 4 2-5h-9C5.119 8 4 6.881 4 5.5 4 4.119 5.119 3 6.5 3")
            addPathData("M17.5 21h-11C5.175 21 4 20 4 18.5 4 16.5 5.705 15.236 6 15l4.5-4-2 5h9C18.881 16 20 17.119 20 18.5 20 19.881 18.881 21 17.5 21")
        }
        return _brandZulip!!
    }

private var _brandZulip: ImageVector? = null

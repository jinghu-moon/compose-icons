package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpherePlus: ImageVector
    get() {
        if (_spherePlus != null) return _spherePlus!!
        _spherePlus = tablerOutlineIcon(
            name = "SpherePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 1.657 4.03 3 9 3 1.116 0 2.185-.068 3.172-.192M20.896 12.458c.067-.143 .103-.3 .104-.458")
            addPathData("M20.984 12.546C21.211 8.813 19.106 5.33 15.696 3.794 12.287 2.259 8.283 2.991 5.638 5.635 2.993 8.278 2.259 12.282 3.793 15.692c1.534 3.41 5.017 5.517 8.749 5.292")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _spherePlus!!
    }

private var _spherePlus: ImageVector? = null

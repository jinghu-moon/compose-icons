package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMixpanel: ImageVector
    get() {
        if (_brandMixpanel != null) return _brandMixpanel!!
        _brandMixpanel = tablerOutlineIcon(
            name = "BrandMixpanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12c0 1.381 1.119 2.5 2.5 2.5C5.881 14.5 7 13.381 7 12 7 10.619 5.881 9.5 4.5 9.5 3.119 9.5 2 10.619 2 12")
            addPathData("M19 12c0 .828 .672 1.5 1.5 1.5C21.328 13.5 22 12.828 22 12c0-.828-.672-1.5-1.5-1.5C19.672 10.5 19 11.172 19 12")
            addPathData("M11 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _brandMixpanel!!
    }

private var _brandMixpanel: ImageVector? = null

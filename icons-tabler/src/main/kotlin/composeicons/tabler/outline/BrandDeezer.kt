package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDeezer: ImageVector
    get() {
        if (_brandDeezer != null) return _brandDeezer!!
        _brandDeezer = tablerOutlineIcon(
            name = "BrandDeezer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16.5h2v.5h-2v-.5")
            addPathData("M8 16.5h2.5v.5h-2.5v-.5")
            addPathData("M16 17h-2.5v-.5h2.5v.5")
            addPathData("M21.5 17h-2.5v-.5h2.5v.5")
            addPathData("M21.5 13h-2.5v.5h2.5v-.5")
            addPathData("M21.5 9.5h-2.5v.5h2.5v-.5")
            addPathData("M21.5 6h-2.5v.5h2.5v-.5")
            addPathData("M16 13h-2.5v.5h2.5v-.5")
            addPathData("M8 13.5h2.5v-.5h-2.5v.5")
            addPathData("M8 9.5h2.5v.5h-2.5v-.5")
        }
        return _brandDeezer!!
    }

private var _brandDeezer: ImageVector? = null

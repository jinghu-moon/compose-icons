package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSupernova: ImageVector
    get() {
        if (_brandSupernova != null) return _brandSupernova!!
        _brandSupernova = tablerOutlineIcon(
            name = "BrandSupernova",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M15 15h.5C18.538 15 21 13.657 21 12 21 10.343 18.538 9 15.5 9c-1.836 0-3.462 .49-4.46 1.245")
            addPathData("M9 9h-.5C5.462 9 3 10.343 3 12c0 1.657 2.462 3 5.5 3 1.844 0 3.476-.495 4.474-1.255")
            addPathData("M15 9v-.5C15 5.462 13.657 3 12 3 10.343 3 9 5.462 9 8.5c0 1.833 .49 3.457 1.241 4.456")
            addPathData("M9 15v.5C9 18.538 10.343 21 12 21c1.657 0 3-2.462 3-5.5 0-1.842-.494-3.472-1.252-4.47")
        }
        return _brandSupernova!!
    }

private var _brandSupernova: ImageVector? = null

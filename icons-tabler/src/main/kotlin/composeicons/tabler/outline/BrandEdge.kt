package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandEdge: ImageVector
    get() {
        if (_brandEdge != null) return _brandEdge!!
        _brandEdge = tablerOutlineIcon(
            name = "BrandEdge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.978 11.372C20.672 6.998 17.258 3.482 12.895 3.046 8.533 2.609 4.49 5.38 3.324 9.607c-1.166 4.226 .883 8.678 4.852 10.541 3.969 1.863 8.703 .595 11.209-3.003")
            addPathData("M20.978 11.372c.21 2.993-5.034 2.413-6.913 1.486 1.392-1.6 .402-4.038-2.274-3.851-1.745 .122-2.927 1.157-2.784 3.202 .28 3.99 4.444 6.205 10.36 4.79")
            addPathData("M3.022 12.628C2.739 8.585 11.739 5.4 14.27 9.94")
            addPathData("M12.628 20.978C9.635 21.188 7.466 16.253 9.061 11.23")
        }
        return _brandEdge!!
    }

private var _brandEdge: ImageVector? = null

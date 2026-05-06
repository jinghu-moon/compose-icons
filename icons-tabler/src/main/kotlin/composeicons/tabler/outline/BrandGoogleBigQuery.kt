package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGoogleBigQuery: ImageVector
    get() {
        if (_brandGoogleBigQuery != null) return _brandGoogleBigQuery!!
        _brandGoogleBigQuery = tablerOutlineIcon(
            name = "BrandGoogleBigQuery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.73 19.875c-.398 .7-1.143 1.13-1.948 1.125h-7.283C7.687 20.999 6.941 20.555 6.552 19.842L2.28 13.092c-.373-.68-.373-1.504 0-2.184L6.552 4.158C6.941 3.446 7.687 3.002 8.498 3h7.285c.809 0 1.554 .443 1.947 1.158l3.98 6.75c.386 .7 .386 1.55 0 2.25l-3.98 6.75v-.033")
            addPathData("M8 11.5C8 13.433 9.567 15 11.5 15 13.433 15 15 13.433 15 11.5 15 9.567 13.433 8 11.5 8 9.567 8 8 9.567 8 11.5")
            addPathData("M14 14l2 2")
        }
        return _brandGoogleBigQuery!!
    }

private var _brandGoogleBigQuery: ImageVector? = null

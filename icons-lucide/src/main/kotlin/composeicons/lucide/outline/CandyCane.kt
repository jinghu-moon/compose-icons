package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CandyCane: ImageVector
    get() {
        if (_candyCane != null) return _candyCane!!
        _candyCane = lucideOutlineIcon(
            name = "CandyCane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.7 21c-.552 .966-1.784 1.302-2.75 .75C1.984 21.198 1.648 19.966 2.2 19L10.8 5C12.457 2.128 16.128 1.143 19 2.8c2.872 1.657 3.857 5.328 2.2 8.2-.355 .624-1.017 1.01-1.734 1.011-.718 .002-1.381-.382-1.739-1.004C17.37 10.385 17.373 9.619 17.736 9c.363-.619 .366-1.385 .009-2.008C17.387 6.37 16.724 5.987 16.006 5.989 15.289 5.99 14.627 6.376 14.272 7Z")
            addPathData("M17.75 7 15 2.1")
            addPathData("M10.9 4.8 13 9")
            addPathData("M7.9 9.7l2 4.4")
            addPathData("M4.9 14.7 7 18.9")
        }
        return _candyCane!!
    }

private var _candyCane: ImageVector? = null

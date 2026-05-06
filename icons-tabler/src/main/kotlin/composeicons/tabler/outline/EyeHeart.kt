package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeHeart: ImageVector
    get() {
        if (_eyeHeart != null) return _eyeHeart!!
        _eyeHeart = tablerOutlineIcon(
            name = "EyeHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.905 11.39c-.275-.857-1.088-1.426-1.988-1.388-.9 .037-1.663 .671-1.866 1.549-.202 .877 .206 1.782 .998 2.209")
            addPathData("M9.992 17.779C7.27 17.158 4.939 15.232 3 12 5.4 8 8.4 6 12 6c3.332 0 6.15 1.714 8.454 5.14")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _eyeHeart!!
    }

private var _eyeHeart: ImageVector? = null

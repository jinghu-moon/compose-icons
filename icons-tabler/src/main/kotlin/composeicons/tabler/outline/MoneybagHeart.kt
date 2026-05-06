package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoneybagHeart: ImageVector
    get() {
        if (_moneybagHeart != null) return _moneybagHeart!!
        _moneybagHeart = tablerOutlineIcon(
            name = "MoneybagHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 3h5C15.328 3 16 3.672 16 4.5 16 6.433 14.433 8 12.5 8h-1C9.567 8 8 6.433 8 4.5 8 3.672 8.672 3 9.5 3")
            addPathData("M11.5 21h-3.5C5.791 21 4 19.209 4 17v-1C3.999 12.564 6.194 9.511 9.451 8.416c3.257-1.095 6.85 .012 8.925 2.751")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.851-2.257-.854-3.129-.006l-.224 .22-.223-.22c-.868-.85-2.256-.853-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _moneybagHeart!!
    }

private var _moneybagHeart: ImageVector? = null

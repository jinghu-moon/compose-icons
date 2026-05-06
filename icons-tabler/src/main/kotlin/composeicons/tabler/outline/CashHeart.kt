package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashHeart: ImageVector
    get() {
        if (_cashHeart != null) return _cashHeart!!
        _cashHeart = tablerOutlineIcon(
            name = "CashHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h-3C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h12c.552 0 1 .448 1 1v3")
            addPathData("M10.25 19h-2.25C7.448 19 7 18.552 7 18v-8C7 9.448 7.448 9 8 9h12c.552 0 1 .448 1 1v1.25")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.851-2.257-.854-3.129-.006l-.224 .22-.223-.22c-.868-.85-2.256-.853-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _cashHeart!!
    }

private var _cashHeart: ImageVector? = null

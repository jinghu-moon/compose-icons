package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PencilHeart: ImageVector
    get() {
        if (_pencilHeart != null) return _pencilHeart!!
        _pencilHeart = tablerOutlineIcon(
            name = "PencilHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 11 18.5 9.5c1.105-1.105 1.105-2.895 0-4-1.105-1.105-2.895-1.105-4 0L4 16v4h4l2-2")
            addPathData("M13.5 6.5l4 4")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _pencilHeart!!
    }

private var _pencilHeart: ImageVector? = null

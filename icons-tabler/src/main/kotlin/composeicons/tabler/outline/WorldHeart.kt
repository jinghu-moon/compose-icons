package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldHeart: ImageVector
    get() {
        if (_worldHeart != null) return _worldHeart!!
        _worldHeart = tablerOutlineIcon(
            name = "WorldHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.118 17.108 3.126 12.227 3.003 7.346 2.879 3.257 6.67 3.011 11.547c-.246 4.876 3.441 9.059 8.31 9.427")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h6.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.53 2.45 2.41 5.251 2.556 8.136")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _worldHeart!!
    }

private var _worldHeart: ImageVector? = null

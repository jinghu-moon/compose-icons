package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DatabaseHeart: ImageVector
    get() {
        if (_databaseHeart != null) return _databaseHeart!!
        _databaseHeart = tablerOutlineIcon(
            name = "DatabaseHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6c0 1.657 3.582 3 8 3 4.418 0 8-1.343 8-3C20 4.343 16.418 3 12 3 7.582 3 4 4.343 4 6")
            addPathData("M4 6v6c0 1.453 2.755 2.665 6.414 2.941")
            addPathData("M20 11v-5")
            addPathData("M4 12v6c0 1.579 3.253 2.873 7.383 2.991")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _databaseHeart!!
    }

private var _databaseHeart: ImageVector? = null

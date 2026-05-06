package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesHeart: ImageVector
    get() {
        if (_devicesHeart != null) return _devicesHeart!!
        _devicesHeart = tablerOutlineIcon(
            name = "DevicesHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 12v-3c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v2")
            addPathData("M18 8v-3C18 4.448 17.552 4 17 4h-13C3.448 4 3 4.448 3 5v12c0 .552 .448 1 1 1h6")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
            addPathData("M16 9h2")
        }
        return _devicesHeart!!
    }

private var _devicesHeart: ImageVector? = null

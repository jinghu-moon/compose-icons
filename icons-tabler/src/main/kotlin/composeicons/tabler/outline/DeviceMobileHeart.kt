package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileHeart: ImageVector
    get() {
        if (_deviceMobileHeart != null) return _deviceMobileHeart!!
        _deviceMobileHeart = tablerOutlineIcon(
            name = "DeviceMobileHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 21h-3.5C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v6")
            addPathData("M11 4h2")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
        }
        return _deviceMobileHeart!!
    }

private var _deviceMobileHeart: ImageVector? = null

package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockHeart: ImageVector
    get() {
        if (_clockHeart != null) return _clockHeart!!
        _clockHeart = tablerOutlineIcon(
            name = "ClockHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.956 11.107C20.483 6.356 16.382 2.802 11.612 3.008 6.843 3.214 3.064 7.108 3.001 11.882c-.063 4.774 3.613 8.766 8.376 9.096")
            addPathData("M18 22l3.35-3.284c.415-.403 .65-.956 .651-1.534 .001-.578-.232-1.132-.646-1.537-.869-.85-2.257-.852-3.129-.006l-.224 .22-.223-.22c-.869-.849-2.256-.852-3.128-.006-.415 .403-.65 .956-.651 1.534-.001 .578 .232 1.133 .645 1.537L18 22")
            addPathData("M12 7v5l.5 .5")
        }
        return _clockHeart!!
    }

private var _clockHeart: ImageVector? = null

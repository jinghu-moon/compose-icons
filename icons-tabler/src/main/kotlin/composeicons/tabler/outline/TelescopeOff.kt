package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TelescopeOff: ImageVector
    get() {
        if (_telescopeOff != null) return _telescopeOff!!
        _telescopeOff = tablerOutlineIcon(
            name = "TelescopeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21l6-5 6 5")
            addPathData("M12 13v8")
            addPathData("M8.238 8.264 4.055 10.774c-1.02 .614-1.357 1.898-.76 2.906l.165 .28c.52 .88 1.624 1.266 2.605 .91l6.457-2.34M15.429 11.475 20.307 9.705c.284-.098 .511-.316 .62-.597 .109-.28 .089-.594-.055-.858L18.252 3.545c-.291-.506-.93-.691-1.447-.42l-.056 .032L10.733 6.767")
            addPathData("M14 5l3 5.5")
            addPathData("M3 3 21 21")
        }
        return _telescopeOff!!
    }

private var _telescopeOff: ImageVector? = null

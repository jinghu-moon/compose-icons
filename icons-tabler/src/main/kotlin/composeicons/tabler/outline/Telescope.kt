package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Telescope: ImageVector
    get() {
        if (_telescope != null) return _telescope!!
        _telescope = tablerOutlineIcon(
            name = "Telescope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21l6-5 6 5")
            addPathData("M12 13v8")
            addPathData("M3.294 13.678l.166 .281c.52 .88 1.624 1.265 2.605 .91L20.307 9.704c.284-.098 .511-.316 .62-.597 .109-.281 .089-.595-.055-.859L18.252 3.543c-.291-.506-.93-.691-1.447-.42l-.056 .032L4.055 10.773c-1.02 .613-1.357 1.897-.76 2.905h-.001")
            addPathData("M14 5l3 5.5")
        }
        return _telescope!!
    }

private var _telescope: ImageVector? = null

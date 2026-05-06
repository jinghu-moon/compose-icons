package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sticker2: ImageVector
    get() {
        if (_sticker2 != null) return _sticker2!!
        _sticker2 = tablerOutlineIcon(
            name = "Sticker2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h12c1.105 0 2 .895 2 2v7h-5c-1.105 0-2 .895-2 2v5h-7C4.895 20 4 19.105 4 18v-12C4 4.895 4.895 4 6 4")
            addPathData("M20 13v.172c-0 .53-.211 1.039-.586 1.414l-4.828 4.828c-.375 .375-.884 .586-1.414 .586h-.172")
        }
        return _sticker2!!
    }

private var _sticker2: ImageVector? = null

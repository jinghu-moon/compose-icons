package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Weight: ImageVector
    get() {
        if (_weight != null) return _weight!!
        _weight = tablerOutlineIcon(
            name = "Weight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 4.343 13.657 3 12 3 10.343 3 9 4.343 9 6")
            addPathData("M6.835 9h10.33c.483-0 .897 .346 .984 .821l1.637 9c.053 .292-.026 .592-.216 .82-.19 .228-.471 .359-.768 .359h-13.604c-.297 0-.578-.132-.768-.359-.19-.228-.269-.528-.216-.82L5.851 9.821C5.938 9.346 6.352 9 6.835 9")
        }
        return _weight!!
    }

private var _weight: ImageVector? = null

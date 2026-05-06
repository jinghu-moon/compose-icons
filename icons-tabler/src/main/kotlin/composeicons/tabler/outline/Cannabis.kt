package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cannabis: ImageVector
    get() {
        if (_cannabis != null) return _cannabis!!
        _cannabis = tablerOutlineIcon(
            name = "Cannabis",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 20c0 0 0-2 1-3.5C6.5 16.5 6 16 4 15c0 0 1.839-1.38 5-1C7.211 13.03 5.721 11.97 4 8c0 0 3.98-.3 6.5 3.5C8.216 6.6 12 2 12 2c2.734 5.47 2.389 7.5 1.5 9.5C16.031 7.73 20 8 20 8c-1.721 3.97-3.211 5.03-5 6 3.161-.38 5 1 5 1-2 1-2.5 1.5-4 1.5C17 18 17 20 17 20c-2 0-4.438-2.22-5-3-.563 .78-3 3-5 3")
            addPathData("M12 22v-5")
        }
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null

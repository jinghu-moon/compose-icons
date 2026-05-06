package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreativeCommonsSa: ImageVector
    get() {
        if (_creativeCommonsSa != null) return _creativeCommonsSa!!
        _creativeCommonsSa = tablerOutlineIcon(
            name = "CreativeCommonsSa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M12 16c2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12v1")
            addPathData("M6 12l2 2 2-2")
        }
        return _creativeCommonsSa!!
    }

private var _creativeCommonsSa: ImageVector? = null

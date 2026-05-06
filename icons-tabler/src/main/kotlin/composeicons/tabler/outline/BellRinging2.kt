package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) return _bellRinging2!!
        _bellRinging2 = tablerOutlineIcon(
            name = "BellRinging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.364 4.636c.781 .781 .781 2.047 0 2.828 .873 2.437 .329 5.158-1.414 7.072l-2.122 2.12c-.784 1-1.046 2.312-.707 3.536L3.808 8.88c1.224 .339 2.536 .076 3.535-.707L9.464 6.05C11.378 4.307 14.099 3.763 16.536 4.636c.781-.781 2.047-.781 2.828 0")
            addPathData("M7.343 12.414l-.707 .707c-1.172 1.172-1.172 3.071 0 4.243 1.172 1.172 3.071 1.172 4.243 0l.707-.707")
        }
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null

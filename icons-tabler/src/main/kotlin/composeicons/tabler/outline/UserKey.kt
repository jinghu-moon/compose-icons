package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserKey: ImageVector
    get() {
        if (_userKey != null) return _userKey!!
        _userKey = tablerOutlineIcon(
            name = "UserKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 7c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 4.791 14.209 3 12 3 9.791 3 8 4.791 8 7")
            addPathData("M6 21v-2c0-2.209 1.791-4 4-4h5")
            addPathData("M18.5 18.5 15 22 13.5 20.5")
            addPathData("M18.554 18.414c-.52-.502-.728-1.246-.545-1.945 .183-.699 .729-1.245 1.428-1.428 .699-.183 1.443 .025 1.945 .545 .758 .785 .747 2.032-.024 2.804-.771 .771-2.019 .782-2.804 .024")
            addPathData("M16 19l1 1")
        }
        return _userKey!!
    }

private var _userKey: ImageVector? = null

package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = tablerFilledIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 12 7 9.761 7 7l.005-.217C7.121 4.109 9.323 2 12 2Z")
            addPathData("M14 14c2.761 0 5 2.239 5 5v1c0 1.105-.895 2-2 2h-10C5.895 22 5 21.105 5 20v-1c0-2.761 2.239-5 5-5h4Z")
        }
        return _user!!
    }

private var _user: ImageVector? = null

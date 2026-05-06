package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.UserPentagon: ImageVector
    get() {
        if (_userPentagon != null) return _userPentagon!!
        _userPentagon = tablerOutlineIcon(
            name = "UserPentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.163 2.168l8.021 5.828c.694 .504 .984 1.397 .719 2.212l-3.064 9.43c-.265 .815-1.024 1.367-1.881 1.367h-9.916C6.185 21.005 5.426 20.453 5.161 19.638L2.097 10.208C1.832 9.393 2.122 8.5 2.816 7.996L10.837 2.168c.693-.504 1.633-.504 2.326 0")
            addPathData("M12 13c1.657 0 3-1.343 3-3C15 8.343 13.657 7 12 7 10.343 7 9 8.343 9 10c0 1.657 1.343 3 3 3")
            addPathData("M6 20.703v-.703c0-2.209 1.791-4 4-4h4c2.209 0 4 1.791 4 4v.707")
        }
        return _userPentagon!!
    }

private var _userPentagon: ImageVector? = null

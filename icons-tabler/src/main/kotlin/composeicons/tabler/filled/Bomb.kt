package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = tablerFilledIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.499 3.996c.584 0 1.143 .232 1.556 .645l3.302 3.301c.413 .413 .645 .973 .645 1.556 0 .584-.232 1.144-.645 1.557l-.567 .567 .043 .192c.693 3.431-.789 6.936-3.732 8.83l-.23 .144C11.613 22.74 7.455 22.294 4.685 19.695 1.915 17.095 1.206 12.974 2.949 9.599 4.691 6.223 8.461 4.413 12.184 5.165l.192 .042 .567-.566c.365-.365 .847-.59 1.362-.636ZM10 9C7.791 9 6 10.791 6 13c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-1.105 .895-2 2-2 .552 0 1-.448 1-1C11 9.448 10.552 9 10 9Z")
            addPathData("M21 2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L21 4h-1c0 .83-.302 1.629-.846 2.25L19 6.413 17.707 7.706c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L17.586 5c.232-.232 .375-.537 .407-.86L18 4c-0-1.047 .806-1.917 1.85-1.995L20 2h1Z")
        }
        return _bomb!!
    }

private var _bomb: ImageVector? = null

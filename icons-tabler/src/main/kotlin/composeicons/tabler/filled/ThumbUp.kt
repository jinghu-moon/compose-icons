package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ThumbUp: ImageVector
    get() {
        if (_thumbUp != null) return _thumbUp!!
        _thumbUp = tablerFilledIcon(
            name = "ThumbUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 3c1.589-0 2.902 1.238 2.995 2.824L16 6v4h2c1.522-0 2.802 1.139 2.98 2.65l.015 .174L21 13l-.02 .196-1.006 5.032c-.381 1.626-1.502 2.796-2.81 2.78L17 21h-8c-.507-0-.934-.38-.993-.883L8 20l.001-9.536c0-.357 .191-.687 .5-.865C9.367 9.099 9.927 8.2 9.993 7.202L10 7v-1C10 4.343 11.343 3 13 3Z")
            addPathData("M5 10c.507 0 .934 .38 .993 .883L6 11v9c-0 .507-.38 .934-.883 .993L5 21h-1C2.953 21 2.083 20.194 2.005 19.15L2 19v-7c-0-1.047 .806-1.917 1.85-1.995L4 10h1Z")
        }
        return _thumbUp!!
    }

private var _thumbUp: ImageVector? = null

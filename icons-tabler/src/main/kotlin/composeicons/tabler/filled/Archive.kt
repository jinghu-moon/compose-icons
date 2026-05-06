package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = tablerFilledIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 5C2 3.895 2.895 3 4 3h16c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-16C2.895 7 2 6.105 2 5Z")
            addPathData("M19 9c.513 0 .936 .463 .993 1.06l.007 .14v7.2c0 1.917-1.249 3.484-2.824 3.594L17 21h-10C5.402 21 4.096 19.501 4.005 17.612L4 17.4v-7.2C4 9.537 4.448 9 5 9h14ZM14 11h-4l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L10 13h4l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L14 11Z")
        }
        return _archive!!
    }

private var _archive: ImageVector? = null

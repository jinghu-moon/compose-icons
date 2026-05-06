package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigDownLine: ImageVector
    get() {
        if (_arrowBigDownLine != null) return _arrowBigDownLine!!
        _arrowBigDownLine = tablerFilledIcon(
            name = "ArrowBigDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5l-.117 .007C8.38 5.066 8 5.493 8 6v4.999L5.414 11c-.809 0-1.538 .487-1.847 1.235-.309 .747-.138 1.607 .433 2.179L10.586 21c.781 .781 2.047 .781 2.828 0L20 14.414c.572-.572 .744-1.432 .434-2.18l-.068-.145C20.024 11.421 19.337 11 18.586 11L16 10.999v-4.999C16 5.448 15.552 5 15 5h-6Z")
            addPathData("M15 2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L15 4h-6C8.471 3.999 8.034 3.587 8.003 3.059c-.031-.528 .355-.989 .88-1.052L9 2h6Z")
        }
        return _arrowBigDownLine!!
    }

private var _arrowBigDownLine: ImageVector? = null

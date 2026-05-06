package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigUpLine: ImageVector
    get() {
        if (_arrowBigUpLine != null) return _arrowBigUpLine!!
        _arrowBigUpLine = tablerFilledIcon(
            name = "ArrowBigUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.586 3 4 9.586c-.572 .572-.744 1.432-.434 2.18l.068 .145c.342 .668 1.029 1.089 1.78 1.089h2.586v5c0 .552 .448 1 1 1h6l.117-.007c.503-.059 .883-.486 .883-.993l-.001-5h2.587c.809-0 1.538-.487 1.847-1.235 .309-.747 .138-1.607-.433-2.179L13.414 3c-.781-.781-2.047-.781-2.828 0Z")
            addPathData("M15 20c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L15 22h-6c-.529-.001-.966-.413-.997-.941-.031-.528 .355-.989 .88-1.052L9 20h6Z")
        }
        return _arrowBigUpLine!!
    }

private var _arrowBigUpLine: ImageVector? = null

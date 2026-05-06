package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bike: ImageVector
    get() {
        if (_bike != null) return _bike!!
        _bike = tablerFilledIcon(
            name = "Bike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 14c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C2.791 22 1 20.209 1 18l.005-.2C1.112 15.671 2.869 14 5 14")
            addPathData("M19 14c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4l.005-.2C15.112 15.671 16.869 14 19 14")
            addPathData("M14.832 7.445 16.535 10h2.465c.507 0 .934 .38 .993 .883L20 11c0 .552-.448 1-1 1h-3c-.334 0-.646-.167-.832-.445L13.772 9.462l-3.275 2.62 2.21 2.21c.156 .156 .255 .359 .284 .577L13 15v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-3.585L8.293 12.707c-.386-.386-.39-1.011-.01-1.403l.092-.085 5-4c.219-.175 .501-.25 .778-.208 .277 .043 .523 .2 .679 .434")
            addPathData("M17 3c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2C15.895 7 15 6.105 15 5l.005-.15C15.083 3.806 15.953 3 17 3")
        }
        return _bike!!
    }

private var _bike: ImageVector? = null

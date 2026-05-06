package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileLambda: ImageVector
    get() {
        if (_fileLambda != null) return _fileLambda!!
        _fileLambda = tablerFilledIcon(
            name = "FileLambda",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.117 .007c.459 .054 .822 .417 .876 .876L13 3v4l.005 .15c.074 .984 .854 1.767 1.838 1.844L15 9h4l.117 .007c.459 .054 .822 .417 .876 .876L20 10v9c0 1.589-1.238 2.902-2.824 2.995L17 22h-10C5.411 22 4.098 20.762 4.005 19.176L4 19v-14C4 3.411 5.238 2.098 6.824 2.005L7 2ZM10 10c-.529 .001-.966 .413-.997 .941-.031 .528 .355 .989 .88 1.052L10 12c.342 0 .662 .362 1.166 1.445l-1.998 3c-.307 .46-.183 1.08 .277 1.387 .46 .307 1.08 .183 1.387-.277l1.29-1.934C12.947 17.359 13.63 18 15 18c.529-.001 .966-.413 .997-.941 .031-.528-.355-.989-.88-1.052L15 16c-.39 0-.75-.47-1.387-1.938l-.415-.976C12.213 10.812 11.542 10 10 10M14.999 2.999 19 7h-4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fileLambda!!
    }

private var _fileLambda: ImageVector? = null

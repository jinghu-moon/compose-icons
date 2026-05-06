package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropletHalf2: ImageVector
    get() {
        if (_dropletHalf2 != null) return _dropletHalf2!!
        _dropletHalf2 = tablerFilledIcon(
            name = "DropletHalf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.905 2.923l.098 .135 4.92 7.306c.579 .965 .935 2.047 1.043 3.167l.024 .326c.007 .047 .01 .094 .01 .143l-.002 .06c.056 2.3-.944 4.582-2.87 6.14-2.969 2.402-7.286 2.402-10.255 0C4.969 18.66 3.969 16.413 4.008 14.129c-.013-.111-.009-.223 .013-.333 .07-1.112 .381-2.196 .913-3.176l.172-.302L9.999 3.058c.185-.275 .426-.509 .709-.686 1.055-.66 2.446-.413 3.197 .55ZM11.845 4.03l-.077 .038-.041 .03-.037 .036-.033 .042L6.794 11.39c-.299 .5-.519 1.043-.651 1.61h11.723c-.106-.457-.271-.898-.49-1.313l-.141-.251L12.344 4.175c-.115-.156-.32-.215-.5-.145Z"),
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
        return _dropletHalf2!!
    }

private var _dropletHalf2: ImageVector? = null

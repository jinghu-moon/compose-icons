package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccountPinCircleLine: ImageVector
    get() {
        if (_accountPinCircleLine != null) return _accountPinCircleLine!!
        _accountPinCircleLine = remixIcon(
            name = "AccountPinCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.745 21.745C5.308 20.722 2 16.747 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 4.747-3.308 8.722-7.745 9.745L12 24 9.745 21.745ZM7.012 18.257c.913 .729 1.993 1.265 3.182 1.539l.559 .129L12 21.172l1.247-1.247 .559-.129c1.268-.292 2.412-.882 3.362-1.687C15.896 16.808 14.123 16 12.16 16c-2.036 0-3.869 .869-5.148 2.257ZM5.616 16.821C7.256 15.084 9.581 14 12.16 14c2.484 0 4.733 1.007 6.362 2.634C19.456 15.318 20 13.714 20 12 20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 1.796 .597 3.472 1.616 4.821ZM12 13C9.791 13 8 11.209 8 9 8 6.791 9.791 5 12 5c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM12 11c1.105 0 2-.895 2-2C14 7.895 13.105 7 12 7c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _accountPinCircleLine!!
    }

private var _accountPinCircleLine: ImageVector? = null

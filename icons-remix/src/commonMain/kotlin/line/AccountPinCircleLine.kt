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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.745 21.745 C 5.308 20.722 2.000 16.747 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 16.747 18.692 20.722 14.255 21.745 L 12.000 24.000 L 9.745 21.745 ZM 7.012 18.257 C 7.924 18.986 9.004 19.521 10.194 19.796 L 10.753 19.925 L 12.000 21.172 L 13.247 19.925 L 13.806 19.796 C 15.075 19.503 16.218 18.914 17.168 18.109 C 15.896 16.808 14.123 16.000 12.160 16.000 C 10.124 16.000 8.291 16.869 7.012 18.257 ZM 5.616 16.821 C 7.256 15.084 9.581 14.000 12.160 14.000 C 14.644 14.000 16.893 15.007 18.522 16.634 C 19.456 15.318 20.000 13.714 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.796 4.597 15.472 5.616 16.821 ZM 12.000 13.000 C 9.791 13.000 8.000 11.209 8.000 9.000 C 8.000 6.791 9.791 5.000 12.000 5.000 C 14.209 5.000 16.000 6.791 16.000 9.000 C 16.000 11.209 14.209 13.000 12.000 13.000 ZM 12.000 11.000 C 13.105 11.000 14.000 10.105 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 C 10.895 7.000 10.000 7.895 10.000 9.000 C 10.000 10.105 10.895 11.000 12.000 11.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _accountPinCircleLine!!
    }

private var _accountPinCircleLine: ImageVector? = null

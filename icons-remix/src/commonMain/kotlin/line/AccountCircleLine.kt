package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AccountCircleLine: ImageVector
    get() {
        if (_accountCircleLine != null) return _accountCircleLine!!
        _accountCircleLine = remixIcon(
            name = "AccountCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.160 16.000 C 10.124 16.000 8.292 16.869 7.013 18.256 C 8.380 19.347 10.114 20.000 12.000 20.000 C 13.969 20.000 15.773 19.288 17.167 18.108 C 15.896 16.807 14.122 16.000 12.160 16.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 13.811 4.602 15.481 5.616 16.821 C 7.256 15.084 9.581 14.000 12.160 14.000 C 14.644 14.000 16.893 15.007 18.522 16.634 C 19.453 15.327 20.000 13.727 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 12.000 5.000 C 14.209 5.000 16.000 6.791 16.000 9.000 C 16.000 11.209 14.209 13.000 12.000 13.000 C 9.791 13.000 8.000 11.209 8.000 9.000 C 8.000 6.791 9.791 5.000 12.000 5.000 ZM 12.000 7.000 C 10.895 7.000 10.000 7.895 10.000 9.000 C 10.000 10.105 10.895 11.000 12.000 11.000 C 13.105 11.000 14.000 10.105 14.000 9.000 C 14.000 7.895 13.105 7.000 12.000 7.000 Z"),
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
        return _accountCircleLine!!
    }

private var _accountCircleLine: ImageVector? = null

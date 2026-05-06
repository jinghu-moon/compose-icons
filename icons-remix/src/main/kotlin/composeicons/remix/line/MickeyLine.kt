package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MickeyLine: ImageVector
    get() {
        if (_mickeyLine != null) return _mickeyLine!!
        _mickeyLine = remixIcon(
            name = "MickeyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.617 10.913C2.555 10.503 1 8.683 1 6.5 1 4.015 3.015 2 5.5 2 7.903 2 9.866 3.883 9.993 6.254 10.635 6.088 11.307 6 12 6c.693 0 1.365 .088 2.007 .254C14.134 3.883 16.097 2 18.5 2 20.985 2 23 4.015 23 6.5c0 2.183-1.555 4.003-3.617 4.413 .398 .95 .617 1.993 .617 3.087 0 4.418-3.582 8-8 8C7.582 22 4 18.418 4 14c0-1.094 .22-2.137 .617-3.087ZM3 6.5C3 7.881 4.119 9 5.5 9c.09 0 .179-.005 .266-.014C6.366 8.241 7.097 7.606 7.924 7.115 7.974 6.918 8 6.712 8 6.5 8 5.119 6.881 4 5.5 4 4.119 4 3 5.119 3 6.5ZM18.234 8.986c.087 .009 .176 .014 .266 .014C19.881 9 21 7.881 21 6.5 21 5.119 19.881 4 18.5 4 17.119 4 16 5.119 16 6.5c0 .212 .026 .418 .076 .615 .827 .491 1.558 1.126 2.158 1.871ZM6 14c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 10.686 15.314 8 12 8 8.686 8 6 10.686 6 14Z"),
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
        return _mickeyLine!!
    }

private var _mickeyLine: ImageVector? = null

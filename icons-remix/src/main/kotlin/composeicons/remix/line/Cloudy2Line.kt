package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Cloudy2Line: ImageVector
    get() {
        if (_cloudy2Line != null) return _cloudy2Line!!
        _cloudy2Line = remixIcon(
            name = "Cloudy2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 21h-10C3.686 21 1 18.314 1 15 1 12.385 2.673 10.16 5.008 9.339 5.003 9.226 5 9.114 5 9 5 5.134 8.134 2 12 2c3.866 0 7 3.134 7 7 0 .114-.003 .226-.008 .339C21.326 10.16 23 12.385 23 15c0 3.314-2.686 6-6 6ZM7 19h10c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-.144 0-.286 .008-.426 .022C16.848 10.404 17 9.72 17 9 17 6.239 14.761 4 12 4 9.239 4 7 6.239 7 9c0 .72 .152 1.404 .426 2.022C7.286 11.008 7.144 11 7 11 4.791 11 3 12.791 3 15c0 2.209 1.791 4 4 4Z"),
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
        return _cloudy2Line!!
    }

private var _cloudy2Line: ImageVector? = null

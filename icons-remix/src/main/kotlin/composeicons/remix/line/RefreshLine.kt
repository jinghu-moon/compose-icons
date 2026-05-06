package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RefreshLine: ImageVector
    get() {
        if (_refreshLine != null) return _refreshLine!!
        _refreshLine = remixIcon(
            name = "RefreshLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.463 4.433C7.216 2.917 9.501 2 12 2c5.523 0 10 4.477 10 10 0 2.136-.67 4.116-1.811 5.741L17 12h3C20 7.582 16.418 4 12 4 9.85 4 7.898 4.848 6.46 6.228L5.463 4.433ZM18.537 19.567C16.784 21.083 14.499 22 12 22 6.477 22 2 17.523 2 12 2 9.864 2.67 7.884 3.811 6.259L7 12h-3c0 4.418 3.582 8 8 8 2.15 0 4.102-.848 5.54-2.228l.998 1.796Z"),
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
        return _refreshLine!!
    }

private var _refreshLine: ImageVector? = null

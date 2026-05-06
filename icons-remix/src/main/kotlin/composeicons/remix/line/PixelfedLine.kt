package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PixelfedLine: ImageVector
    get() {
        if (_pixelfedLine != null) return _pixelfedLine!!
        _pixelfedLine = remixIcon(
            name = "PixelfedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2ZM12.001 4C7.583 4 4.001 7.582 4.001 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM13.032 8.099c1.713 0 3.101 1.345 3.101 3.005 0 1.66-1.388 3.005-3.101 3.005h-1.818L8.619 16.58v-6.748c0-.958 .801-1.734 1.789-1.734h2.624Z"),
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
        return _pixelfedLine!!
    }

private var _pixelfedLine: ImageVector? = null

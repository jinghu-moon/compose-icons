package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Repeat2Line: ImageVector
    get() {
        if (_repeat2Line != null) return _repeat2Line!!
        _repeat2Line = remixIcon(
            name = "Repeat2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 20.000 L 8.000 21.932 C 8.000 22.209 7.776 22.432 7.500 22.432 C 7.383 22.432 7.270 22.391 7.180 22.316 L 3.061 18.884 C 2.849 18.707 2.820 18.392 2.997 18.180 C 3.092 18.066 3.233 18.000 3.381 18.000 L 18.000 18.000 C 19.105 18.000 20.000 17.104 20.000 16.000 L 20.000 8.000 L 22.000 8.000 L 22.000 16.000 C 22.000 18.209 20.209 20.000 18.000 20.000 L 8.000 20.000 ZM 16.000 4.000 L 16.000 2.068 C 16.000 1.791 16.224 1.567 16.500 1.567 C 16.617 1.567 16.730 1.609 16.820 1.683 L 20.939 5.116 C 21.151 5.293 21.180 5.608 21.003 5.820 C 20.908 5.934 20.767 6.000 20.619 6.000 L 6.000 6.000 C 4.895 6.000 4.000 6.895 4.000 8.000 L 4.000 16.000 L 2.000 16.000 L 2.000 8.000 C 2.000 5.791 3.791 4.000 6.000 4.000 L 16.000 4.000 Z"),
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
        return _repeat2Line!!
    }

private var _repeat2Line: ImageVector? = null

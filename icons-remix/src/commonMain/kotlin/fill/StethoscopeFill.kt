package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StethoscopeFill: ImageVector
    get() {
        if (_stethoscopeFill != null) return _stethoscopeFill!!
        _stethoscopeFill = remixIcon(
            name = "StethoscopeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 L 8.000 5.000 L 6.000 5.000 L 6.000 9.000 C 6.000 11.209 7.791 13.000 10.000 13.000 C 12.209 13.000 14.000 11.209 14.000 9.000 L 14.000 5.000 L 12.000 5.000 L 12.000 3.000 L 15.000 3.000 C 15.552 3.000 16.000 3.448 16.000 4.000 L 16.000 9.000 C 16.000 11.973 13.838 14.441 11.001 14.917 L 11.000 16.500 C 11.000 18.433 12.567 20.000 14.500 20.000 C 15.997 20.000 17.275 19.060 17.775 17.737 C 16.728 17.270 16.000 16.220 16.000 15.000 C 16.000 13.343 17.343 12.000 19.000 12.000 C 20.657 12.000 22.000 13.343 22.000 15.000 C 22.000 16.371 21.080 17.527 19.824 17.885 C 19.210 20.252 17.059 22.000 14.500 22.000 C 11.462 22.000 9.000 19.538 9.000 16.500 L 9.000 14.917 C 6.162 14.441 4.000 11.973 4.000 9.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 L 8.000 3.000 Z"),
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
        return _stethoscopeFill!!
    }

private var _stethoscopeFill: ImageVector? = null

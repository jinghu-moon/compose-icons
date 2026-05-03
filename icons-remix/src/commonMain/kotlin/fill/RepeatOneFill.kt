package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RepeatOneFill: ImageVector
    get() {
        if (_repeatOneFill != null) return _repeatOneFill!!
        _repeatOneFill = remixIcon(
            name = "RepeatOneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 20.000 L 8.000 21.933 C 8.000 22.209 7.776 22.433 7.500 22.433 C 7.383 22.433 7.270 22.392 7.180 22.317 L 3.061 18.884 C 2.849 18.707 2.820 18.392 2.997 18.180 C 3.092 18.066 3.233 18.000 3.381 18.000 L 8.000 18.000 L 18.000 18.000 C 19.105 18.000 20.000 17.105 20.000 16.000 L 20.000 8.000 L 22.000 8.000 L 22.000 16.000 C 22.000 18.209 20.209 20.000 18.000 20.000 L 8.000 20.000 ZM 16.000 4.000 L 16.000 2.068 C 16.000 1.791 16.224 1.567 16.500 1.567 C 16.617 1.567 16.730 1.609 16.820 1.683 L 20.939 5.116 C 21.151 5.293 21.180 5.608 21.003 5.820 C 20.908 5.934 20.767 6.000 20.619 6.000 L 16.000 6.000 L 6.000 6.000 C 4.895 6.000 4.000 6.895 4.000 8.000 L 4.000 16.000 L 2.000 16.000 L 2.000 8.000 C 2.000 5.791 3.791 4.000 6.000 4.000 L 16.000 4.000 ZM 11.000 8.000 L 13.000 8.000 L 13.000 16.000 L 11.000 16.000 L 11.000 10.000 L 9.000 10.000 L 9.000 9.000 L 11.000 8.000 Z"),
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
        return _repeatOneFill!!
    }

private var _repeatOneFill: ImageVector? = null

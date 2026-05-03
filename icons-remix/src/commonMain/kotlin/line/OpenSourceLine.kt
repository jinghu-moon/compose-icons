package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OpenSourceLine: ImageVector
    get() {
        if (_openSourceLine != null) return _openSourceLine!!
        _openSourceLine = remixIcon(
            name = "OpenSourceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 16.400 19.160 20.135 15.212 21.473 L 14.986 21.547 L 12.082 13.997 C 13.151 13.950 14.001 13.054 14.001 12.000 C 14.001 10.895 13.106 10.000 12.001 10.000 C 10.896 10.000 10.001 10.895 10.001 12.000 C 10.001 13.077 10.852 13.955 11.918 13.998 L 9.015 21.547 L 8.790 21.473 C 4.842 20.135 2.001 16.400 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 ZM 12.001 4.000 C 7.583 4.000 4.001 7.582 4.001 12.000 C 4.001 14.920 5.565 17.475 7.902 18.872 L 9.381 15.023 C 8.536 14.290 8.001 13.207 8.001 12.000 C 8.001 9.791 9.792 8.000 12.001 8.000 C 14.210 8.000 16.001 9.791 16.001 12.000 C 16.001 13.208 15.466 14.290 14.620 15.023 C 15.186 16.497 15.680 17.780 16.100 18.873 C 18.436 17.475 20.001 14.920 20.001 12.000 C 20.001 7.582 16.419 4.000 12.001 4.000 Z"),
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
        return _openSourceLine!!
    }

private var _openSourceLine: ImageVector? = null

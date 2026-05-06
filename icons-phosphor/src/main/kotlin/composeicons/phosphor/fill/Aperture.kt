package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorFillIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 128C232.001 85.935 206.662 48.012 167.799 31.915 128.937 15.817 84.204 24.715 54.46 54.46 24.715 84.204 15.817 128.937 31.915 167.799 48.012 206.662 85.935 232.001 128 232h.09C185.492 231.95 232 185.402 232 128ZM49.18 88.92l51.21 9.35L46.65 161.53C37.047 138.083 37.969 111.642 49.18 88.92ZM209.35 94.46c9.603 23.451 8.682 49.895-2.53 72.62l-51.21-9.35ZM201.27 79.26 167.55 119 139.63 40.78c19.168 2.507 36.963 11.299 50.6 25 4.113 4.12 7.811 8.635 11.04 13.48ZM122.43 40.19l17.51 49L58.3 74.32c2.306-3.006 4.801-5.861 7.47-8.55C80.882 50.585 101.046 41.482 122.43 40.19ZM54.73 176.74 88.45 137l27.92 78.18C91.24 211.831 68.774 197.807 54.73 176.7ZM133.57 215.8l-17.51-49L139.14 171h0l58.52 10.69c-15.423 20.129-38.819 32.577-64.13 34.12Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null

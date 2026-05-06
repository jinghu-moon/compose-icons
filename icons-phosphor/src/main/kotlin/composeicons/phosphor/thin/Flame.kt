package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorThinIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.9 54.24C158.713 41.391 144.997 30.083 130.06 20.57c-1.268-.762-2.852-.762-4.12 0C111.003 30.083 97.287 41.391 85.1 54.24 58.21 82.48 44 113.51 44 144c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 113.51 197.79 82.48 170.9 54.24ZM92 184c0-32.11 28.07-53.75 36-59.21 7.93 5.47 36 27.1 36 59.21 0 19.882-16.118 36-36 36C108.118 220 92 203.882 92 184ZM161.94 212c6.516-7.874 10.075-17.779 10.06-28 0-41.78-40.23-66.4-41.94-67.43-1.268-.762-2.852-.762-4.12 0C124.23 117.6 84 142.22 84 184c-.015 10.221 3.544 20.126 10.06 28C68.298 199.123 52.017 172.801 52 144 52 81.52 115.64 36.83 128 28.74c12.36 8.09 76 52.78 76 115.26-.017 28.801-16.298 55.123-42.06 68Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null

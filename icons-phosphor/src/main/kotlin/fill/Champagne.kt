package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorFillIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 149.910 13.530 C 148.840 10.232 145.767 8.000 142.300 8.000 L 97.710 8.000 C 94.243 8.000 91.170 10.232 90.100 13.530 C 84.013 33.084 79.266 53.030 75.890 73.230 C 68.630 117.480 71.540 148.990 84.540 166.890 C 90.989 175.987 100.943 181.978 112.000 183.420 L 112.000 232.000 L 96.000 232.000 C 91.582 232.000 88.000 235.582 88.000 240.000 C 88.000 244.418 91.582 248.000 96.000 248.000 L 144.000 248.000 C 148.418 248.000 152.000 244.418 152.000 240.000 C 152.000 235.582 148.418 232.000 144.000 232.000 L 128.000 232.000 L 128.000 183.420 C 139.060 181.985 149.016 175.992 155.460 166.890 C 168.460 148.990 171.380 117.480 164.120 73.230 C 160.744 53.030 155.997 33.084 149.910 13.530 ZM 93.800 64.000 C 96.800 48.420 100.530 34.190 103.590 24.000 L 136.420 24.000 C 139.480 34.190 143.190 48.420 146.220 64.000 ZM 232.000 52.000 C 232.000 58.627 226.627 64.000 220.000 64.000 C 213.373 64.000 208.000 58.627 208.000 52.000 C 208.000 45.373 213.373 40.000 220.000 40.000 C 226.627 40.000 232.000 45.373 232.000 52.000 ZM 184.000 20.000 C 184.000 13.373 189.373 8.000 196.000 8.000 C 202.627 8.000 208.000 13.373 208.000 20.000 C 208.000 26.627 202.627 32.000 196.000 32.000 C 189.373 32.000 184.000 26.627 184.000 20.000 ZM 208.000 100.000 C 208.000 106.627 202.627 112.000 196.000 112.000 C 189.373 112.000 184.000 106.627 184.000 100.000 C 184.000 93.373 189.373 88.000 196.000 88.000 C 202.627 88.000 208.000 93.373 208.000 100.000 Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null

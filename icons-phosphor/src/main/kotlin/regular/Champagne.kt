package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorRegularIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 20.000 C 184.000 13.373 189.373 8.000 196.000 8.000 C 202.627 8.000 208.000 13.373 208.000 20.000 C 208.000 26.627 202.627 32.000 196.000 32.000 C 189.373 32.000 184.000 26.627 184.000 20.000 ZM 164.120 73.230 C 171.380 117.480 168.470 148.990 155.460 166.890 C 149.016 175.992 139.060 181.985 128.000 183.420 L 128.000 232.000 L 144.000 232.000 C 148.418 232.000 152.000 235.582 152.000 240.000 C 152.000 244.418 148.418 248.000 144.000 248.000 L 96.000 248.000 C 91.582 248.000 88.000 244.418 88.000 240.000 C 88.000 235.582 91.582 232.000 96.000 232.000 L 112.000 232.000 L 112.000 183.420 C 100.943 181.978 90.989 175.987 84.540 166.890 C 71.540 148.990 68.630 117.480 75.890 73.230 C 79.266 53.030 84.013 33.084 90.100 13.530 C 91.170 10.232 94.243 8.000 97.710 8.000 L 142.300 8.000 C 145.767 8.000 148.840 10.232 149.910 13.530 C 155.997 33.084 160.744 53.030 164.120 73.230 ZM 93.800 64.000 L 146.200 64.000 C 143.200 48.420 139.480 34.190 136.420 24.000 L 103.590 24.000 C 100.530 34.190 96.830 48.420 93.800 64.000 ZM 149.000 80.000 L 91.000 80.000 C 86.510 110.000 85.860 141.540 97.450 157.490 C 102.630 164.560 110.000 168.000 120.000 168.000 C 130.000 168.000 137.380 164.560 142.520 157.490 C 154.100 141.540 153.460 110.000 149.000 80.000 ZM 220.000 40.000 C 213.373 40.000 208.000 45.373 208.000 52.000 C 208.000 58.627 213.373 64.000 220.000 64.000 C 226.627 64.000 232.000 58.627 232.000 52.000 C 232.000 45.373 226.627 40.000 220.000 40.000 ZM 196.000 88.000 C 189.373 88.000 184.000 93.373 184.000 100.000 C 184.000 106.627 189.373 112.000 196.000 112.000 C 202.627 112.000 208.000 106.627 208.000 100.000 C 208.000 93.373 202.627 88.000 196.000 88.000 Z"),
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

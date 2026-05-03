package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaintBrush: ImageVector
    get() {
        if (_paintBrush != null) return _paintBrush!!
        _paintBrush = phosphorFillIcon(
            name = "PaintBrush",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 32.000 C 232.000 27.582 228.418 24.000 224.000 24.000 C 179.920 24.000 134.690 73.710 109.570 106.630 C 91.377 101.058 71.620 104.446 56.322 115.760 C 41.025 127.074 32.000 144.973 32.000 164.000 C 32.000 194.880 12.460 208.730 11.530 209.370 C 8.617 211.337 7.329 214.976 8.356 218.338 C 9.383 221.699 12.485 223.997 16.000 224.000 L 92.000 224.000 C 111.027 224.000 128.926 214.975 140.240 199.678 C 151.554 184.380 154.942 164.623 149.370 146.430 C 182.300 121.310 232.000 76.080 232.000 32.000 ZM 124.420 113.550 Q 129.560 106.890 134.510 101.000 C 142.587 106.457 149.543 113.413 155.000 121.490 Q 149.100 126.430 142.450 131.580 C 137.788 124.358 131.642 118.212 124.420 113.550 ZM 167.120 110.870 C 161.080 102.348 153.642 94.910 145.120 88.870 C 176.900 54.340 200.870 43.870 215.020 40.960 C 212.170 55.120 201.650 79.090 167.120 110.870 Z"),
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
        return _paintBrush!!
    }

private var _paintBrush: ImageVector? = null

package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorBoldIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 186.620 61.050 C 172.860 39.430 152.620 28.050 128.000 28.050 C 103.380 28.050 83.140 39.430 69.380 61.050 C 58.170 78.660 52.000 102.440 52.000 128.000 C 52.000 153.560 58.170 177.330 69.380 194.940 C 83.140 216.570 103.410 228.000 128.000 228.000 C 152.590 228.000 172.860 216.570 186.620 194.940 C 197.830 177.330 204.000 153.560 204.000 128.000 C 204.000 102.440 197.830 78.660 186.620 61.050 ZM 166.370 182.050 C 157.110 196.620 144.200 204.000 128.000 204.000 C 111.800 204.000 98.890 196.620 89.630 182.060 C 80.840 168.250 76.000 149.050 76.000 128.000 C 76.000 106.950 80.840 87.750 89.630 73.940 C 98.890 59.380 111.800 52.000 128.000 52.000 C 144.200 52.000 157.110 59.380 166.370 73.940 C 175.160 87.750 180.000 107.000 180.000 128.000 C 180.000 149.000 175.160 168.250 166.370 182.060 Z"),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null

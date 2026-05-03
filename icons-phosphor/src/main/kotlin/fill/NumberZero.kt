package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorFillIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 157.680 88.390 C 164.340 98.520 168.000 112.590 168.000 128.000 C 168.000 143.410 164.340 157.470 157.680 167.610 C 150.550 178.490 140.560 184.000 128.000 184.000 C 115.440 184.000 105.450 178.490 98.320 167.610 C 91.660 157.470 88.000 143.410 88.000 128.000 C 88.000 112.590 91.660 98.520 98.320 88.390 C 105.450 77.510 115.440 72.000 128.000 72.000 C 140.560 72.000 150.550 77.510 157.680 88.390 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 184.000 128.000 C 184.000 109.510 179.400 92.320 171.060 79.610 C 160.920 64.160 146.000 56.000 128.000 56.000 C 110.000 56.000 95.080 64.160 84.940 79.610 C 76.600 92.320 72.000 109.510 72.000 128.000 C 72.000 146.490 76.600 163.680 84.940 176.390 C 95.080 191.840 110.000 200.000 128.000 200.000 C 146.000 200.000 160.920 191.840 171.060 176.390 C 179.400 163.680 184.000 146.490 184.000 128.000 Z"),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null

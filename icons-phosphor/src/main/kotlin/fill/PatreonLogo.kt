package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorFillIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 93.170 C 232.000 134.170 202.310 145.640 178.450 154.840 C 170.040 158.080 162.100 161.140 156.240 165.120 C 144.850 172.840 137.650 186.900 130.690 200.500 C 120.750 219.920 110.460 240.000 87.520 240.000 C 74.610 240.000 62.910 228.360 53.670 206.340 C 44.430 184.320 39.360 155.340 40.060 128.890 C 41.140 88.240 54.640 66.210 65.760 54.890 C 80.710 39.690 101.000 29.590 124.440 25.690 C 146.230 22.070 168.580 24.310 187.370 31.990 C 215.730 43.600 232.000 65.900 232.000 93.170 Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null

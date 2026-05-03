package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorThinIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 179.870 65.350 C 167.650 46.150 149.710 36.000 128.000 36.000 C 106.290 36.000 88.350 46.150 76.130 65.350 C 65.730 81.690 60.000 103.940 60.000 128.000 C 60.000 152.060 65.730 174.310 76.130 190.650 C 88.350 209.850 106.290 220.000 128.000 220.000 C 149.710 220.000 167.650 209.850 179.870 190.650 C 190.270 174.310 196.000 152.060 196.000 128.000 C 196.000 103.940 190.270 81.690 179.870 65.350 ZM 128.000 212.000 C 86.550 212.000 68.000 169.810 68.000 128.000 C 68.000 86.190 86.550 44.000 128.000 44.000 C 169.450 44.000 188.000 86.190 188.000 128.000 C 188.000 169.810 169.450 212.000 128.000 212.000 Z"),
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

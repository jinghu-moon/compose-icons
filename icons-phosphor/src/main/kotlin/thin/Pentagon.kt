package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pentagon: ImageVector
    get() {
        if (_pentagon != null) return _pentagon!!
        _pentagon = phosphorThinIcon(
            name = "Pentagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.140 90.740 L 135.190 22.400 L 135.100 22.330 C 130.877 19.234 125.133 19.234 120.910 22.330 L 120.820 22.400 L 32.870 90.740 C 28.753 93.789 27.026 99.115 28.570 104.000 L 60.570 211.700 C 62.176 216.654 66.793 220.006 72.000 220.000 L 184.000 220.000 C 189.241 219.995 193.872 216.591 195.440 211.590 L 227.440 104.060 C 229.013 99.157 227.282 93.798 223.140 90.740 ZM 219.780 101.740 L 187.780 209.280 C 187.232 210.902 185.712 211.996 184.000 212.000 L 72.000 212.000 C 70.292 212.005 68.769 210.924 68.210 209.310 L 36.210 101.610 C 35.682 99.971 36.262 98.179 37.650 97.160 L 37.740 97.090 L 125.680 28.760 C 127.071 27.767 128.939 27.767 130.330 28.760 L 218.270 97.090 L 218.360 97.160 C 219.775 98.196 220.351 100.032 219.780 101.690 Z"),
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
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null

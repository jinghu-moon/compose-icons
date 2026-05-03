package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorBoldIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.400 86.850 C 233.142 75.760 223.316 67.845 212.000 68.000 L 150.590 68.000 C 162.476 58.421 167.028 42.388 161.949 27.992 C 156.870 13.597 143.265 3.970 128.000 3.970 C 112.735 3.970 99.130 13.597 94.051 27.992 C 88.972 42.388 93.524 58.421 105.410 68.000 L 44.000 68.000 C 32.741 68.028 23.014 75.879 20.612 86.879 C 18.210 97.879 23.777 109.071 34.000 113.790 L 34.190 113.880 L 81.820 134.880 L 61.760 211.000 C 56.979 222.837 62.300 236.345 73.870 241.740 C 77.039 243.230 80.498 244.002 84.000 244.000 C 93.115 244.016 101.452 238.867 105.520 230.710 L 128.000 191.910 L 150.510 230.710 C 156.249 242.271 170.102 247.223 181.869 241.919 C 193.636 236.616 199.101 222.956 194.240 211.000 L 174.240 134.850 L 221.870 113.850 L 222.060 113.760 C 232.392 109.157 237.993 97.860 235.400 86.850 ZM 128.000 28.000 C 134.627 28.000 140.000 33.373 140.000 40.000 C 140.000 46.627 134.627 52.000 128.000 52.000 C 121.373 52.000 116.000 46.627 116.000 40.000 C 116.000 33.373 121.373 28.000 128.000 28.000 ZM 155.160 117.000 C 149.776 119.375 146.909 125.305 148.390 131.000 L 171.260 218.000 C 171.443 218.687 171.687 219.357 171.990 220.000 C 171.840 219.680 171.670 219.360 171.490 219.050 L 138.380 162.000 C 136.233 158.299 132.278 156.021 128.000 156.021 C 123.722 156.021 119.767 158.299 117.620 162.000 L 84.510 219.050 C 84.330 219.360 84.160 219.680 84.010 220.000 C 84.313 219.357 84.557 218.687 84.740 218.000 L 107.610 131.080 C 109.091 125.385 106.224 119.455 100.840 117.080 L 44.000 92.000 L 212.000 92.000 Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null

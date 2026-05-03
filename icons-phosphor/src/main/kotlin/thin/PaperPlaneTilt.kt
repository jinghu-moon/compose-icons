package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorThinIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.470 31.520 C 221.384 28.418 216.842 27.265 212.650 28.520 L 20.740 86.670 C 15.931 88.026 12.466 92.221 12.041 97.199 C 11.616 102.178 14.320 106.898 18.830 109.050 L 105.000 151.000 L 146.920 237.150 C 148.882 241.348 153.106 244.022 157.740 244.000 C 158.080 244.000 158.430 244.000 158.740 244.000 C 163.709 243.612 167.909 240.167 169.260 235.370 L 227.470 43.370 L 227.470 43.290 C 228.710 39.113 227.558 34.594 224.470 31.520 ZM 219.850 41.060 L 161.620 233.060 C 161.165 234.671 159.754 235.828 158.085 235.959 C 156.417 236.091 154.842 235.170 154.140 233.650 L 112.840 148.790 L 162.840 98.790 C 164.403 97.227 164.403 94.693 162.840 93.130 C 161.277 91.567 158.743 91.567 157.180 93.130 L 107.180 143.130 L 22.280 101.820 C 20.729 101.127 19.810 99.506 20.010 97.820 C 20.132 96.113 21.346 94.681 23.010 94.280 L 214.900 36.160 C 215.257 36.055 215.628 36.001 216.000 36.000 C 217.050 36.015 218.052 36.442 218.790 37.190 C 219.825 38.189 220.231 39.673 219.850 41.060 Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null

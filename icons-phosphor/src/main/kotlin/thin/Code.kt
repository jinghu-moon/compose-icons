package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorThinIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 66.560 91.070 L 22.250 128.000 L 66.560 164.930 C 67.851 166.009 68.330 167.780 67.757 169.362 C 67.184 170.944 65.682 171.998 64.000 172.000 C 63.063 172.004 62.156 171.674 61.440 171.070 L 13.440 131.070 C 12.530 130.310 12.004 129.186 12.004 128.000 C 12.004 126.814 12.530 125.690 13.440 124.930 L 61.440 84.930 C 63.142 83.613 65.581 83.879 66.959 85.532 C 68.338 87.185 68.161 89.632 66.560 91.070 ZM 242.560 124.930 L 194.560 84.930 C 193.471 83.952 191.934 83.647 190.554 84.135 C 189.173 84.623 188.170 85.826 187.938 87.272 C 187.706 88.717 188.282 90.174 189.440 91.070 L 233.750 128.000 L 189.440 164.930 C 188.282 165.826 187.706 167.283 187.938 168.728 C 188.170 170.174 189.173 171.377 190.554 171.865 C 191.934 172.353 193.471 172.048 194.560 171.070 L 242.560 131.070 C 243.470 130.310 243.996 129.186 243.996 128.000 C 243.996 126.814 243.470 125.690 242.560 124.930 ZM 161.370 36.240 C 160.373 35.876 159.272 35.924 158.310 36.372 C 157.348 36.820 156.603 37.632 156.240 38.630 L 92.240 214.630 C 91.876 215.627 91.924 216.728 92.372 217.690 C 92.820 218.652 93.632 219.397 94.630 219.760 C 95.070 219.917 95.533 219.998 96.000 220.000 C 97.682 220.001 99.184 218.950 99.760 217.370 L 163.760 41.370 C 164.124 40.373 164.076 39.272 163.628 38.310 C 163.180 37.348 162.368 36.603 161.370 36.240 Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null

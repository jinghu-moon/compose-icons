package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Checks: ImageVector
    get() {
        if (_checks != null) return _checks!!
        _checks = phosphorBoldIcon(
            name = "Checks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.410 88.560 L 62.810 176.560 C 58.141 181.147 50.659 181.147 45.990 176.560 L 7.590 138.850 C 2.860 134.205 2.790 126.605 7.435 121.875 C 12.080 117.145 19.680 117.075 24.410 121.720 L 54.410 151.180 L 135.600 71.440 C 140.328 66.795 147.925 66.862 152.570 71.590 C 157.215 76.318 157.148 83.915 152.420 88.560 ZM 248.560 71.560 C 246.328 69.281 243.281 67.983 240.091 67.955 C 236.901 67.927 233.831 69.170 231.560 71.410 L 150.400 151.180 L 142.520 143.440 C 137.792 138.795 130.195 138.862 125.550 143.590 C 120.905 148.318 120.972 155.915 125.700 160.560 L 141.990 176.560 C 146.659 181.147 154.141 181.147 158.810 176.560 L 248.410 88.560 C 250.680 86.330 251.971 83.289 252.000 80.106 C 252.028 76.924 250.790 73.860 248.560 71.590 Z"),
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
        return _checks!!
    }

private var _checks: ImageVector? = null

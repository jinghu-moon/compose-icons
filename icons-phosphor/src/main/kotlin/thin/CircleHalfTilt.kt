package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorThinIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 188.000 197.720 C 180.828 203.936 172.731 208.997 164.000 212.720 L 164.000 97.720 L 188.000 73.720 ZM 100.000 161.660 L 124.000 137.660 L 124.000 219.900 C 115.847 219.558 107.776 218.132 100.000 215.660 ZM 92.000 212.660 C 82.384 208.562 73.540 202.849 65.850 195.770 L 92.000 169.660 ZM 132.000 129.660 L 156.000 105.660 L 156.000 215.660 C 148.224 218.134 140.153 219.560 132.000 219.900 ZM 36.000 128.000 C 36.006 91.520 57.565 58.489 90.957 43.801 C 124.350 29.113 163.266 35.542 190.160 60.190 L 60.160 190.190 C 44.553 173.248 35.923 151.035 36.000 128.000 ZM 196.000 190.000 L 196.000 66.000 C 228.039 101.125 228.039 154.875 196.000 190.000 Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null

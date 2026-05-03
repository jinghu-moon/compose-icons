package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorLightIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 67.840 92.610 L 25.370 128.000 L 67.840 163.390 C 69.507 164.756 70.313 166.911 69.952 169.036 C 69.591 171.160 68.119 172.928 66.094 173.667 C 64.070 174.406 61.805 174.002 60.160 172.610 L 12.160 132.610 C 10.792 131.470 10.000 129.781 10.000 128.000 C 10.000 126.219 10.792 124.530 12.160 123.390 L 60.160 83.390 C 62.709 81.301 66.464 81.659 68.573 84.191 C 70.682 86.722 70.355 90.481 67.840 92.610 ZM 243.840 123.390 L 195.840 83.390 C 194.195 81.998 191.930 81.594 189.906 82.333 C 187.881 83.072 186.409 84.840 186.048 86.964 C 185.687 89.089 186.493 91.244 188.160 92.610 L 230.630 128.000 L 188.160 163.390 C 186.493 164.756 185.687 166.911 186.048 169.036 C 186.409 171.160 187.881 172.928 189.906 173.667 C 191.930 174.406 194.195 174.002 195.840 172.610 L 243.840 132.610 C 245.208 131.470 246.000 129.781 246.000 128.000 C 246.000 126.219 245.208 124.530 243.840 123.390 ZM 162.050 34.390 C 160.552 33.847 158.899 33.922 157.456 34.600 C 156.013 35.277 154.899 36.500 154.360 38.000 L 90.360 214.000 C 89.265 217.114 90.891 220.528 94.000 221.640 C 94.642 221.870 95.318 221.992 96.000 222.000 C 98.524 222.000 100.778 220.422 101.640 218.050 L 165.640 42.050 C 166.184 40.554 166.111 38.904 165.438 37.461 C 164.765 36.019 163.546 34.903 162.050 34.360 Z"),
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

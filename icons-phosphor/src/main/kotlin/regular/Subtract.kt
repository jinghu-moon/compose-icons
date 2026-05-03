package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorRegularIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 174.630 81.350 C 167.243 41.632 131.402 13.654 91.078 16.129 C 50.755 18.604 18.604 50.755 16.129 91.078 C 13.654 131.402 41.632 167.243 81.350 174.630 C 88.737 214.348 124.578 242.326 164.902 239.851 C 205.225 237.376 237.376 205.225 239.851 164.902 C 242.326 124.578 214.348 88.737 174.630 81.350 ZM 224.000 160.000 C 224.000 161.520 223.930 163.000 223.820 164.510 L 173.820 114.510 C 175.118 109.097 175.849 103.564 176.000 98.000 C 204.308 105.239 224.082 130.781 224.000 160.000 ZM 146.600 157.910 L 199.210 210.530 C 194.283 214.361 188.822 217.450 183.000 219.700 L 131.140 167.840 C 136.655 165.131 141.843 161.799 146.600 157.910 ZM 157.910 146.600 C 161.798 141.849 165.130 136.668 167.840 131.160 L 219.700 183.000 C 217.448 188.815 214.359 194.269 210.530 199.190 ZM 32.000 96.000 C 32.000 60.654 60.654 32.000 96.000 32.000 C 131.346 32.000 160.000 60.654 160.000 96.000 C 160.000 131.346 131.346 160.000 96.000 160.000 C 60.670 159.961 32.039 131.330 32.000 96.000 ZM 98.000 176.000 C 103.559 175.864 109.089 175.151 114.500 173.870 L 164.500 223.870 C 163.010 223.980 161.500 224.050 159.990 224.050 C 130.760 224.122 105.219 204.324 98.000 176.000 Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null

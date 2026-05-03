package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorLightIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.910 74.790 L 181.220 30.100 C 178.594 27.474 175.033 25.999 171.320 25.999 C 167.607 25.999 164.046 27.474 161.420 30.100 L 38.100 153.410 C 35.469 156.032 33.993 159.596 34.000 163.310 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 92.690 222.000 C 96.404 222.007 99.968 220.531 102.590 217.900 L 188.750 131.740 L 193.360 150.160 L 155.760 187.760 C 154.225 189.272 153.618 191.492 154.172 193.575 C 154.725 195.658 156.353 197.284 158.437 197.835 C 160.520 198.386 162.739 197.777 164.250 196.240 L 204.250 156.240 C 205.742 154.750 206.342 152.586 205.830 150.540 L 198.650 121.840 L 225.910 94.590 C 228.536 91.964 230.011 88.403 230.011 84.690 C 230.011 80.977 228.536 77.416 225.910 74.790 ZM 46.000 208.000 L 46.000 174.490 L 81.520 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 ZM 96.000 207.510 L 48.480 160.000 L 136.000 72.490 L 183.520 120.000 ZM 217.420 86.100 L 192.000 111.520 L 144.490 64.000 L 169.900 38.590 C 170.275 38.214 170.784 38.003 171.315 38.003 C 171.846 38.003 172.355 38.214 172.730 38.590 L 217.420 83.270 C 217.796 83.645 218.007 84.154 218.007 84.685 C 218.007 85.216 217.796 85.725 217.420 86.100 Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorLightIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 80.000 C 237.999 54.929 222.900 32.326 199.739 22.726 C 176.579 13.127 149.916 18.420 132.180 36.140 L 62.100 105.410 C 59.469 108.032 57.993 111.596 58.000 115.310 L 58.000 189.520 L 27.760 219.760 C 26.155 221.256 25.494 223.508 26.037 225.634 C 26.580 227.760 28.240 229.420 30.366 229.963 C 32.492 230.506 34.744 229.845 36.240 228.240 L 66.480 198.000 L 140.690 198.000 C 144.404 198.007 147.968 196.531 150.590 193.900 L 150.590 193.900 L 219.420 124.270 L 219.420 124.270 L 219.810 123.870 C 231.493 112.266 238.044 96.467 238.000 80.000 ZM 140.640 44.640 C 159.931 25.507 190.971 25.281 210.539 44.131 C 230.106 62.981 231.040 94.008 212.640 114.000 L 150.480 114.000 L 188.240 76.240 C 190.443 73.876 190.378 70.192 188.093 67.907 C 185.808 65.622 182.124 65.557 179.760 67.760 L 131.760 115.760 L 131.760 115.760 L 118.000 129.520 L 118.000 67.000 ZM 70.000 115.310 C 69.999 114.792 70.200 114.293 70.560 113.920 L 106.000 78.920 L 106.000 141.550 L 70.000 177.550 ZM 142.090 185.420 C 141.717 185.789 141.215 185.998 140.690 186.000 L 78.480 186.000 L 116.240 148.250 L 116.240 148.250 L 138.480 126.000 L 200.830 126.000 Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null

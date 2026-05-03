package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorLightIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.240 67.760 L 188.240 19.760 C 185.876 17.557 182.192 17.622 179.907 19.907 C 177.622 22.192 177.557 25.876 179.760 28.240 L 199.510 48.000 L 168.000 79.510 L 132.240 43.760 C 130.744 42.155 128.492 41.494 126.366 42.037 C 124.240 42.580 122.580 44.240 122.037 46.366 C 121.494 48.492 122.155 50.744 123.760 52.240 L 131.510 60.000 L 46.100 145.410 C 43.469 148.032 41.993 151.596 42.000 155.310 L 42.000 205.510 L 19.760 227.760 C 18.155 229.256 17.494 231.508 18.037 233.634 C 18.580 235.760 20.240 237.420 22.366 237.963 C 24.492 238.506 26.744 237.845 28.240 236.240 L 50.490 214.000 L 100.690 214.000 C 104.404 214.007 107.968 212.531 110.590 209.900 L 196.000 124.490 L 203.760 132.240 C 206.124 134.443 209.808 134.378 212.093 132.093 C 214.378 129.808 214.443 126.124 212.240 123.760 L 176.490 88.000 L 208.000 56.490 L 227.760 76.240 C 230.124 78.443 233.808 78.378 236.093 76.093 C 238.378 73.808 238.443 70.124 236.240 67.760 ZM 102.100 201.410 C 101.727 201.786 101.220 201.998 100.690 202.000 L 54.000 202.000 L 54.000 155.310 C 54.002 154.780 54.214 154.273 54.590 153.900 L 74.000 134.490 L 95.760 156.240 C 97.256 157.845 99.508 158.506 101.634 157.963 C 103.760 157.420 105.420 155.760 105.963 153.634 C 106.506 151.508 105.845 149.256 104.240 147.760 L 82.490 126.000 L 98.000 110.490 L 119.760 132.240 C 122.124 134.443 125.808 134.378 128.093 132.093 C 130.378 129.808 130.443 126.124 128.240 123.760 L 106.490 102.000 L 140.000 68.490 L 187.510 116.000 Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null

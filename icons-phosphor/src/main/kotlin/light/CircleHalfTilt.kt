package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorLightIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.120 55.880 C 174.423 29.763 136.693 19.435 101.277 28.823 C 65.861 38.211 38.202 65.873 28.816 101.289 C 19.430 136.706 29.761 174.435 55.880 200.130 C 81.577 226.247 119.307 236.575 154.723 227.187 C 190.139 217.799 217.798 190.137 227.184 154.721 C 236.570 119.304 226.239 81.575 200.120 55.880 ZM 90.000 209.620 C 82.300 206.020 75.152 201.343 68.770 195.730 L 90.000 174.490 ZM 122.000 217.780 C 115.220 217.345 108.510 216.144 102.000 214.200 L 102.000 162.490 L 122.000 142.490 ZM 154.000 214.200 C 147.490 216.146 140.781 217.347 134.000 217.780 L 134.000 130.490 L 154.000 110.490 ZM 186.000 196.800 C 179.934 201.947 173.208 206.262 166.000 209.630 L 166.000 98.490 L 186.000 78.490 ZM 60.270 187.240 C 29.050 151.583 30.832 97.825 64.343 64.313 C 97.855 30.802 151.613 29.020 187.270 60.240 ZM 198.000 184.570 L 198.000 71.430 C 224.668 104.429 224.668 151.571 198.000 184.570 Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null

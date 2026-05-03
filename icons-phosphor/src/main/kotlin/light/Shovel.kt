package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorLightIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.240 59.760 L 196.240 11.760 C 193.876 9.557 190.192 9.622 187.907 11.907 C 185.622 14.192 185.557 17.876 187.760 20.240 L 207.520 40.000 L 133.660 113.860 L 97.900 78.100 C 95.274 75.474 91.713 73.999 88.000 73.999 C 84.287 73.999 80.726 75.474 78.100 78.100 L 22.100 134.100 C 19.469 136.722 17.993 140.286 18.000 144.000 L 18.000 224.000 C 18.000 231.732 24.268 238.000 32.000 238.000 L 112.000 238.000 C 115.714 238.007 119.278 236.531 121.900 233.900 L 177.900 177.900 C 180.526 175.274 182.001 171.713 182.001 168.000 C 182.001 164.287 180.526 160.726 177.900 158.100 L 142.140 122.340 L 216.000 48.480 L 235.760 68.240 C 237.256 69.845 239.508 70.506 241.634 69.963 C 243.760 69.420 245.420 67.760 245.963 65.634 C 246.506 63.508 245.845 61.256 244.240 59.760 ZM 169.410 166.580 C 169.789 166.956 170.002 167.467 170.002 168.000 C 170.002 168.533 169.789 169.044 169.410 169.420 L 113.410 225.420 C 113.035 225.792 112.528 226.000 112.000 226.000 L 32.000 226.000 C 30.895 226.000 30.000 225.105 30.000 224.000 L 30.000 144.000 C 29.997 143.468 30.206 142.957 30.580 142.580 L 86.580 86.580 C 86.957 86.206 87.468 85.997 88.000 86.000 C 88.530 86.004 89.038 86.212 89.420 86.580 L 125.170 122.340 L 83.760 163.760 C 82.155 165.256 81.494 167.508 82.037 169.634 C 82.580 171.760 84.240 173.420 86.366 173.963 C 88.492 174.506 90.744 173.845 92.240 172.240 L 133.660 130.830 Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null

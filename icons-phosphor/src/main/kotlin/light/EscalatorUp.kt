package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EscalatorUp: ImageVector
    get() {
        if (_escalatorUp != null) return _escalatorUp!!
        _escalatorUp = phosphorLightIcon(
            name = "EscalatorUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 42.000 L 168.000 42.000 C 166.325 42.000 164.726 42.699 163.590 43.930 L 69.370 146.000 L 32.000 146.000 C 24.268 146.000 18.000 152.268 18.000 160.000 L 18.000 200.000 C 18.000 207.732 24.268 214.000 32.000 214.000 L 88.000 214.000 C 89.675 214.000 91.274 213.301 92.410 212.070 L 186.630 110.000 L 224.000 110.000 C 231.732 110.000 238.000 103.732 238.000 96.000 L 238.000 56.000 C 238.000 48.268 231.732 42.000 224.000 42.000 ZM 226.000 96.000 C 226.000 97.105 225.105 98.000 224.000 98.000 L 184.000 98.000 C 182.325 98.000 180.726 98.699 179.590 99.930 L 85.370 202.000 L 32.000 202.000 C 30.895 202.000 30.000 201.105 30.000 200.000 L 30.000 160.000 C 30.000 158.895 30.895 158.000 32.000 158.000 L 72.000 158.000 C 73.675 158.000 75.274 157.301 76.410 156.070 L 170.630 54.000 L 224.000 54.000 C 225.105 54.000 226.000 54.895 226.000 56.000 ZM 228.240 171.760 C 229.845 173.256 230.506 175.508 229.963 177.634 C 229.420 179.760 227.760 181.420 225.634 181.963 C 223.508 182.506 221.256 181.845 219.760 180.240 L 206.000 166.490 L 206.000 208.000 C 206.000 211.314 203.314 214.000 200.000 214.000 C 196.686 214.000 194.000 211.314 194.000 208.000 L 194.000 166.490 L 180.240 180.240 C 177.876 182.443 174.192 182.378 171.907 180.093 C 169.622 177.808 169.557 174.124 171.760 171.760 L 195.760 147.760 C 198.103 145.420 201.897 145.420 204.240 147.760 Z"),
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
        return _escalatorUp!!
    }

private var _escalatorUp: ImageVector? = null

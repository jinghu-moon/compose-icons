package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorLightIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 171.760 84.240 C 169.557 81.876 169.622 78.192 171.907 75.907 C 174.192 73.622 177.876 73.557 180.240 75.760 L 194.000 89.510 L 194.000 48.000 C 194.000 44.686 196.686 42.000 200.000 42.000 C 203.314 42.000 206.000 44.686 206.000 48.000 L 206.000 89.510 L 219.760 75.760 C 222.124 73.557 225.808 73.622 228.093 75.907 C 230.378 78.192 230.443 81.876 228.240 84.240 L 204.240 108.240 C 201.897 110.580 198.103 110.580 195.760 108.240 ZM 238.000 160.000 L 238.000 200.000 C 238.000 207.732 231.732 214.000 224.000 214.000 L 168.000 214.000 C 166.325 214.000 164.726 213.301 163.590 212.070 L 69.370 110.000 L 32.000 110.000 C 24.268 110.000 18.000 103.732 18.000 96.000 L 18.000 56.000 C 18.000 48.268 24.268 42.000 32.000 42.000 L 88.000 42.000 C 89.675 42.000 91.274 42.699 92.410 43.930 L 186.630 146.000 L 224.000 146.000 C 231.732 146.000 238.000 152.268 238.000 160.000 ZM 226.000 160.000 C 226.000 158.895 225.105 158.000 224.000 158.000 L 184.000 158.000 C 182.325 158.000 180.726 157.301 179.590 156.070 L 85.370 54.000 L 32.000 54.000 C 30.895 54.000 30.000 54.895 30.000 56.000 L 30.000 96.000 C 30.000 97.105 30.895 98.000 32.000 98.000 L 72.000 98.000 C 73.675 98.000 75.274 98.699 76.410 99.930 L 170.630 202.000 L 224.000 202.000 C 225.105 202.000 226.000 201.105 226.000 200.000 Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null

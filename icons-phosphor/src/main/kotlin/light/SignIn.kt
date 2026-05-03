package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorLightIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.240 132.240 L 100.240 172.240 C 97.876 174.443 94.192 174.378 91.907 172.093 C 89.622 169.808 89.557 166.124 91.760 163.760 L 121.510 134.000 L 24.000 134.000 C 20.686 134.000 18.000 131.314 18.000 128.000 C 18.000 124.686 20.686 122.000 24.000 122.000 L 121.510 122.000 L 91.760 92.240 C 89.557 89.876 89.622 86.192 91.907 83.907 C 94.192 81.622 97.876 81.557 100.240 83.760 L 140.240 123.760 C 142.580 126.103 142.580 129.897 140.240 132.240 ZM 200.000 34.000 L 136.000 34.000 C 132.686 34.000 130.000 36.686 130.000 40.000 C 130.000 43.314 132.686 46.000 136.000 46.000 L 194.000 46.000 L 194.000 210.000 L 136.000 210.000 C 132.686 210.000 130.000 212.686 130.000 216.000 C 130.000 219.314 132.686 222.000 136.000 222.000 L 200.000 222.000 C 203.314 222.000 206.000 219.314 206.000 216.000 L 206.000 40.000 C 206.000 36.686 203.314 34.000 200.000 34.000 Z"),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null

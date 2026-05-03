package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SignOut: ImageVector
    get() {
        if (_signOut != null) return _signOut!!
        _signOut = phosphorLightIcon(
            name = "SignOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 118.000 216.000 C 118.000 219.314 115.314 222.000 112.000 222.000 L 48.000 222.000 C 44.686 222.000 42.000 219.314 42.000 216.000 L 42.000 40.000 C 42.000 36.686 44.686 34.000 48.000 34.000 L 112.000 34.000 C 115.314 34.000 118.000 36.686 118.000 40.000 C 118.000 43.314 115.314 46.000 112.000 46.000 L 54.000 46.000 L 54.000 210.000 L 112.000 210.000 C 115.314 210.000 118.000 212.686 118.000 216.000 ZM 228.240 123.760 L 188.240 83.760 C 185.876 81.557 182.192 81.622 179.907 83.907 C 177.622 86.192 177.557 89.876 179.760 92.240 L 209.510 122.000 L 112.000 122.000 C 108.686 122.000 106.000 124.686 106.000 128.000 C 106.000 131.314 108.686 134.000 112.000 134.000 L 209.510 134.000 L 179.760 163.760 C 178.155 165.256 177.494 167.508 178.037 169.634 C 178.580 171.760 180.240 173.420 182.366 173.963 C 184.492 174.506 186.744 173.845 188.240 172.240 L 228.240 132.240 C 230.580 129.897 230.580 126.103 228.240 123.760 Z"),
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
        return _signOut!!
    }

private var _signOut: ImageVector? = null

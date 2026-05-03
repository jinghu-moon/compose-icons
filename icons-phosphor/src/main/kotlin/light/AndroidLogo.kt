package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorLightIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 148.000 C 174.000 153.523 169.523 158.000 164.000 158.000 C 158.477 158.000 154.000 153.523 154.000 148.000 C 154.000 142.477 158.477 138.000 164.000 138.000 C 169.523 138.000 174.000 142.477 174.000 148.000 ZM 92.000 138.000 C 86.477 138.000 82.000 142.477 82.000 148.000 C 82.000 153.523 86.477 158.000 92.000 158.000 C 97.523 158.000 102.000 153.523 102.000 148.000 C 102.000 142.477 97.523 138.000 92.000 138.000 ZM 238.000 160.000 L 238.000 184.000 C 238.000 191.732 231.732 198.000 224.000 198.000 L 32.000 198.000 C 24.268 198.000 18.000 191.732 18.000 184.000 L 18.000 161.130 C 17.974 129.794 31.144 99.895 54.280 78.760 L 27.760 52.240 C 26.155 50.744 25.494 48.492 26.037 46.366 C 26.580 44.240 28.240 42.580 30.366 42.037 C 32.492 41.494 34.744 42.155 36.240 43.760 L 63.610 71.120 C 82.163 57.471 104.577 50.074 127.610 50.000 L 128.000 50.000 C 151.204 49.936 173.825 57.267 192.580 70.930 L 219.760 43.760 C 222.124 41.557 225.808 41.622 228.093 43.907 C 230.378 46.192 230.443 49.876 228.240 52.240 L 201.930 78.550 C 203.190 79.700 204.430 80.870 205.650 82.080 C 226.428 102.676 238.081 130.744 238.000 160.000 ZM 226.000 160.000 C 226.000 105.876 182.124 62.000 128.000 62.000 L 127.650 62.000 C 73.810 62.190 30.000 106.660 30.000 161.130 L 30.000 184.000 C 30.000 185.105 30.895 186.000 32.000 186.000 L 224.000 186.000 C 225.105 186.000 226.000 185.105 226.000 184.000 Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null

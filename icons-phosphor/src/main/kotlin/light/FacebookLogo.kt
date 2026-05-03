package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorLightIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 134.000 217.800 L 134.000 150.000 L 160.000 150.000 C 163.314 150.000 166.000 147.314 166.000 144.000 C 166.000 140.686 163.314 138.000 160.000 138.000 L 134.000 138.000 L 134.000 112.000 C 134.000 102.059 142.059 94.000 152.000 94.000 L 168.000 94.000 C 171.314 94.000 174.000 91.314 174.000 88.000 C 174.000 84.686 171.314 82.000 168.000 82.000 L 152.000 82.000 C 135.431 82.000 122.000 95.431 122.000 112.000 L 122.000 138.000 L 96.000 138.000 C 92.686 138.000 90.000 140.686 90.000 144.000 C 90.000 147.314 92.686 150.000 96.000 150.000 L 122.000 150.000 L 122.000 217.800 C 73.571 214.564 36.431 173.509 38.050 124.999 C 39.669 76.488 79.463 38.000 128.000 38.000 C 176.537 38.000 216.331 76.488 217.950 124.999 C 219.569 173.509 182.429 214.564 134.000 217.800 Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null

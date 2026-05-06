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
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM134 217.8v-67.8h26c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-26c0-9.941 8.059-18 18-18h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-16c-16.569 0-30 13.431-30 30v26h-26c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h26v67.8C73.571 214.564 36.431 173.509 38.05 124.999 39.669 76.488 79.463 38 128 38c48.537 0 88.331 38.488 89.95 86.998 1.619 48.51-35.521 89.566-83.95 92.801Z"),
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

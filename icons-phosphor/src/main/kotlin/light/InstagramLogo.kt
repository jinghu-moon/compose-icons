package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorLightIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 82.000 C 102.595 82.000 82.000 102.595 82.000 128.000 C 82.000 153.405 102.595 174.000 128.000 174.000 C 153.405 174.000 174.000 153.405 174.000 128.000 C 173.967 102.609 153.391 82.033 128.000 82.000 ZM 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 C 94.000 109.222 109.222 94.000 128.000 94.000 C 146.778 94.000 162.000 109.222 162.000 128.000 C 162.000 146.778 146.778 162.000 128.000 162.000 ZM 176.000 26.000 L 80.000 26.000 C 50.190 26.033 26.033 50.190 26.000 80.000 L 26.000 176.000 C 26.033 205.810 50.190 229.967 80.000 230.000 L 176.000 230.000 C 205.810 229.967 229.967 205.810 230.000 176.000 L 230.000 80.000 C 229.967 50.190 205.810 26.033 176.000 26.000 ZM 218.000 176.000 C 218.000 199.196 199.196 218.000 176.000 218.000 L 80.000 218.000 C 56.804 218.000 38.000 199.196 38.000 176.000 L 38.000 80.000 C 38.000 56.804 56.804 38.000 80.000 38.000 L 176.000 38.000 C 199.196 38.000 218.000 56.804 218.000 80.000 ZM 190.000 76.000 C 190.000 81.523 185.523 86.000 180.000 86.000 C 174.477 86.000 170.000 81.523 170.000 76.000 C 170.000 70.477 174.477 66.000 180.000 66.000 C 185.523 66.000 190.000 70.477 190.000 76.000 Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null

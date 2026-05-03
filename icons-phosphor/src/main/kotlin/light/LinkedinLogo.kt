package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorLightIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 26.000 L 40.000 26.000 C 32.268 26.000 26.000 32.268 26.000 40.000 L 26.000 216.000 C 26.000 223.732 32.268 230.000 40.000 230.000 L 216.000 230.000 C 223.732 230.000 230.000 223.732 230.000 216.000 L 230.000 40.000 C 230.000 32.268 223.732 26.000 216.000 26.000 ZM 218.000 216.000 C 218.000 217.105 217.105 218.000 216.000 218.000 L 40.000 218.000 C 38.895 218.000 38.000 217.105 38.000 216.000 L 38.000 40.000 C 38.000 38.895 38.895 38.000 40.000 38.000 L 216.000 38.000 C 217.105 38.000 218.000 38.895 218.000 40.000 ZM 94.000 112.000 L 94.000 176.000 C 94.000 179.314 91.314 182.000 88.000 182.000 C 84.686 182.000 82.000 179.314 82.000 176.000 L 82.000 112.000 C 82.000 108.686 84.686 106.000 88.000 106.000 C 91.314 106.000 94.000 108.686 94.000 112.000 ZM 182.000 140.000 L 182.000 176.000 C 182.000 179.314 179.314 182.000 176.000 182.000 C 172.686 182.000 170.000 179.314 170.000 176.000 L 170.000 140.000 C 170.000 127.850 160.150 118.000 148.000 118.000 C 135.850 118.000 126.000 127.850 126.000 140.000 L 126.000 176.000 C 126.000 179.314 123.314 182.000 120.000 182.000 C 116.686 182.000 114.000 179.314 114.000 176.000 L 114.000 112.000 C 114.000 108.686 116.686 106.000 120.000 106.000 C 123.314 106.000 126.000 108.686 126.000 112.000 L 126.000 114.110 C 136.096 105.542 150.248 103.615 162.268 109.172 C 174.287 114.728 181.987 126.758 182.000 140.000 ZM 98.000 84.000 C 98.000 89.523 93.523 94.000 88.000 94.000 C 82.477 94.000 78.000 89.523 78.000 84.000 C 78.000 78.477 82.477 74.000 88.000 74.000 C 93.523 74.000 98.000 78.477 98.000 84.000 Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null

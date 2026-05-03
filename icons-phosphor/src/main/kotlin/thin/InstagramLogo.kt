package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorThinIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 84.000 C 103.699 84.000 84.000 103.699 84.000 128.000 C 84.000 152.301 103.699 172.000 128.000 172.000 C 152.301 172.000 172.000 152.301 172.000 128.000 C 171.972 103.711 152.289 84.028 128.000 84.000 ZM 128.000 164.000 C 108.118 164.000 92.000 147.882 92.000 128.000 C 92.000 108.118 108.118 92.000 128.000 92.000 C 147.882 92.000 164.000 108.118 164.000 128.000 C 164.000 147.882 147.882 164.000 128.000 164.000 ZM 176.000 28.000 L 80.000 28.000 C 51.295 28.033 28.033 51.295 28.000 80.000 L 28.000 176.000 C 28.033 204.705 51.295 227.967 80.000 228.000 L 176.000 228.000 C 204.705 227.967 227.967 204.705 228.000 176.000 L 228.000 80.000 C 227.967 51.295 204.705 28.033 176.000 28.000 ZM 220.000 176.000 C 219.972 200.289 200.289 219.972 176.000 220.000 L 80.000 220.000 C 55.711 219.972 36.028 200.289 36.000 176.000 L 36.000 80.000 C 36.028 55.711 55.711 36.028 80.000 36.000 L 176.000 36.000 C 200.289 36.028 219.972 55.711 220.000 80.000 ZM 188.000 76.000 C 188.000 80.418 184.418 84.000 180.000 84.000 C 175.582 84.000 172.000 80.418 172.000 76.000 C 172.000 71.582 175.582 68.000 180.000 68.000 C 184.418 68.000 188.000 71.582 188.000 76.000 Z"),
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

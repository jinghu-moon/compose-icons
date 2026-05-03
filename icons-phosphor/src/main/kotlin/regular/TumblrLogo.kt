package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorRegularIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 120.000 C 196.418 120.000 200.000 116.418 200.000 112.000 L 200.000 72.000 C 200.000 67.582 196.418 64.000 192.000 64.000 L 152.000 64.000 L 152.000 24.000 C 152.000 19.582 148.418 16.000 144.000 16.000 L 112.000 16.000 C 107.582 16.000 104.000 19.582 104.000 24.000 C 104.000 46.091 86.091 64.000 64.000 64.000 C 59.582 64.000 56.000 67.582 56.000 72.000 L 56.000 112.000 C 56.000 116.418 59.582 120.000 64.000 120.000 L 88.000 120.000 L 88.000 176.000 C 88.039 211.330 116.670 239.961 152.000 240.000 L 192.000 240.000 C 196.418 240.000 200.000 236.418 200.000 232.000 L 200.000 184.000 C 200.000 179.582 196.418 176.000 192.000 176.000 L 160.000 176.000 C 155.582 176.000 152.000 172.418 152.000 168.000 L 152.000 120.000 ZM 160.000 192.000 L 184.000 192.000 L 184.000 224.000 L 152.000 224.000 C 125.502 223.972 104.028 202.498 104.000 176.000 L 104.000 112.000 C 104.000 107.582 100.418 104.000 96.000 104.000 L 72.000 104.000 L 72.000 79.430 C 96.557 75.844 115.844 56.557 119.430 32.000 L 136.000 32.000 L 136.000 72.000 C 136.000 76.418 139.582 80.000 144.000 80.000 L 184.000 80.000 L 184.000 104.000 L 144.000 104.000 C 139.582 104.000 136.000 107.582 136.000 112.000 L 136.000 168.000 C 136.000 181.255 146.745 192.000 160.000 192.000 Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null

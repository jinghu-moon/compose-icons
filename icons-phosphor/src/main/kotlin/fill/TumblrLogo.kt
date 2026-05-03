package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorFillIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 120.000 L 152.000 168.000 C 152.000 172.418 155.582 176.000 160.000 176.000 L 192.000 176.000 C 196.418 176.000 200.000 179.582 200.000 184.000 L 200.000 232.000 C 200.000 236.418 196.418 240.000 192.000 240.000 L 152.000 240.000 C 116.670 239.961 88.039 211.330 88.000 176.000 L 88.000 120.000 L 64.000 120.000 C 59.582 120.000 56.000 116.418 56.000 112.000 L 56.000 72.000 C 56.000 67.582 59.582 64.000 64.000 64.000 C 86.091 64.000 104.000 46.091 104.000 24.000 C 104.000 19.582 107.582 16.000 112.000 16.000 L 144.000 16.000 C 148.418 16.000 152.000 19.582 152.000 24.000 L 152.000 64.000 L 192.000 64.000 C 196.418 64.000 200.000 67.582 200.000 72.000 L 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 Z"),
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
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null

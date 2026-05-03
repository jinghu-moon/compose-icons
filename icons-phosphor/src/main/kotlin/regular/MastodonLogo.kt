package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorRegularIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 32.000 L 72.000 32.000 C 49.909 32.000 32.000 49.909 32.000 72.000 L 32.000 192.000 C 32.000 214.091 49.909 232.000 72.000 232.000 L 160.000 232.000 C 164.418 232.000 168.000 228.418 168.000 224.000 C 168.000 219.582 164.418 216.000 160.000 216.000 L 72.000 216.000 C 58.745 216.000 48.000 205.255 48.000 192.000 L 48.000 184.000 L 184.000 184.000 C 206.091 184.000 224.000 166.091 224.000 144.000 L 224.000 72.000 C 224.000 49.909 206.091 32.000 184.000 32.000 ZM 208.000 144.000 C 208.000 157.255 197.255 168.000 184.000 168.000 L 48.000 168.000 L 48.000 72.000 C 48.000 58.745 58.745 48.000 72.000 48.000 L 184.000 48.000 C 197.255 48.000 208.000 58.745 208.000 72.000 ZM 184.000 104.000 L 184.000 136.000 C 184.000 140.418 180.418 144.000 176.000 144.000 C 171.582 144.000 168.000 140.418 168.000 136.000 L 168.000 104.000 C 168.000 95.163 160.837 88.000 152.000 88.000 C 143.163 88.000 136.000 95.163 136.000 104.000 L 136.000 136.000 C 136.000 140.418 132.418 144.000 128.000 144.000 C 123.582 144.000 120.000 140.418 120.000 136.000 L 120.000 104.000 C 120.000 95.163 112.837 88.000 104.000 88.000 C 95.163 88.000 88.000 95.163 88.000 104.000 L 88.000 136.000 C 88.000 140.418 84.418 144.000 80.000 144.000 C 75.582 144.000 72.000 140.418 72.000 136.000 L 72.000 104.000 C 72.015 90.698 80.258 78.792 92.703 74.096 C 105.149 69.400 119.202 72.893 128.000 82.870 C 136.798 72.893 150.851 69.400 163.297 74.096 C 175.742 78.792 183.985 90.698 184.000 104.000 Z"),
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
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null

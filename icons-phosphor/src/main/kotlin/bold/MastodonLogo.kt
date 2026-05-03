package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorBoldIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 28.000 L 72.000 28.000 C 47.711 28.028 28.028 47.711 28.000 72.000 L 28.000 192.000 C 28.028 216.289 47.711 235.972 72.000 236.000 L 160.000 236.000 C 166.627 236.000 172.000 230.627 172.000 224.000 C 172.000 217.373 166.627 212.000 160.000 212.000 L 72.000 212.000 C 60.954 212.000 52.000 203.046 52.000 192.000 L 52.000 188.000 L 184.000 188.000 C 208.289 187.972 227.972 168.289 228.000 144.000 L 228.000 72.000 C 227.972 47.711 208.289 28.028 184.000 28.000 ZM 204.000 144.000 C 204.000 155.046 195.046 164.000 184.000 164.000 L 52.000 164.000 L 52.000 72.000 C 52.000 60.954 60.954 52.000 72.000 52.000 L 184.000 52.000 C 195.046 52.000 204.000 60.954 204.000 72.000 ZM 188.000 104.000 L 188.000 136.000 C 188.000 142.627 182.627 148.000 176.000 148.000 C 169.373 148.000 164.000 142.627 164.000 136.000 L 164.000 104.000 C 164.000 97.373 158.627 92.000 152.000 92.000 C 145.373 92.000 140.000 97.373 140.000 104.000 L 140.000 136.000 C 140.000 142.627 134.627 148.000 128.000 148.000 C 121.373 148.000 116.000 142.627 116.000 136.000 L 116.000 104.000 C 116.000 97.373 110.627 92.000 104.000 92.000 C 97.373 92.000 92.000 97.373 92.000 104.000 L 92.000 136.000 C 92.000 142.627 86.627 148.000 80.000 148.000 C 73.373 148.000 68.000 142.627 68.000 136.000 L 68.000 104.000 C 68.013 89.809 76.361 76.950 89.318 71.163 C 102.275 65.375 117.423 67.740 128.000 77.200 C 138.577 67.740 153.725 65.375 166.682 71.163 C 179.639 76.950 187.987 89.809 188.000 104.000 Z"),
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

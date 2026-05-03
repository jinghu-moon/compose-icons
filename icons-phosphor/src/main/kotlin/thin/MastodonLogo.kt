package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorThinIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 36.000 L 72.000 36.000 C 52.118 36.000 36.000 52.118 36.000 72.000 L 36.000 192.000 C 36.000 211.882 52.118 228.000 72.000 228.000 L 160.000 228.000 C 162.209 228.000 164.000 226.209 164.000 224.000 C 164.000 221.791 162.209 220.000 160.000 220.000 L 72.000 220.000 C 56.536 220.000 44.000 207.464 44.000 192.000 L 44.000 180.000 L 184.000 180.000 C 203.882 180.000 220.000 163.882 220.000 144.000 L 220.000 72.000 C 220.000 52.118 203.882 36.000 184.000 36.000 ZM 212.000 144.000 C 212.000 159.464 199.464 172.000 184.000 172.000 L 44.000 172.000 L 44.000 72.000 C 44.000 56.536 56.536 44.000 72.000 44.000 L 184.000 44.000 C 199.464 44.000 212.000 56.536 212.000 72.000 ZM 180.000 104.000 L 180.000 136.000 C 180.000 138.209 178.209 140.000 176.000 140.000 C 173.791 140.000 172.000 138.209 172.000 136.000 L 172.000 104.000 C 172.000 92.954 163.046 84.000 152.000 84.000 C 140.954 84.000 132.000 92.954 132.000 104.000 L 132.000 136.000 C 132.000 138.209 130.209 140.000 128.000 140.000 C 125.791 140.000 124.000 138.209 124.000 136.000 L 124.000 104.000 C 124.000 92.954 115.046 84.000 104.000 84.000 C 92.954 84.000 84.000 92.954 84.000 104.000 L 84.000 136.000 C 84.000 138.209 82.209 140.000 80.000 140.000 C 77.791 140.000 76.000 138.209 76.000 136.000 L 76.000 104.000 C 76.005 91.420 84.400 80.389 96.523 77.029 C 108.645 73.670 121.520 78.807 128.000 89.590 C 134.480 78.807 147.355 73.670 159.477 77.029 C 171.600 80.389 179.995 91.420 180.000 104.000 Z"),
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

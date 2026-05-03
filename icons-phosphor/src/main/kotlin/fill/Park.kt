package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorFillIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 192.000 L 200.000 192.000 L 200.000 168.000 L 224.000 168.000 C 226.463 168.000 228.789 166.865 230.305 164.923 C 231.820 162.981 232.357 160.450 231.760 158.060 L 199.760 30.060 C 198.868 26.501 195.669 24.005 192.000 24.005 C 188.331 24.005 185.132 26.501 184.240 30.060 L 152.240 158.060 C 151.643 160.450 152.180 162.981 153.695 164.923 C 155.211 166.865 157.537 168.000 160.000 168.000 L 184.000 168.000 L 184.000 192.000 L 120.000 192.000 L 120.000 176.000 L 128.000 176.000 C 132.418 176.000 136.000 172.418 136.000 168.000 C 136.000 163.582 132.418 160.000 128.000 160.000 L 120.000 160.000 L 120.000 144.000 L 128.000 144.000 C 132.418 144.000 136.000 140.418 136.000 136.000 C 136.000 131.582 132.418 128.000 128.000 128.000 L 40.000 128.000 C 35.582 128.000 32.000 131.582 32.000 136.000 C 32.000 140.418 35.582 144.000 40.000 144.000 L 48.000 144.000 L 48.000 160.000 L 40.000 160.000 C 35.582 160.000 32.000 163.582 32.000 168.000 C 32.000 172.418 35.582 176.000 40.000 176.000 L 48.000 176.000 L 48.000 192.000 L 24.000 192.000 C 19.582 192.000 16.000 195.582 16.000 200.000 C 16.000 204.418 19.582 208.000 24.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 C 240.000 195.582 236.418 192.000 232.000 192.000 ZM 104.000 192.000 L 64.000 192.000 L 64.000 176.000 L 104.000 176.000 ZM 104.000 160.000 L 64.000 160.000 L 64.000 144.000 L 104.000 144.000 ZM 116.000 96.000 C 131.464 96.000 144.000 83.464 144.000 68.000 C 144.000 52.536 131.464 40.000 116.000 40.000 C 100.536 40.000 88.000 52.536 88.000 68.000 C 88.000 83.464 100.536 96.000 116.000 96.000 ZM 116.000 56.000 C 122.627 56.000 128.000 61.373 128.000 68.000 C 128.000 74.627 122.627 80.000 116.000 80.000 C 109.373 80.000 104.000 74.627 104.000 68.000 C 104.000 61.373 109.373 56.000 116.000 56.000 Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null

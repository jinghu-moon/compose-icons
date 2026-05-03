package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) return _googlePodcastsLogo!!
        _googlePodcastsLogo = phosphorBoldIcon(
            name = "GooglePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 16.000 L 140.000 48.000 C 140.000 54.627 134.627 60.000 128.000 60.000 C 121.373 60.000 116.000 54.627 116.000 48.000 L 116.000 16.000 C 116.000 9.373 121.373 4.000 128.000 4.000 C 134.627 4.000 140.000 9.373 140.000 16.000 ZM 176.000 52.000 C 169.373 52.000 164.000 57.373 164.000 64.000 L 164.000 96.000 C 164.000 102.627 169.373 108.000 176.000 108.000 C 182.627 108.000 188.000 102.627 188.000 96.000 L 188.000 64.000 C 188.000 57.373 182.627 52.000 176.000 52.000 ZM 128.000 196.000 C 121.373 196.000 116.000 201.373 116.000 208.000 L 116.000 240.000 C 116.000 246.627 121.373 252.000 128.000 252.000 C 134.627 252.000 140.000 246.627 140.000 240.000 L 140.000 208.000 C 140.000 201.373 134.627 196.000 128.000 196.000 ZM 128.000 76.000 C 121.373 76.000 116.000 81.373 116.000 88.000 L 116.000 168.000 C 116.000 174.627 121.373 180.000 128.000 180.000 C 134.627 180.000 140.000 174.627 140.000 168.000 L 140.000 88.000 C 140.000 81.373 134.627 76.000 128.000 76.000 ZM 80.000 52.000 C 73.373 52.000 68.000 57.373 68.000 64.000 L 68.000 120.000 C 68.000 126.627 73.373 132.000 80.000 132.000 C 86.627 132.000 92.000 126.627 92.000 120.000 L 92.000 64.000 C 92.000 57.373 86.627 52.000 80.000 52.000 ZM 176.000 124.000 C 169.373 124.000 164.000 129.373 164.000 136.000 L 164.000 192.000 C 164.000 198.627 169.373 204.000 176.000 204.000 C 182.627 204.000 188.000 198.627 188.000 192.000 L 188.000 136.000 C 188.000 129.373 182.627 124.000 176.000 124.000 ZM 32.000 100.000 C 25.373 100.000 20.000 105.373 20.000 112.000 L 20.000 144.000 C 20.000 150.627 25.373 156.000 32.000 156.000 C 38.627 156.000 44.000 150.627 44.000 144.000 L 44.000 112.000 C 44.000 105.373 38.627 100.000 32.000 100.000 ZM 80.000 148.000 C 73.373 148.000 68.000 153.373 68.000 160.000 L 68.000 192.000 C 68.000 198.627 73.373 204.000 80.000 204.000 C 86.627 204.000 92.000 198.627 92.000 192.000 L 92.000 160.000 C 92.000 153.373 86.627 148.000 80.000 148.000 ZM 224.000 100.000 C 217.373 100.000 212.000 105.373 212.000 112.000 L 212.000 144.000 C 212.000 150.627 217.373 156.000 224.000 156.000 C 230.627 156.000 236.000 150.627 236.000 144.000 L 236.000 112.000 C 236.000 105.373 230.627 100.000 224.000 100.000 Z"),
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
        return _googlePodcastsLogo!!
    }

private var _googlePodcastsLogo: ImageVector? = null

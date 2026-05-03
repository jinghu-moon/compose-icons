package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) return _googlePodcastsLogo!!
        _googlePodcastsLogo = phosphorLightIcon(
            name = "GooglePodcastsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 134.000 16.000 L 134.000 48.000 C 134.000 51.314 131.314 54.000 128.000 54.000 C 124.686 54.000 122.000 51.314 122.000 48.000 L 122.000 16.000 C 122.000 12.686 124.686 10.000 128.000 10.000 C 131.314 10.000 134.000 12.686 134.000 16.000 ZM 176.000 58.000 C 172.686 58.000 170.000 60.686 170.000 64.000 L 170.000 96.000 C 170.000 99.314 172.686 102.000 176.000 102.000 C 179.314 102.000 182.000 99.314 182.000 96.000 L 182.000 64.000 C 182.000 60.686 179.314 58.000 176.000 58.000 ZM 128.000 202.000 C 124.686 202.000 122.000 204.686 122.000 208.000 L 122.000 240.000 C 122.000 243.314 124.686 246.000 128.000 246.000 C 131.314 246.000 134.000 243.314 134.000 240.000 L 134.000 208.000 C 134.000 204.686 131.314 202.000 128.000 202.000 ZM 128.000 82.000 C 124.686 82.000 122.000 84.686 122.000 88.000 L 122.000 168.000 C 122.000 171.314 124.686 174.000 128.000 174.000 C 131.314 174.000 134.000 171.314 134.000 168.000 L 134.000 88.000 C 134.000 84.686 131.314 82.000 128.000 82.000 ZM 80.000 58.000 C 76.686 58.000 74.000 60.686 74.000 64.000 L 74.000 120.000 C 74.000 123.314 76.686 126.000 80.000 126.000 C 83.314 126.000 86.000 123.314 86.000 120.000 L 86.000 64.000 C 86.000 60.686 83.314 58.000 80.000 58.000 ZM 176.000 130.000 C 172.686 130.000 170.000 132.686 170.000 136.000 L 170.000 192.000 C 170.000 195.314 172.686 198.000 176.000 198.000 C 179.314 198.000 182.000 195.314 182.000 192.000 L 182.000 136.000 C 182.000 132.686 179.314 130.000 176.000 130.000 ZM 32.000 106.000 C 28.686 106.000 26.000 108.686 26.000 112.000 L 26.000 144.000 C 26.000 147.314 28.686 150.000 32.000 150.000 C 35.314 150.000 38.000 147.314 38.000 144.000 L 38.000 112.000 C 38.000 108.686 35.314 106.000 32.000 106.000 ZM 80.000 154.000 C 76.686 154.000 74.000 156.686 74.000 160.000 L 74.000 192.000 C 74.000 195.314 76.686 198.000 80.000 198.000 C 83.314 198.000 86.000 195.314 86.000 192.000 L 86.000 160.000 C 86.000 156.686 83.314 154.000 80.000 154.000 ZM 224.000 106.000 C 220.686 106.000 218.000 108.686 218.000 112.000 L 218.000 144.000 C 218.000 147.314 220.686 150.000 224.000 150.000 C 227.314 150.000 230.000 147.314 230.000 144.000 L 230.000 112.000 C 230.000 108.686 227.314 106.000 224.000 106.000 Z"),
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

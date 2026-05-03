package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorBoldIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 124.000 C 198.627 124.000 204.000 118.627 204.000 112.000 L 204.000 72.000 C 204.000 65.373 198.627 60.000 192.000 60.000 L 156.000 60.000 L 156.000 24.000 C 156.000 17.373 150.627 12.000 144.000 12.000 L 112.000 12.000 C 105.373 12.000 100.000 17.373 100.000 24.000 C 100.000 43.882 83.882 60.000 64.000 60.000 C 57.373 60.000 52.000 65.373 52.000 72.000 L 52.000 112.000 C 52.000 118.627 57.373 124.000 64.000 124.000 L 84.000 124.000 L 84.000 176.000 C 84.039 213.539 114.461 243.961 152.000 244.000 L 192.000 244.000 C 198.627 244.000 204.000 238.627 204.000 232.000 L 204.000 184.000 C 204.000 177.373 198.627 172.000 192.000 172.000 L 160.000 172.000 C 157.791 172.000 156.000 170.209 156.000 168.000 L 156.000 124.000 ZM 160.000 196.000 L 180.000 196.000 L 180.000 220.000 L 152.000 220.000 C 127.711 219.972 108.028 200.289 108.000 176.000 L 108.000 112.000 C 108.000 105.373 102.627 100.000 96.000 100.000 L 76.000 100.000 L 76.000 82.790 C 99.541 77.937 117.937 59.541 122.790 36.000 L 132.000 36.000 L 132.000 72.000 C 132.000 78.627 137.373 84.000 144.000 84.000 L 180.000 84.000 L 180.000 100.000 L 144.000 100.000 C 137.373 100.000 132.000 105.373 132.000 112.000 L 132.000 168.000 C 132.000 183.464 144.536 196.000 160.000 196.000 Z"),
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

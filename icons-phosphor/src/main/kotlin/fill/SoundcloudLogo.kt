package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorFillIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 24.000 120.000 L 24.000 168.000 C 24.000 172.418 20.418 176.000 16.000 176.000 C 11.582 176.000 8.000 172.418 8.000 168.000 L 8.000 120.000 C 8.000 115.582 11.582 112.000 16.000 112.000 C 20.418 112.000 24.000 115.582 24.000 120.000 ZM 48.000 88.000 C 43.582 88.000 40.000 91.582 40.000 96.000 L 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 C 52.418 200.000 56.000 196.418 56.000 192.000 L 56.000 96.000 C 56.000 91.582 52.418 88.000 48.000 88.000 ZM 80.000 80.000 C 75.582 80.000 72.000 83.582 72.000 88.000 L 72.000 192.000 C 72.000 196.418 75.582 200.000 80.000 200.000 C 84.418 200.000 88.000 196.418 88.000 192.000 L 88.000 88.000 C 88.000 83.582 84.418 80.000 80.000 80.000 ZM 112.000 48.000 C 107.582 48.000 104.000 51.582 104.000 56.000 L 104.000 192.000 C 104.000 196.418 107.582 200.000 112.000 200.000 C 116.418 200.000 120.000 196.418 120.000 192.000 L 120.000 56.000 C 120.000 51.582 116.418 48.000 112.000 48.000 ZM 222.840 106.340 C 216.195 67.994 182.918 39.993 144.000 40.000 L 140.000 40.000 C 137.791 40.000 136.000 41.791 136.000 44.000 L 136.000 196.000 C 136.000 198.209 137.791 200.000 140.000 200.000 L 207.210 200.000 C 232.790 200.000 254.480 180.280 255.920 154.740 C 257.149 132.971 243.569 113.102 222.840 106.340 Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null

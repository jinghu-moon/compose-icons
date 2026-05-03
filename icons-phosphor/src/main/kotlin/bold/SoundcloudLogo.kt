package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorBoldIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 32.000 120.000 L 32.000 168.000 C 32.000 174.627 26.627 180.000 20.000 180.000 C 13.373 180.000 8.000 174.627 8.000 168.000 L 8.000 120.000 C 8.000 113.373 13.373 108.000 20.000 108.000 C 26.627 108.000 32.000 113.373 32.000 120.000 ZM 60.000 84.000 C 53.373 84.000 48.000 89.373 48.000 96.000 L 48.000 192.000 C 48.000 198.627 53.373 204.000 60.000 204.000 C 66.627 204.000 72.000 198.627 72.000 192.000 L 72.000 96.000 C 72.000 89.373 66.627 84.000 60.000 84.000 ZM 100.000 44.000 C 93.373 44.000 88.000 49.373 88.000 56.000 L 88.000 192.000 C 88.000 198.627 93.373 204.000 100.000 204.000 C 106.627 204.000 112.000 198.627 112.000 192.000 L 112.000 56.000 C 112.000 49.373 106.627 44.000 100.000 44.000 ZM 222.340 103.330 C 214.408 64.155 179.970 35.995 140.000 36.000 C 133.373 36.000 128.000 41.373 128.000 48.000 C 128.000 54.627 133.373 60.000 140.000 60.000 C 170.829 59.893 196.683 83.249 199.700 113.930 C 200.231 119.203 204.157 123.503 209.360 124.510 C 223.534 127.253 233.299 140.322 231.911 154.692 C 230.523 169.062 218.437 180.021 204.000 180.000 L 140.000 180.000 C 133.373 180.000 128.000 185.373 128.000 192.000 C 128.000 198.627 133.373 204.000 140.000 204.000 L 204.000 204.000 C 229.136 204.015 250.684 186.049 255.189 161.320 C 259.694 136.591 245.866 112.180 222.340 103.330 Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null

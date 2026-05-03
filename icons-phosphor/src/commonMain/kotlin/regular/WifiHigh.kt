package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorRegularIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(140.0f, 204.0f),
                    PathNode.CurveTo(140.0f, 210.62741f, 134.62741f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(121.37258f, 216.0f, 116.0f, 210.62741f, 116.0f, 204.0f),
                    PathNode.CurveTo(116.0f, 197.37259f, 121.37258f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(134.62741f, 192.0f, 140.0f, 197.37259f, 140.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(237.08f, 87.0f),
                    PathNode.CurveTo(173.66211f, 34.982723f, 82.33789f, 34.982723f, 18.92f, 87.0f),
                    PathNode.CurveTo(15.504119f, 89.8056f, 15.009394f, 94.84912f, 17.815f, 98.265f),
                    PathNode.CurveTo(20.620607f, 101.68088f, 25.66412f, 102.175606f, 29.08f, 99.37f),
                    PathNode.CurveTo(86.59386f, 52.20578f, 169.40614f, 52.20578f, 226.92f, 99.37f),
                    PathNode.CurveTo(230.33588f, 102.175606f, 235.3794f, 101.68088f, 238.185f, 98.265f),
                    PathNode.CurveTo(240.9906f, 94.84912f, 240.4959f, 89.8056f, 237.08f, 87.0f),
                    PathNode.Close,
                    PathNode.MoveTo(205.0f, 122.77f),
                    PathNode.CurveTo(159.8986f, 87.062584f, 96.1614f, 87.062584f, 51.06f, 122.77f),
                    PathNode.CurveTo(47.597176f, 125.514854f, 47.015144f, 130.54718f, 49.76f, 134.01f),
                    PathNode.CurveTo(52.504856f, 137.47284f, 57.537174f, 138.05486f, 61.0f, 135.31f),
                    PathNode.CurveTo(100.27868f, 104.21884f, 155.78133f, 104.21884f, 195.06f, 135.31f),
                    PathNode.CurveTo(196.72284f, 136.62834f, 198.84131f, 137.23204f, 200.94928f, 136.98824f),
                    PathNode.CurveTo(203.05725f, 136.74443f, 204.98201f, 135.67311f, 206.3f, 134.01f),
                    PathNode.CurveTo(207.61835f, 132.34718f, 208.22205f, 130.2287f, 207.97824f, 128.12073f),
                    PathNode.CurveTo(207.73444f, 126.01274f, 206.6631f, 124.08799f, 205.0f, 122.77f),
                    PathNode.Close,
                    PathNode.MoveTo(172.74f, 158.53f),
                    PathNode.CurveTo(146.08167f, 139.15567f, 109.97835f, 139.15567f, 83.32f, 158.53f),
                    PathNode.CurveTo(79.74672f, 161.13127f, 78.95874f, 166.13672f, 81.56f, 169.71f),
                    PathNode.CurveTo(84.16126f, 173.28328f, 89.16672f, 174.07126f, 92.74f, 171.47f),
                    PathNode.CurveTo(113.77891f, 156.16917f, 142.2811f, 156.16917f, 163.32f, 171.47f),
                    PathNode.CurveTo(166.89328f, 174.07126f, 171.89874f, 173.28328f, 174.5f, 169.71f),
                    PathNode.CurveTo(177.10126f, 166.13672f, 176.31328f, 161.13127f, 172.74f, 158.53f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null

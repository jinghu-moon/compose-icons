package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorRegularIcon(
            name = "WifiLow",
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
                    PathNode.MoveTo(172.71f, 158.53f),
                    PathNode.CurveTo(146.05167f, 139.15567f, 109.94834f, 139.15567f, 83.29f, 158.53f),
                    PathNode.CurveTo(79.71672f, 161.13127f, 78.92874f, 166.13672f, 81.53f, 169.71f),
                    PathNode.CurveTo(84.13126f, 173.28328f, 89.13672f, 174.07126f, 92.71f, 171.47f),
                    PathNode.CurveTo(113.7489f, 156.16917f, 142.2511f, 156.16917f, 163.29f, 171.47f),
                    PathNode.CurveTo(166.86328f, 174.07126f, 171.86873f, 173.28328f, 174.47f, 169.71f),
                    PathNode.CurveTo(177.07126f, 166.13672f, 176.28328f, 161.13127f, 172.71f, 158.53f),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null

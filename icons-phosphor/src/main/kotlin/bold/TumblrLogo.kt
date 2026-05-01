package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorBoldIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 124.0f),
                    PathNode.CurveTo(198.62741f, 124.0f, 204.0f, 118.62742f, 204.0f, 112.0f),
                    PathNode.LineTo(204.0f, 72.0f),
                    PathNode.CurveTo(204.0f, 65.37258f, 198.62741f, 60.0f, 192.0f, 60.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(156.0f, 24.0f),
                    PathNode.CurveTo(156.0f, 17.372583f, 150.62741f, 12.0f, 144.0f, 12.0f),
                    PathNode.LineTo(112.0f, 12.0f),
                    PathNode.CurveTo(105.37258f, 12.0f, 100.0f, 17.372583f, 100.0f, 24.0f),
                    PathNode.CurveTo(100.0f, 43.88225f, 83.88225f, 60.0f, 64.0f, 60.0f),
                    PathNode.CurveTo(57.37258f, 60.0f, 52.0f, 65.37258f, 52.0f, 72.0f),
                    PathNode.LineTo(52.0f, 112.0f),
                    PathNode.CurveTo(52.0f, 118.62742f, 57.37258f, 124.0f, 64.0f, 124.0f),
                    PathNode.LineTo(84.0f, 124.0f),
                    PathNode.LineTo(84.0f, 176.0f),
                    PathNode.CurveTo(84.03858f, 213.53935f, 114.46063f, 243.96141f, 152.0f, 244.0f),
                    PathNode.LineTo(192.0f, 244.0f),
                    PathNode.CurveTo(198.62741f, 244.0f, 204.0f, 238.62741f, 204.0f, 232.0f),
                    PathNode.LineTo(204.0f, 184.0f),
                    PathNode.CurveTo(204.0f, 177.37259f, 198.62741f, 172.0f, 192.0f, 172.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(157.79086f, 172.0f, 156.0f, 170.20914f, 156.0f, 168.0f),
                    PathNode.LineTo(156.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(180.0f, 220.0f),
                    PathNode.LineTo(152.0f, 220.0f),
                    PathNode.CurveTo(127.71089f, 219.97244f, 108.02756f, 200.28911f, 108.0f, 176.0f),
                    PathNode.LineTo(108.0f, 112.0f),
                    PathNode.CurveTo(108.0f, 105.37258f, 102.62742f, 100.0f, 96.0f, 100.0f),
                    PathNode.LineTo(76.0f, 100.0f),
                    PathNode.LineTo(76.0f, 82.79f),
                    PathNode.CurveTo(99.54124f, 77.93697f, 117.93697f, 59.541237f, 122.79f, 36.0f),
                    PathNode.LineTo(132.0f, 36.0f),
                    PathNode.LineTo(132.0f, 72.0f),
                    PathNode.CurveTo(132.0f, 78.62742f, 137.37259f, 84.0f, 144.0f, 84.0f),
                    PathNode.LineTo(180.0f, 84.0f),
                    PathNode.LineTo(180.0f, 100.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.CurveTo(137.37259f, 100.0f, 132.0f, 105.37258f, 132.0f, 112.0f),
                    PathNode.LineTo(132.0f, 168.0f),
                    PathNode.CurveTo(132.0f, 183.46397f, 144.53603f, 196.0f, 160.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null

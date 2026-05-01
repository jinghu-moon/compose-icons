package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorLightIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 34.0f),
                    PathNode.LineTo(72.0f, 34.0f),
                    PathNode.CurveTo(51.01318f, 34.0f, 34.0f, 51.01318f, 34.0f, 72.0f),
                    PathNode.LineTo(34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 212.98682f, 51.01318f, 230.0f, 72.0f, 230.0f),
                    PathNode.LineTo(160.0f, 230.0f),
                    PathNode.CurveTo(163.3137f, 230.0f, 166.0f, 227.3137f, 166.0f, 224.0f),
                    PathNode.CurveTo(166.0f, 220.6863f, 163.3137f, 218.0f, 160.0f, 218.0f),
                    PathNode.LineTo(72.0f, 218.0f),
                    PathNode.CurveTo(57.6406f, 218.0f, 46.0f, 206.3594f, 46.0f, 192.0f),
                    PathNode.LineTo(46.0f, 182.0f),
                    PathNode.LineTo(184.0f, 182.0f),
                    PathNode.CurveTo(204.98682f, 182.0f, 222.0f, 164.98682f, 222.0f, 144.0f),
                    PathNode.LineTo(222.0f, 72.0f),
                    PathNode.CurveTo(222.0f, 51.01318f, 204.98682f, 34.0f, 184.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 158.3594f, 198.3594f, 170.0f, 184.0f, 170.0f),
                    PathNode.LineTo(46.0f, 170.0f),
                    PathNode.LineTo(46.0f, 72.0f),
                    PathNode.CurveTo(46.0f, 57.6406f, 57.6406f, 46.0f, 72.0f, 46.0f),
                    PathNode.LineTo(184.0f, 46.0f),
                    PathNode.CurveTo(198.3594f, 46.0f, 210.0f, 57.6406f, 210.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(182.0f, 104.0f),
                    PathNode.LineTo(182.0f, 136.0f),
                    PathNode.CurveTo(182.0f, 139.3137f, 179.3137f, 142.0f, 176.0f, 142.0f),
                    PathNode.CurveTo(172.6863f, 142.0f, 170.0f, 139.3137f, 170.0f, 136.0f),
                    PathNode.LineTo(170.0f, 104.0f),
                    PathNode.CurveTo(170.0f, 94.05888f, 161.94113f, 86.0f, 152.0f, 86.0f),
                    PathNode.CurveTo(142.05887f, 86.0f, 134.0f, 94.05888f, 134.0f, 104.0f),
                    PathNode.LineTo(134.0f, 136.0f),
                    PathNode.CurveTo(134.0f, 139.3137f, 131.3137f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(124.686295f, 142.0f, 122.0f, 139.3137f, 122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 104.0f),
                    PathNode.CurveTo(122.0f, 94.05888f, 113.94112f, 86.0f, 104.0f, 86.0f),
                    PathNode.CurveTo(94.05888f, 86.0f, 86.0f, 94.05888f, 86.0f, 104.0f),
                    PathNode.LineTo(86.0f, 136.0f),
                    PathNode.CurveTo(86.0f, 139.3137f, 83.313705f, 142.0f, 80.0f, 142.0f),
                    PathNode.CurveTo(76.686295f, 142.0f, 74.0f, 139.3137f, 74.0f, 136.0f),
                    PathNode.LineTo(74.0f, 104.0f),
                    PathNode.CurveTo(74.0f, 91.08709f, 82.2629f, 79.622925f, 94.51317f, 75.5395f),
                    PathNode.CurveTo(106.76343f, 71.45608f, 120.25225f, 75.66967f, 128.0f, 86.0f),
                    PathNode.CurveTo(135.74774f, 75.66967f, 149.23657f, 71.45608f, 161.48683f, 75.5395f),
                    PathNode.CurveTo(173.73709f, 79.622925f, 182.0f, 91.08709f, 182.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null

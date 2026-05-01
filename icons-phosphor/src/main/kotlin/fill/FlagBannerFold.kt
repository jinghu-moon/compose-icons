package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlagBannerFold: ImageVector
    get() {
        if (_flagBannerFold != null) return _flagBannerFold!!
        _flagBannerFold = phosphorFillIcon(
            name = "FlagBannerFold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(131.79f, 69.65f),
                    PathNode.LineTo(88.16f, 165.65f),
                    PathNode.CurveTo(87.51268f, 167.07953f, 86.08926f, 167.99849f, 84.52f, 168.0f),
                    PathNode.LineTo(28.23f, 168.0f),
                    PathNode.CurveTo(25.668114f, 168.04198f, 23.233864f, 166.88405f, 21.65f, 164.87f),
                    PathNode.CurveTo(19.295406f, 161.79903f, 19.47647f, 157.48297f, 22.08f, 154.62f),
                    PathNode.LineTo(57.19f, 116.0f),
                    PathNode.LineTo(22.08f, 77.38f),
                    PathNode.CurveTo(19.470947f, 74.5154f, 19.289787f, 70.19286f, 21.65f, 67.12f),
                    PathNode.CurveTo(23.237879f, 65.11218f, 25.670507f, 63.958714f, 28.23f, 64.0f),
                    PathNode.LineTo(128.15f, 64.0f),
                    PathNode.CurveTo(129.5083f, 64.0013f, 130.77312f, 64.69181f, 131.50876f, 65.83366f),
                    PathNode.CurveTo(132.24438f, 66.97551f, 132.3503f, 68.41265f, 131.79f, 69.65f),
                    PathNode.Close,
                    PathNode.MoveTo(237.56f, 42.24f),
                    PathNode.CurveTo(235.99242f, 40.772472f, 233.9171f, 39.969585f, 231.77f, 40.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(164.86382f, 40.001225f, 162.0176f, 41.834846f, 160.72f, 44.69f),
                    PathNode.LineTo(118.15f, 138.34f),
                    PathNode.CurveTo(117.58516f, 139.57832f, 117.68875f, 141.01888f, 118.42496f, 142.16364f),
                    PathNode.CurveTo(119.16116f, 143.3084f, 120.42895f, 144.00024f, 121.79f, 144.0f),
                    PathNode.LineTo(179.58f, 144.0f),
                    PathNode.LineTo(144.72f, 220.69f),
                    PathNode.CurveTo(143.4458f, 223.30508f, 143.69154f, 226.40573f, 145.36177f, 228.78746f),
                    PathNode.CurveTo(147.032f, 231.16917f, 149.86345f, 232.45656f, 152.7562f, 232.14948f),
                    PathNode.CurveTo(155.64894f, 231.8424f, 158.14702f, 229.9893f, 159.28f, 227.31f),
                    PathNode.LineTo(239.28f, 51.31f),
                    PathNode.CurveTo(240.68483f, 48.227436f, 239.99585f, 44.59423f, 237.56f, 42.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _flagBannerFold!!
    }

private var _flagBannerFold: ImageVector? = null

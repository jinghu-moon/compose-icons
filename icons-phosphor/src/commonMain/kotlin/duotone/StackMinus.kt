package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StackMinus: ImageVector
    get() {
        if (_stackMinus != null) return _stackMinus!!
        _stackMinus = phosphorDuotoneIcon(
            name = "StackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.LineTo(32.0f, 80.0f),
                    PathNode.LineTo(128.0f, 24.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 204.41827f, 236.41827f, 208.0f, 232.0f, 208.0f),
                    PathNode.LineTo(184.0f, 208.0f),
                    PathNode.CurveTo(179.58173f, 208.0f, 176.0f, 204.41827f, 176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 195.58173f, 179.58173f, 192.0f, 184.0f, 192.0f),
                    PathNode.LineTo(232.0f, 192.0f),
                    PathNode.CurveTo(236.41827f, 192.0f, 240.0f, 195.58173f, 240.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 121.09f),
                    PathNode.LineTo(128.0f, 174.74f),
                    PathNode.LineTo(36.0f, 121.09f),
                    PathNode.CurveTo(32.219296f, 119.20762f, 27.626596f, 120.58839f, 25.510729f, 124.243546f),
                    PathNode.CurveTo(23.394863f, 127.898705f, 24.484783f, 132.56898f, 28.0f, 134.91f),
                    PathNode.LineTo(124.0f, 190.91f),
                    PathNode.CurveTo(126.49041f, 192.36227f, 129.5696f, 192.36227f, 132.06f, 190.91f),
                    PathNode.LineTo(228.06f, 134.91f),
                    PathNode.CurveTo(230.56932f, 133.49028f, 232.12064f, 130.83015f, 232.1206f, 127.94704f),
                    PathNode.CurveTo(232.12056f, 125.06392f, 230.56917f, 122.40385f, 228.05977f, 120.9842f),
                    PathNode.CurveTo(225.5504f, 119.56456f, 222.47125f, 119.60498f, 220.0f, 121.09f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 80.0f),
                    PathNode.CurveTo(24.006493f, 77.148384f, 25.530415f, 74.51581f, 28.0f, 73.09f),
                    PathNode.LineTo(124.0f, 17.09f),
                    PathNode.CurveTo(126.49041f, 15.637728f, 129.5696f, 15.637728f, 132.06f, 17.09f),
                    PathNode.LineTo(228.06f, 73.09f),
                    PathNode.CurveTo(230.51752f, 74.52374f, 232.02864f, 77.15483f, 232.02864f, 80.0f),
                    PathNode.CurveTo(232.02864f, 82.84517f, 230.51752f, 85.47626f, 228.06f, 86.91f),
                    PathNode.LineTo(132.06f, 142.91f),
                    PathNode.CurveTo(129.5696f, 144.36227f, 126.49041f, 144.36227f, 124.0f, 142.91f),
                    PathNode.LineTo(28.0f, 86.91f),
                    PathNode.CurveTo(25.530415f, 85.48419f, 24.006493f, 82.851616f, 24.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(47.88f, 80.0f),
                    PathNode.LineTo(128.0f, 126.74f),
                    PathNode.LineTo(208.12f, 80.0f),
                    PathNode.LineTo(128.0f, 33.26f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 215.76f),
                    PathNode.LineTo(128.0f, 222.76f),
                    PathNode.LineTo(36.0f, 169.09f),
                    PathNode.CurveTo(32.219296f, 167.20761f, 27.626596f, 168.5884f, 25.510729f, 172.24355f),
                    PathNode.CurveTo(23.394863f, 175.89873f, 24.484783f, 180.56898f, 28.0f, 182.91f),
                    PathNode.LineTo(124.0f, 238.91f),
                    PathNode.CurveTo(126.49041f, 240.36227f, 129.5696f, 240.36227f, 132.06f, 238.91f),
                    PathNode.LineTo(148.06f, 229.58f),
                    PathNode.CurveTo(150.56932f, 228.16028f, 152.12064f, 225.50015f, 152.1206f, 222.61703f),
                    PathNode.CurveTo(152.12056f, 219.73392f, 150.56917f, 217.07384f, 148.05977f, 215.6542f),
                    PathNode.CurveTo(145.5504f, 214.23456f, 142.47125f, 214.27498f, 140.0f, 215.76f),
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
        return _stackMinus!!
    }

private var _stackMinus: ImageVector? = null

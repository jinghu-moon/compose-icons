package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorFillIcon(
            name = "Stack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 169.09f),
                    PathNode.LineTo(128.0f, 222.74f),
                    PathNode.LineTo(36.0f, 169.09f),
                    PathNode.CurveTo(32.219296f, 167.20761f, 27.626596f, 168.5884f, 25.510729f, 172.24355f),
                    PathNode.CurveTo(23.394863f, 175.89873f, 24.484783f, 180.56898f, 28.0f, 182.91f),
                    PathNode.LineTo(124.0f, 238.91f),
                    PathNode.CurveTo(126.49041f, 240.36227f, 129.5696f, 240.36227f, 132.06f, 238.91f),
                    PathNode.LineTo(228.06f, 182.91f),
                    PathNode.CurveTo(230.56932f, 181.4903f, 232.12064f, 178.83015f, 232.1206f, 175.94704f),
                    PathNode.CurveTo(232.12056f, 173.06392f, 230.56917f, 170.40384f, 228.05977f, 168.9842f),
                    PathNode.CurveTo(225.5504f, 167.56456f, 222.47125f, 167.60498f, 220.0f, 169.09f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
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
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 86.91f),
                    PathNode.LineTo(124.0f, 142.91f),
                    PathNode.CurveTo(126.49041f, 144.36227f, 129.5696f, 144.36227f, 132.06f, 142.91f),
                    PathNode.LineTo(228.06f, 86.91f),
                    PathNode.CurveTo(230.51752f, 85.47626f, 232.02864f, 82.84517f, 232.02864f, 80.0f),
                    PathNode.CurveTo(232.02864f, 77.15483f, 230.51752f, 74.52374f, 228.06f, 73.09f),
                    PathNode.LineTo(132.06f, 17.09f),
                    PathNode.CurveTo(129.5696f, 15.637728f, 126.49041f, 15.637728f, 124.0f, 17.09f),
                    PathNode.LineTo(28.0f, 73.09f),
                    PathNode.CurveTo(25.542482f, 74.52374f, 24.031364f, 77.15483f, 24.031364f, 80.0f),
                    PathNode.CurveTo(24.031364f, 82.84517f, 25.542482f, 85.47626f, 28.0f, 86.91f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _stack!!
    }

private var _stack: ImageVector? = null

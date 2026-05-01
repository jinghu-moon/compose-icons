package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stack: ImageVector
    get() {
        if (_stack != null) return _stack!!
        _stack = phosphorDuotoneIcon(
            name = "Stack",
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.91f, 172.0f),
                    PathNode.CurveTo(233.10983f, 175.81752f, 231.80884f, 180.69514f, 228.0f, 182.91f),
                    PathNode.LineTo(132.0f, 238.91f),
                    PathNode.CurveTo(129.50958f, 240.36227f, 126.43041f, 240.36227f, 123.94f, 238.91f),
                    PathNode.LineTo(27.94f, 182.91f),
                    PathNode.CurveTo(24.187956f, 180.65532f, 22.944714f, 175.80377f, 25.150005f, 172.02249f),
                    PathNode.CurveTo(27.355297f, 168.24121f, 32.190132f, 166.93446f, 36.0f, 169.09f),
                    PathNode.LineTo(128.0f, 222.74f),
                    PathNode.LineTo(220.0f, 169.09f),
                    PathNode.CurveTo(223.81752f, 166.89017f, 228.69514f, 168.19116f, 230.91f, 172.0f),
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
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stack!!
    }

private var _stack: ImageVector? = null

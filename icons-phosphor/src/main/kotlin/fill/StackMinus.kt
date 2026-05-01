package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackMinus: ImageVector
    get() {
        if (_stackMinus != null) return _stackMinus!!
        _stackMinus = phosphorFillIcon(
            name = "StackMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.91f, 124.0f),
                    PathNode.CurveTo(233.10983f, 127.81752f, 231.80884f, 132.69516f, 228.0f, 134.91f),
                    PathNode.LineTo(132.0f, 190.91f),
                    PathNode.CurveTo(129.50958f, 192.36227f, 126.43041f, 192.36227f, 123.94f, 190.91f),
                    PathNode.LineTo(27.94f, 134.91f),
                    PathNode.CurveTo(24.187956f, 132.65532f, 22.944714f, 127.803764f, 25.150005f, 124.02249f),
                    PathNode.CurveTo(27.355297f, 120.24121f, 32.190132f, 118.93447f, 36.0f, 121.09f),
                    PathNode.LineTo(128.0f, 174.74f),
                    PathNode.LineTo(220.0f, 121.09f),
                    PathNode.CurveTo(223.81752f, 118.89017f, 228.69514f, 120.19117f, 230.91f, 124.0f),
                    PathNode.Close,
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
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 192.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.CurveTo(179.58173f, 192.0f, 176.0f, 195.58173f, 176.0f, 200.0f),
                    PathNode.CurveTo(176.0f, 204.41827f, 179.58173f, 208.0f, 184.0f, 208.0f),
                    PathNode.LineTo(232.0f, 208.0f),
                    PathNode.CurveTo(236.41827f, 208.0f, 240.0f, 204.41827f, 240.0f, 200.0f),
                    PathNode.CurveTo(240.0f, 195.58173f, 236.41827f, 192.0f, 232.0f, 192.0f),
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
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _stackMinus!!
    }

private var _stackMinus: ImageVector? = null

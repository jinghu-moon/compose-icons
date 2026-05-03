package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorFillIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 160.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.LineTo(224.0f, 120.5f),
                    PathNode.CurveTo(225.63f, 121.31f, 227.29f, 122.07f, 229.0f, 122.76f),
                    PathNode.CurveTo(233.07431f, 124.32991f, 237.65485f, 122.34299f, 239.29243f, 118.29541f),
                    PathNode.CurveTo(240.93002f, 114.24784f, 239.01973f, 109.63482f, 235.0f, 107.93f),
                    PathNode.CurveTo(213.8004f, 99.419945f, 199.9324f, 78.84381f, 200.0f, 56.0f),
                    PathNode.CurveTo(200.0f, 51.581722f, 196.41827f, 48.0f, 192.0f, 48.0f),
                    PathNode.CurveTo(187.58173f, 48.0f, 184.0f, 51.581722f, 184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 86.92794f, 158.92795f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(97.07206f, 112.0f, 72.0f, 86.92794f, 72.0f, 56.0f),
                    PathNode.CurveTo(72.0f, 51.581722f, 68.41828f, 48.0f, 64.0f, 48.0f),
                    PathNode.CurveTo(59.581722f, 48.0f, 56.0f, 51.581722f, 56.0f, 56.0f),
                    PathNode.CurveTo(56.067593f, 78.84381f, 42.199608f, 99.419945f, 21.0f, 107.93f),
                    PathNode.CurveTo(16.980278f, 109.63482f, 15.069971f, 114.24784f, 16.707561f, 118.29541f),
                    PathNode.CurveTo(18.34515f, 122.34299f, 22.925695f, 124.32991f, 27.0f, 122.76f),
                    PathNode.CurveTo(28.71f, 122.07f, 30.37f, 121.31f, 32.0f, 120.5f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.LineTo(24.6f, 160.0f),
                    PathNode.CurveTo(18.29f, 160.0f, 16.0f, 164.78f, 16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 172.41827f, 19.581722f, 176.0f, 24.0f, 176.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.CurveTo(56.0f, 204.41827f, 59.581722f, 208.0f, 64.0f, 208.0f),
                    PathNode.CurveTo(68.41828f, 208.0f, 72.0f, 204.41827f, 72.0f, 200.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.CurveTo(184.0f, 204.41827f, 187.58173f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(196.41827f, 208.0f, 200.0f, 204.41827f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(236.41827f, 176.0f, 240.0f, 172.41827f, 240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 163.58173f, 236.41827f, 160.0f, 232.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 152.0f),
                    PathNode.CurveTo(72.0f, 156.41827f, 68.41828f, 160.0f, 64.0f, 160.0f),
                    PathNode.CurveTo(59.581722f, 160.0f, 56.0f, 156.41827f, 56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 104.12f),
                    PathNode.CurveTo(56.0f, 99.70172f, 59.581722f, 96.12f, 64.0f, 96.12f),
                    PathNode.CurveTo(68.41828f, 96.12f, 72.0f, 99.70172f, 72.0f, 104.12f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 152.0f),
                    PathNode.CurveTo(112.0f, 156.41827f, 108.41828f, 160.0f, 104.0f, 160.0f),
                    PathNode.CurveTo(99.58172f, 160.0f, 96.0f, 156.41827f, 96.0f, 152.0f),
                    PathNode.LineTo(96.0f, 132.32f),
                    PathNode.CurveTo(96.0f, 127.901726f, 99.58172f, 124.32f, 104.0f, 124.32f),
                    PathNode.CurveTo(108.41828f, 124.32f, 112.0f, 127.901726f, 112.0f, 132.32f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.CurveTo(160.0f, 156.41827f, 156.41827f, 160.0f, 152.0f, 160.0f),
                    PathNode.CurveTo(147.58173f, 160.0f, 144.0f, 156.41827f, 144.0f, 152.0f),
                    PathNode.LineTo(144.0f, 132.32f),
                    PathNode.CurveTo(144.0f, 127.901726f, 147.58173f, 124.32f, 152.0f, 124.32f),
                    PathNode.CurveTo(156.41827f, 124.32f, 160.0f, 127.901726f, 160.0f, 132.32f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 156.41827f, 196.41827f, 160.0f, 192.0f, 160.0f),
                    PathNode.CurveTo(187.58173f, 160.0f, 184.0f, 156.41827f, 184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 104.12f),
                    PathNode.CurveTo(184.0f, 99.70172f, 187.58173f, 96.12f, 192.0f, 96.12f),
                    PathNode.CurveTo(196.41827f, 96.12f, 200.0f, 99.70172f, 200.0f, 104.12f),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null

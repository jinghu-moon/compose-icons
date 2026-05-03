package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorFillIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.77f, 53.89f),
                    PathNode.CurveTo(181.40697f, 34.715855f, 155.25021f, 23.972063f, 128.0f, 24.0f),
                    PathNode.LineTo(126.93f, 24.0f),
                    PathNode.CurveTo(69.91068f, 24.586672f, 23.996983f, 70.97767f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 171.0f, 50.58f, 207.06f, 93.36f, 222.17f),
                    PathNode.CurveTo(103.15099f, 225.6219f, 114.008125f, 224.10948f, 122.48295f, 218.11311f),
                    PathNode.CurveTo(130.95778f, 212.11673f, 135.99698f, 202.38168f, 136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 183.16344f, 143.16344f, 176.0f, 152.0f, 176.0f),
                    PathNode.LineTo(198.21f, 176.0f),
                    PathNode.CurveTo(213.16565f, 176.07239f, 226.15196f, 165.71664f, 229.41f, 151.12f),
                    PathNode.CurveTo(231.19815f, 143.24701f, 232.06729f, 135.19322f, 232.0f, 127.12f),
                    PathNode.CurveTo(231.79427f, 99.517426f, 220.5477f, 73.14582f, 200.77f, 53.89f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 168.0f),
                    PathNode.CurveTo(77.37258f, 168.0f, 72.0f, 162.62741f, 72.0f, 156.0f),
                    PathNode.CurveTo(72.0f, 149.37259f, 77.37258f, 144.0f, 84.0f, 144.0f),
                    PathNode.CurveTo(90.62742f, 144.0f, 96.0f, 149.37259f, 96.0f, 156.0f),
                    PathNode.CurveTo(96.0f, 162.62741f, 90.62742f, 168.0f, 84.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 112.0f),
                    PathNode.CurveTo(77.37258f, 112.0f, 72.0f, 106.62742f, 72.0f, 100.0f),
                    PathNode.CurveTo(72.0f, 93.37258f, 77.37258f, 88.0f, 84.0f, 88.0f),
                    PathNode.CurveTo(90.62742f, 88.0f, 96.0f, 93.37258f, 96.0f, 100.0f),
                    PathNode.CurveTo(96.0f, 106.62742f, 90.62742f, 112.0f, 84.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 88.0f),
                    PathNode.CurveTo(121.37258f, 88.0f, 116.0f, 82.62742f, 116.0f, 76.0f),
                    PathNode.CurveTo(116.0f, 69.37258f, 121.37258f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(134.62741f, 64.0f, 140.0f, 69.37258f, 140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 82.62742f, 134.62741f, 88.0f, 128.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 112.0f),
                    PathNode.CurveTo(165.37259f, 112.0f, 160.0f, 106.62742f, 160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 93.37258f, 165.37259f, 88.0f, 172.0f, 88.0f),
                    PathNode.CurveTo(178.62741f, 88.0f, 184.0f, 93.37258f, 184.0f, 100.0f),
                    PathNode.CurveTo(184.0f, 106.62742f, 178.62741f, 112.0f, 172.0f, 112.0f),
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
        return _palette!!
    }

private var _palette: ImageVector? = null

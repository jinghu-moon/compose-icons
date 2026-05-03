package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Palette: ImageVector
    get() {
        if (_palette != null) return _palette!!
        _palette = phosphorDuotoneIcon(
            name = "Palette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 127.17f),
                    PathNode.CurveTo(224.06364f, 134.63087f, 223.26161f, 142.07396f, 221.61f, 149.35f),
                    PathNode.CurveTo(219.11443f, 160.2634f, 209.4051f, 168.0018f, 198.21f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(138.74516f, 168.0f, 128.0f, 178.74516f, 128.0f, 192.0f),
                    PathNode.CurveTo(127.99435f, 199.78816f, 124.20994f, 207.08934f, 117.8493f, 211.58353f),
                    PathNode.CurveTo(111.48866f, 216.07771f, 103.34275f, 217.20605f, 96.0f, 214.61f),
                    PathNode.CurveTo(58.73f, 201.44f, 32.0f, 169.81f, 32.0f, 128.0f),
                    PathNode.CurveTo(31.997145f, 75.368744f, 74.371605f, 32.54824f, 127.0f, 32.0f),
                    PathNode.CurveTo(179.84f, 31.47f, 223.55f, 74.35f, 224.0f, 127.17f),
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
                    PathNode.MoveTo(213.77f, 147.6f),
                    PathNode.CurveTo(212.13313f, 154.87091f, 205.66283f, 160.02719f, 198.21f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(134.32689f, 160.0f, 120.0f, 174.32689f, 120.0f, 192.0f),
                    PathNode.CurveTo(119.99249f, 197.1857f, 117.47222f, 202.04616f, 113.23826f, 205.04033f),
                    PathNode.CurveTo(109.004295f, 208.0345f, 103.581795f, 208.79102f, 98.69f, 207.07f),
                    PathNode.CurveTo(62.49f, 194.3f, 40.0f, 164.0f, 40.0f, 128.0f),
                    PathNode.CurveTo(39.99742f, 79.75211f, 78.84469f, 40.498928f, 127.09f, 40.0f),
                    PathNode.LineTo(127.99f, 40.0f),
                    PathNode.CurveTo(176.2216f, 40.187336f, 215.38985f, 79.02177f, 215.99f, 127.25f),
                    PathNode.CurveTo(216.04955f, 134.09465f, 215.31801f, 140.92326f, 213.81f, 147.6f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 82.62742f, 134.62741f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(121.37258f, 88.0f, 116.0f, 82.62742f, 116.0f, 76.0f),
                    PathNode.CurveTo(116.0f, 69.37258f, 121.37258f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(134.62741f, 64.0f, 140.0f, 69.37258f, 140.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 100.0f),
                    PathNode.CurveTo(96.0f, 106.62742f, 90.62742f, 112.0f, 84.0f, 112.0f),
                    PathNode.CurveTo(77.37258f, 112.0f, 72.0f, 106.62742f, 72.0f, 100.0f),
                    PathNode.CurveTo(72.0f, 93.37258f, 77.37258f, 88.0f, 84.0f, 88.0f),
                    PathNode.CurveTo(90.62742f, 88.0f, 96.0f, 93.37258f, 96.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 156.0f),
                    PathNode.CurveTo(96.0f, 162.62741f, 90.62742f, 168.0f, 84.0f, 168.0f),
                    PathNode.CurveTo(77.37258f, 168.0f, 72.0f, 162.62741f, 72.0f, 156.0f),
                    PathNode.CurveTo(72.0f, 149.37259f, 77.37258f, 144.0f, 84.0f, 144.0f),
                    PathNode.CurveTo(90.62742f, 144.0f, 96.0f, 149.37259f, 96.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 100.0f),
                    PathNode.CurveTo(184.0f, 106.62742f, 178.62741f, 112.0f, 172.0f, 112.0f),
                    PathNode.CurveTo(165.37259f, 112.0f, 160.0f, 106.62742f, 160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 93.37258f, 165.37259f, 88.0f, 172.0f, 88.0f),
                    PathNode.CurveTo(178.62741f, 88.0f, 184.0f, 93.37258f, 184.0f, 100.0f),
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
        return _palette!!
    }

private var _palette: ImageVector? = null

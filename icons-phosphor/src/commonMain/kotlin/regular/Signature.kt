package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = phosphorRegularIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 168.0f),
                    PathNode.LineTo(63.86f, 168.0f),
                    PathNode.CurveTo(66.52f, 162.76f, 69.19f, 157.37f, 71.86f, 151.89f),
                    PathNode.CurveTo(86.86f, 153.54f, 104.44f, 143.11f, 124.52f, 120.75f),
                    PathNode.CurveTo(129.52f, 134.21f, 138.97f, 151.68f, 155.1f, 152.0f),
                    PathNode.CurveTo(164.16f, 152.18f, 173.21f, 146.8f, 182.52f, 135.63f),
                    PathNode.CurveTo(189.31f, 143.75f, 203.3f, 152.0f, 232.0f, 152.0f),
                    PathNode.CurveTo(236.41827f, 152.0f, 240.0f, 148.41827f, 240.0f, 144.0f),
                    PathNode.CurveTo(240.0f, 139.58173f, 236.41827f, 136.0f, 232.0f, 136.0f),
                    PathNode.CurveTo(201.57f, 136.0f, 192.57f, 125.55f, 192.0f, 119.89f),
                    PathNode.CurveTo(192.18552f, 116.35651f, 189.92976f, 113.15466f, 186.54f, 112.14f),
                    PathNode.CurveTo(183.0224f, 111.08323f, 179.23285f, 112.513016f, 177.29f, 115.63f),
                    PathNode.CurveTo(165.22f, 134.17f, 157.91f, 136.06f, 155.37f, 136.0f),
                    PathNode.CurveTo(147.11f, 135.84f, 138.71f, 116.48f, 135.83f, 102.58f),
                    PathNode.CurveTo(135.20265f, 99.540794f, 132.87425f, 97.13858f, 129.85611f, 96.41671f),
                    PathNode.CurveTo(126.83795f, 95.69484f, 123.67461f, 96.783554f, 121.74f, 99.21f),
                    PathNode.CurveTo(101.54f, 124.55f, 88.0f, 133.08f, 79.57f, 135.29f),
                    PathNode.CurveTo(88.06f, 116.42f, 94.4f, 99.85f, 98.46f, 85.9f),
                    PathNode.CurveTo(105.28f, 62.46f, 105.78f, 46.07f, 99.97f, 35.8f),
                    PathNode.CurveTo(96.97f, 30.42f, 90.63f, 24.0f, 77.91f, 24.0f),
                    PathNode.CurveTo(61.85f, 24.0f, 49.18f, 39.18f, 43.14f, 65.65f),
                    PathNode.CurveTo(39.55f, 81.36f, 38.96f, 98.86f, 41.52f, 113.65f),
                    PathNode.CurveTo(44.08f, 128.44f, 49.39f, 139.2f, 57.11f, 145.59f),
                    PathNode.CurveTo(53.38f, 153.31f, 49.58f, 160.85f, 45.88f, 168.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(19.581722f, 168.0f, 16.0f, 171.58173f, 16.0f, 176.0f),
                    PathNode.CurveTo(16.0f, 180.41827f, 19.581722f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(37.41f, 184.0f),
                    PathNode.CurveTo(26.09f, 205.0f, 17.29f, 219.64f, 17.15f, 219.88f),
                    PathNode.CurveTo(15.59741f, 222.33229f, 15.494834f, 225.43315f, 16.881964f, 227.9827f),
                    PathNode.CurveTo(18.269093f, 230.53223f, 20.928308f, 232.13048f, 23.830631f, 232.15898f),
                    PathNode.CurveTo(26.732954f, 232.1875f, 29.423054f, 230.64178f, 30.86f, 228.12f),
                    PathNode.CurveTo(31.01f, 227.86f, 42.13f, 209.33f, 55.56f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(236.41827f, 184.0f, 240.0f, 180.41827f, 240.0f, 176.0f),
                    PathNode.CurveTo(240.0f, 171.58173f, 236.41827f, 168.0f, 232.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.74f, 69.21f),
                    PathNode.CurveTo(62.72f, 51.74f, 70.43f, 40.0f, 77.91f, 40.0f),
                    PathNode.CurveTo(83.24f, 40.0f, 85.01f, 41.86f, 86.04f, 43.67f),
                    PathNode.CurveTo(89.04f, 49.0f, 92.56f, 67.86f, 64.38f, 130.06f),
                    PathNode.CurveTo(56.12f, 118.78f, 53.31f, 93.0f, 58.74f, 69.21f),
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
        return _signature!!
    }

private var _signature: ImageVector? = null

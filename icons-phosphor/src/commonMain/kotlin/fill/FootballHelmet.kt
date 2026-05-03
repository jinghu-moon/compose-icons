package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorFillIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.LineTo(165.8f, 160.0f),
                    PathNode.LineTo(158.71f, 136.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 132.41827f, 224.0f, 128.0f),
                    PathNode.LineTo(224.0f, 124.0f),
                    PathNode.CurveTo(224.0027f, 97.23048f, 213.27231f, 71.5775f, 194.21043f, 52.7825f),
                    PathNode.CurveTo(175.14854f, 33.987507f, 149.34682f, 23.619873f, 122.58f, 24.0f),
                    PathNode.CurveTo(68.24f, 24.77f, 24.0f, 69.61f, 24.0f, 124.0f),
                    PathNode.CurveTo(23.99707f, 157.04982f, 40.323784f, 187.96652f, 67.62f, 206.6f),
                    PathNode.CurveTo(68.95103f, 207.51176f, 70.526634f, 207.99979f, 72.14f, 208.0f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.CurveTo(124.8531f, 208.00024f, 129.44402f, 205.79778f, 132.48094f, 202.01231f),
                    PathNode.CurveTo(135.51787f, 198.22685f, 136.67252f, 193.2676f, 135.62f, 188.53f),
                    PathNode.CurveTo(135.57932f, 188.34755f, 135.52925f, 188.1673f, 135.47f, 187.99f),
                    PathNode.LineTo(131.91f, 175.99f),
                    PathNode.LineTo(153.84f, 175.99f),
                    PathNode.LineTo(164.63f, 212.52f),
                    PathNode.CurveTo(166.66528f, 219.3145f, 172.90726f, 223.97668f, 180.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(224.83656f, 224.0f, 232.0f, 216.83656f, 232.0f, 208.0f),
                    PathNode.LineTo(232.0f, 176.0f),
                    PathNode.CurveTo(232.0f, 167.16344f, 224.83656f, 160.0f, 216.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 176.0f),
                    PathNode.CurveTo(77.37258f, 176.0f, 72.0f, 170.62741f, 72.0f, 164.0f),
                    PathNode.CurveTo(72.0f, 157.37259f, 77.37258f, 152.0f, 84.0f, 152.0f),
                    PathNode.CurveTo(90.62742f, 152.0f, 96.0f, 157.37259f, 96.0f, 164.0f),
                    PathNode.CurveTo(96.0f, 170.62741f, 90.62742f, 176.0f, 84.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(127.16f, 160.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(142.0f, 136.0f),
                    PathNode.LineTo(149.09f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 208.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.LineTo(170.54f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null

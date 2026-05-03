package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorFillIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.33f, 103.67f),
                    PathNode.LineTo(183.56f, 29.74f),
                    PathNode.CurveTo(182.55817f, 26.338144f, 179.43631f, 24.001835f, 175.89f, 24.0f),
                    PathNode.LineTo(80.11f, 24.0f),
                    PathNode.CurveTo(76.56369f, 24.001835f, 73.44183f, 26.338144f, 72.44f, 29.74f),
                    PathNode.LineTo(50.67f, 103.67f),
                    PathNode.CurveTo(43.702484f, 126.7853f, 50.45462f, 151.85191f, 68.09f, 168.34f),
                    PathNode.CurveTo(82.31187f, 181.67508f, 100.58357f, 189.87286f, 120.0f, 191.63f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.LineTo(88.0f, 232.0f),
                    PathNode.CurveTo(83.58172f, 232.0f, 80.0f, 235.58173f, 80.0f, 240.0f),
                    PathNode.CurveTo(80.0f, 244.41827f, 83.58172f, 248.0f, 88.0f, 248.0f),
                    PathNode.LineTo(168.0f, 248.0f),
                    PathNode.CurveTo(172.41827f, 248.0f, 176.0f, 244.41827f, 176.0f, 240.0f),
                    PathNode.CurveTo(176.0f, 235.58173f, 172.41827f, 232.0f, 168.0f, 232.0f),
                    PathNode.LineTo(136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 191.63f),
                    PathNode.CurveTo(155.41684f, 189.87436f, 173.689f, 181.67635f, 187.91f, 168.34f),
                    PathNode.CurveTo(205.54117f, 151.8494f, 212.2926f, 126.78538f, 205.33f, 103.67f),
                    PathNode.Close,
                    PathNode.MoveTo(86.09f, 40.0f),
                    PathNode.LineTo(169.91f, 40.0f),
                    PathNode.LineTo(190.0f, 108.19f),
                    PathNode.CurveTo(190.09f, 108.49f, 190.17f, 108.79f, 190.25f, 109.09f),
                    PathNode.CurveTo(168.83f, 116.77f, 144.71f, 107.49f, 131.62f, 100.86f),
                    PathNode.CurveTo(106.43f, 88.11f, 86.43f, 86.49f, 71.68f, 88.93f),
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
        return _wine!!
    }

private var _wine: ImageVector? = null

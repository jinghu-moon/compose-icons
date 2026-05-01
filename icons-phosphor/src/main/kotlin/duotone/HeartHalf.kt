package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorDuotoneIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.LineTo(128.0f, 224.0f),
                    PathNode.CurveTo(128.0f, 224.0f, 24.0f, 168.0f, 24.0f, 102.0f),
                    PathNode.CurveTo(24.0f, 72.17662f, 48.176624f, 48.0f, 78.0f, 48.0f),
                    PathNode.CurveTo(100.59f, 48.0f, 119.94f, 60.31f, 128.0f, 80.0f),
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
                    PathNode.MoveTo(178.0f, 40.0f),
                    PathNode.CurveTo(157.35f, 40.0f, 139.27f, 48.88f, 128.0f, 63.89f),
                    PathNode.CurveTo(116.73f, 48.88f, 98.65f, 40.0f, 78.0f, 40.0f),
                    PathNode.CurveTo(43.774338f, 40.03858f, 16.038576f, 67.77434f, 16.0f, 102.0f),
                    PathNode.CurveTo(16.0f, 172.0f, 119.79f, 228.67f, 124.21f, 231.0f),
                    PathNode.CurveTo(126.57634f, 232.27296f, 129.42366f, 232.27296f, 131.79f, 231.0f),
                    PathNode.CurveTo(136.21f, 228.67f, 240.0f, 172.0f, 240.0f, 102.0f),
                    PathNode.CurveTo(239.96143f, 67.77434f, 212.22566f, 40.03858f, 178.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 102.0f),
                    PathNode.CurveTo(32.033054f, 76.608604f, 52.608604f, 56.033054f, 78.0f, 56.0f),
                    PathNode.CurveTo(96.91f, 56.0f, 112.86f, 65.79f, 120.0f, 81.65f),
                    PathNode.LineTo(120.0f, 210.0f),
                    PathNode.CurveTo(93.59f, 193.44f, 32.0f, 149.78f, 32.0f, 102.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 210.0f),
                    PathNode.LineTo(136.0f, 81.65f),
                    PathNode.CurveTo(143.14f, 65.79f, 159.09f, 56.0f, 178.0f, 56.0f),
                    PathNode.CurveTo(203.39139f, 56.033054f, 223.96695f, 76.608604f, 224.0f, 102.0f),
                    PathNode.CurveTo(224.0f, 149.71f, 162.42f, 193.41f, 136.0f, 210.0f),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
